package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;

public class CargoVehicleDTO extends VehicleDTO {
    private int cargoCapacity;
    private String fuelType;
    private String traction;

    public CargoVehicleDTO(int id, String brand, String model, double price, int mileage, VehicleState state, VehicleDisponibility disponibility, CategoryDTO category, String image, int cargoCapacity, String fuelType, String traction) {
        super(id, brand, model, price, mileage, state, disponibility, category, image);
        this.cargoCapacity = cargoCapacity;
        this.fuelType = fuelType;
        this.traction = traction;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getTraction() {
        return traction;
    }
}
