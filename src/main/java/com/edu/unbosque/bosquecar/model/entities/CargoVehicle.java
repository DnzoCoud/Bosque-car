package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CARGO")
public class CargoVehicle extends Vehicle {
    @Column(name = "capacidad_carga")
    private Integer loadCapacity;

    @Column(name = "tipo_combustible")
    private String fuelType;

    @Column(name = "traccion")
    private String traction;

    public CargoVehicle(){
        super();
    }

    public CargoVehicle(Integer id, String brand, String plate, String model, Double price, Integer mileage, VehicleState status, VehicleDisponibility availability, Category category , String image, Integer loadCapacity, String fuelType, String traction) {
        super(id, plate, brand, model, price, mileage, status, availability, category, image);
        this.loadCapacity = loadCapacity;
        this.fuelType = fuelType;
        this.traction = traction;
    }

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
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