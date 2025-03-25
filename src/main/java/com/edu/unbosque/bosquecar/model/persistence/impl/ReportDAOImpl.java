package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.VehicleReport;
import com.edu.unbosque.bosquecar.model.persistence.dao.IReportDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class ReportDAOImpl implements IReportDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<VehicleReport> getMostRequestedVehicles() {
        String query = """
            SELECT v.id, v.brand, v.model, COUNT(DISTINCT c.id) AS quoteCount, COUNT(DISTINCT a.id) AS appoCount
            FROM Vehicle v
            LEFT JOIN Quotation c ON c.vehicle.id = v.id
            LEFT JOIN Appoinment a ON a.vehicle.id = v.id
            GROUP BY v.id, v.brand, v.model
        """;

        List<Object[]> results = entityManager.createQuery(query, Object[].class).getResultList();
        return results.stream()
                .map(row -> new VehicleReport(
                        (Integer) row[0],  // id
                        (String) row[1],   // brand
                        (String) row[2],   // model
                        ((Long) row[3]).intValue() + ((Long) row[4]).intValue()
                ))
                .sorted(Comparator.comparingInt(VehicleReport::getTotalCount).reversed())
                .toList();
    }
}
