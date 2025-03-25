package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.CategoryDTO;
import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;
import com.edu.unbosque.bosquecar.model.mapper.CategoryMapper;
import com.edu.unbosque.bosquecar.model.mapper.VehicleMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import com.edu.unbosque.bosquecar.model.services.abc.ICategoryService;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;
import jakarta.ejb.Stateless;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Part;
import org.primefaces.model.file.UploadedFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class VehicleService implements IVehicleService {

    @Inject
    private IVehicleDAO vehicleDAO;

    @Inject
    private ICategoryService categoryService;

    @Override
    public void saveVehicle(VehicleDTO vehicle) {
            CategoryDTO category = categoryService.getCategory(vehicle.getCategoryId());
            Vehicle vehicleToSave = VehicleMapper.toEntity(vehicle);
            vehicleToSave.setCategory(CategoryMapper.toEntity(category));
            vehicleDAO.save(vehicleToSave);
    }

    @Override
    public void updateVehicle(VehicleDTO vehicle) {
        CategoryDTO category = categoryService.getCategory(vehicle.getCategoryId());
        Vehicle vehicleToSave = VehicleMapper.toEntity(vehicle);
        vehicleToSave.setCategory(CategoryMapper.toEntity(category));
        vehicleDAO.update(vehicle.getId(), vehicleToSave);
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
