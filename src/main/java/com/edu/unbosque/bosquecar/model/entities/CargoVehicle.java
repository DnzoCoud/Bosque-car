package com.edu.unbosque.bosquecar.model.entities;

public class CargoVehicle extends Vehicle {
    private int cargoCapacity;
    private String fuelType;
    private String traction;

    public CargoVehicle(int id, String brand, String model, int year, double price, String mileage, VehicleState state, VehicleDisponibility disponibility, String category, String image, int cargoCapacity, String fuelType, String traction) {
        super(id, brand, model, year, price, mileage, state, disponibility, category, image);
        this.cargoCapacity = cargoCapacity;
        this.fuelType = fuelType;
        this.traction = traction;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = traction;
    }
}
