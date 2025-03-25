package com.edu.unbosque.bosquecar.model.persistence.dao;

import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;

import java.util.List;

public interface IVehicleDAO extends IGenericsDAO<Vehicle, Integer> {
    List<Vehicle> findByAvailability(VehicleDisponibility availability);
    List<Vehicle> findByStatus(VehicleState status);
}
