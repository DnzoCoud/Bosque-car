package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.CargoVehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.CargoVehicle;

public class CargoVehicleMapper{

    public static CargoVehicleDTO toDTO(CargoVehicle vehicle) {
        return new CargoVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getPrice(),
                vehicle.getMileage(),
                vehicle.getState(),
                vehicle.getDisponibility(),
                CategoryMapper.toDto(vehicle.getCategory()),
                vehicle.getImage(),
                vehicle.getCargoCapacity(),
                vehicle.getFuelType(),
                vehicle.getTraction()
        );
    }

    public static CargoVehicle toEntity(CargoVehicleDTO dto) {
        return new CargoVehicle(
                dto.getId(),
                dto.getBrand(),
                dto.getModel(),
                dto.getPrice(),
                dto.getMileage(),
                dto.getState(),
                dto.getDisponibility(),
                CategoryMapper.toEntity(dto.getCategory()),
                dto.getImage(),
                dto.getCargoCapacity(),
                dto.getFuelType(),
                dto.getTraction()
        );
    }
}
