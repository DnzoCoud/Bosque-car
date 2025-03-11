package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import com.edu.unbosque.bosquecar.model.persistence.impl.VehicleDAOImpl;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;

import java.util.List;

public class VehicleService implements IVehicleService {
    private IVehicleDAO vehicleDAO = new VehicleDAOImpl();

    @Override
    public List<VehicleDTO> findAllVehicles() {
        return List.of();
    }

    @Override
    public void saveVehicle(VehicleDTO vehicle) {

    }

    @Override
    public VehicleDTO findVehicleById(int id) {
        return null;
    }

    @Override
    public void deleteVehicle(int id) {

    }

}
