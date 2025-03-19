package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.UtilityVehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.UtilityVehicle;

public class UtilityVehicleMapper{

    public static UtilityVehicleDTO toDTO(UtilityVehicle vehicle) {
        return new UtilityVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getPrice(),
                vehicle.getMileage(),
                vehicle.getState(),
                vehicle.getDisponibility(),
                CategoryMapper.toDto(vehicle.getCategory()),
                vehicle.getImage(),
                vehicle.getTrunkSize(),
                vehicle.getSpecialEquipment()
        );
    }

    public static UtilityVehicle toEntity(UtilityVehicleDTO dto) {
        return new UtilityVehicle(
                dto.getId(),
                dto.getBrand(),
                dto.getModel(),
                dto.getPrice(),
                dto.getMileage(),
                dto.getState(),
                dto.getDisponibility(),
                CategoryMapper.toEntity(dto.getCategory()),
                dto.getImage(),
                dto.getTrunkSize(),
                dto.getSpecialEquipment()
        );
    }
}
