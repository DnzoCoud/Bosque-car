package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import com.edu.unbosque.bosquecar.model.persistence.impl.VehicleDAOImpl;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class VehicleService implements IVehicleService {

    @Inject
    private IVehicleDAO vehicleDAO;

    @Override
    public void saveVehicle(Vehicle vehicle) {

    }

    @Override
    public void updateVehicle(Vehicle vehicle) {

    }

    @Override
    public void deleteVehicle(Integer id) {

    }

    @Override
    public Vehicle getVehicleById(Integer id) {
        return null;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return List.of();
    }

    @Override
    public List<Vehicle> getVehiclesByAvailability(VehicleDisponibility availability) {
        return List.of();
    }

    @Override
    public List<Vehicle> getVehiclesByStatus(VehicleState status) {
        return List.of();
    }
}
