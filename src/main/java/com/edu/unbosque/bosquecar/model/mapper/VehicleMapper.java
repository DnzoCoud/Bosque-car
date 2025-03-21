package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.*;

public class VehicleMapper {
    public static VehicleDTO toDTO(Vehicle vehicle) {
        if (vehicle == null) {
            return null;
        }

        VehicleDTO dto = new VehicleDTO();
        dto.setId(vehicle.getId());
        dto.setBrand(vehicle.getBrand());
        dto.setModel(vehicle.getModel());
        dto.setPrice(vehicle.getPrice());
        dto.setMileage(vehicle.getMileage());
        dto.setStatus(vehicle.getStatus().name());
        dto.setAvailability(vehicle.getAvailability().name());
        dto.setCategoryId(vehicle.getCategory().getId());

        // Mapeo de atributos específicos por categoría
        if (vehicle instanceof CargoVehicle cargo) {
            dto.setCargoCapacity(cargo.getCargoCapacity());
            dto.setFuelType(cargo.getFuelType());
            dto.setTraction(cargo.getTraction());
        } else if (vehicle instanceof FamilyVehicle family) {
            dto.setPassengerCapacity(family.getPassengerCapacity());
            dto.setSpecialEquipment(family.getSpecialEquipment());
        } else if (vehicle instanceof UtilityVehicle utility) {
            dto.setTrunkSize(utility.getTrunkSize());
            dto.setSpecialEquipment(utility.getSpecialEquipment());
        }

        return dto;
    }

    public static Vehicle toEntity(VehicleDTO dto) {
        if (dto == null) {
            return null;
        }

        Vehicle vehicle;
        switch (dto.getCategoryId()) {
            case 1:
                CargoVehicle cargo = new CargoVehicle();
                cargo.setCargoCapacity(dto.getCargoCapacity());
                cargo.setFuelType(dto.getFuelType());
                cargo.setTraction(dto.getTraction());
                vehicle = cargo;
                break;
            case 2:
                FamilyVehicle family = new FamilyVehicle();
                family.setPassengerCapacity(dto.getPassengerCapacity());
                family.setSpecialEquipment(dto.getSpecialEquipment());
                vehicle = family;
                break;
            case 3:
                UtilityVehicle utility = new UtilityVehicle();
                utility.setTrunkSize(dto.getTrunkSize());
                utility.setSpecialEquipment(dto.getSpecialEquipment());
                vehicle = utility;
                break;
            default:
                throw new IllegalArgumentException("Unknown category ID");
        }

        vehicle.setId(dto.getId());
        vehicle.setBrand(dto.getBrand());
        vehicle.setModel(dto.getModel());
        vehicle.setPrice(dto.getPrice());
        vehicle.setMileage(dto.getMileage());
        vehicle.setStatus(VehicleState.valueOf(dto.getStatus().toUpperCase()));
        vehicle.setAvailability(VehicleDisponibility.valueOf(dto.getAvailability().toUpperCase()));

        return vehicle;
    }
}
