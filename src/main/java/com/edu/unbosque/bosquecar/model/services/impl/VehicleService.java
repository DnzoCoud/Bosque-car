package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;
import com.edu.unbosque.bosquecar.model.mapper.VehicleMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class VehicleService implements IVehicleService {

    @Inject
    private IVehicleDAO vehicleDAO;

    @Override
    public void saveVehicle(VehicleDTO vehicle) {
        vehicleDAO.save(VehicleMapper.toEntity(vehicle));
    }

    @Override
    public void updateVehicle(VehicleDTO vehicle) {

    }

    @Override
    public void deleteVehicle(Integer id) {

    }

    @Override
    public VehicleDTO getVehicleById(Integer id) {
        return VehicleMapper.toDTO(vehicleDAO.findById(id));
    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return vehicleDAO.findAll()
                .stream()
                .map(VehicleMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleDTO> getVehiclesByAvailability(VehicleDisponibility availability) {
        return vehicleDAO.findByAvailability(availability)
                .stream()
                .map(VehicleMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleDTO> getVehiclesByStatus(VehicleState status) {
        return vehicleDAO.findByStatus(status)
                .stream()
                .map(VehicleMapper::toDTO)
                .collect(Collectors.toList());
    }
}
