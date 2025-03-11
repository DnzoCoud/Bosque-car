package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.CargoVehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.CargoVehicle;

public class CargoVehicleMapper implements IVehicleMapper<CargoVehicle, CargoVehicleDTO>{

    @Override
    public CargoVehicleDTO toDTO(CargoVehicle vehicle) {
        return new CargoVehicleDTO(
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
                vehicle.getCargoCapacity(),
                vehicle.getFuelType(),
                vehicle.getTraction()
        );
    }

    @Override
    public CargoVehicle toEntity(CargoVehicleDTO dto) {
        return new CargoVehicle(
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
                dto.getCargoCapacity(),
                dto.getFuelType(),
                dto.getTraction()
        );
    }
}
