package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;
import com.edu.unbosque.bosquecar.model.persistence.dao.IGenericsDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

@Stateless
public class VehicleDAOImpl implements IVehicleDAO {

    @PersistenceContext(name = "BosqueCarPU")
    protected EntityManager em;

    @Override
    public void save(Vehicle entity) {
        em.persist(entity);
    }

    @Override
    public void update(Integer id, Vehicle entity) {
        Vehicle vehicle = this.findById(id);
        if (vehicle != null) {
            em.merge(vehicle);
        }
    }

    @Override
    public void delete(Integer id) {
        Vehicle vehicle = this.findById(id);
        if(vehicle != null) {
            em.remove(vehicle);
        }
    }

    @Override
    public Vehicle findById(Integer id) {
        return em.find(Vehicle.class, id);
    }

    @Override
    public List<Vehicle> findAll() {
        return em.createNamedQuery("Vehicle.findAll", Vehicle.class).getResultList();
    }

    @Override
    public List<Vehicle> findByAvailability(VehicleDisponibility availability) {
        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.findByDisponibility", Vehicle.class);
        query.setParameter("availability", availability);
        return query.getResultList();
    }

    @Override
    public List<Vehicle> findByStatus(VehicleState status) {
        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.findByState", Vehicle.class);
        query.setParameter("status", status);
        return query.getResultList();
    }
}
