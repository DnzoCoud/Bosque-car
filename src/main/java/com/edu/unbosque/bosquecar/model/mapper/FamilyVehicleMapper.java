package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.FamilyVehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.FamilyVehicle;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;

public class FamilyVehicleMapper implements IVehicleMapper<FamilyVehicle, FamilyVehicleDTO> {

    @Override
    public FamilyVehicleDTO toDTO(FamilyVehicle vehicle) {
        return new FamilyVehicleDTO(
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
                vehicle.getPassengerCapacity(),
                vehicle.getSpecialEquipment()
        );
    }

    @Override
    public FamilyVehicle toEntity(FamilyVehicleDTO dto) {
        return new FamilyVehicle(
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
                dto.getPassengerCapacity(),
                dto.getSpecialEquipment()
        );
    }
}
