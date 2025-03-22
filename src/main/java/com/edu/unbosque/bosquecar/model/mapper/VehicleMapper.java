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
            dto.setCargoCapacity(cargo.getLoadCapacity());
            dto.setFuelType(cargo.getFuelType());
            dto.setTraction(cargo.getTraction());
        } else if (vehicle instanceof FamilyVehicle family) {
            dto.setPassengerCapacity(family.getPassengerCapacity());
            dto.setSecuritySystem(family.getSecuritySystem());
            dto.setConfort(family.getConfort());
        } else if (vehicle instanceof UtilityVehicle utility) {
            dto.setTrunkSize(utility.getTrunkSize());
            dto.setSpecialEquipment(utility.getSpecialEquipment());
            dto.setVersatility(utility.getVersatility());
        }

        return dto;
    }

    public static Vehicle toEntity(VehicleDTO dto) {
        if (dto == null) {
            return null;
        }

        Vehicle vehicle;
        switch (dto.getCategoryId()) {
            case 1: // Cargo vehicles
                CargoVehicle cargo = new CargoVehicle();
                cargo.setLoadCapacity(dto.getCargoCapacity());
                cargo.setFuelType(dto.getFuelType());
                cargo.setTraction(dto.getTraction());
                vehicle = cargo;
                break;
            case 2: // Family vehicle
                FamilyVehicle family = new FamilyVehicle();
                family.setPassengerCapacity(dto.getPassengerCapacity());
                family.setSecuritySystem(dto.getSecuritySystem());
                family.setConfort(dto.getConfort());
                vehicle = family;
                break;
            case 3: // Utility Vehicle
                UtilityVehicle utility = new UtilityVehicle();
                utility.setTrunkSize(dto.getTrunkSize());
                utility.setSpecialEquipment(dto.getSpecialEquipment());
                utility.setVersatility(dto.getVersatility());
                vehicle = utility;
                break;
            default:
                throw new IllegalArgumentException("Se desconoce la categoria ID");
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
