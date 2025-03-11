package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.UtilityVehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.UtilityVehicle;

public class UtilityVehicleMapper implements IVehicleMapper<UtilityVehicle, UtilityVehicleDTO> {

    @Override
    public UtilityVehicleDTO toDTO(UtilityVehicle vehicle) {
        return new UtilityVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getYear(),
                vehicle.getPrice(),
                vehicle.getMileage(),
                vehicle.getState(),
                vehicle.getDisponibility(),
                vehicle.getCategory(),
                vehicle.getImage(),
                vehicle.getTrunkSize(),
                vehicle.getSpecialEquipment()
        );
    }

    @Override
    public UtilityVehicle toEntity(UtilityVehicleDTO dto) {
        return new UtilityVehicle(
                dto.getId(),
                dto.getBrand(),
                dto.getModel(),
                dto.getYear(),
                dto.getPrice(),
                dto.getMileage(),
                dto.getState(),
                dto.getDisponibility(),
                dto.getCategory(),
                dto.getImage(),
                dto.getTrunkSize(),
                dto.getSpecialEquipment()
        );
    }
}
