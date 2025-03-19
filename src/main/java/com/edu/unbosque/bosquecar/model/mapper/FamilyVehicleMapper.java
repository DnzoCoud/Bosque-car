package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.FamilyVehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.FamilyVehicle;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;

public class FamilyVehicleMapper {

    public static FamilyVehicleDTO toDTO(FamilyVehicle vehicle) {
        return new FamilyVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getPrice(),
                vehicle.getMileage(),
                vehicle.getState(),
                vehicle.getDisponibility(),
                CategoryMapper.toDto(vehicle.getCategory()),
                vehicle.getImage(),
                vehicle.getPassengerCapacity(),
                vehicle.getSpecialEquipment()
        );
    }

    public static FamilyVehicle toEntity(FamilyVehicleDTO dto) {
        return new FamilyVehicle(
                dto.getId(),
                dto.getBrand(),
                dto.getModel(),
                dto.getPrice(),
                dto.getMileage(),
                dto.getState(),
                dto.getDisponibility(),
                CategoryMapper.toEntity(dto.getCategory()),
                dto.getImage(),
                dto.getPassengerCapacity(),
                dto.getSpecialEquipment()
        );
    }
}
