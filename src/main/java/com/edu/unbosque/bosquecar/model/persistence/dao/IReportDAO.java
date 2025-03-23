package com.edu.unbosque.bosquecar.model.persistence.dao;

import com.edu.unbosque.bosquecar.model.entities.VehicleReport;

import java.util.List;

public interface IReportDAO {
    List<VehicleReport> getMostRequestedVehicles();
}
