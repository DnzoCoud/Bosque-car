package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("1")
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

    public CargoVehicle(Integer id, String brand, String model, Double price, Integer mileage, VehicleState status, VehicleDisponibility availability, Category category, Integer loadCapacity, String fuelType, String traction) {
        super(id, brand, model, price, mileage, status, availability, category);
        this.loadCapacity = loadCapacity;
        this.fuelType = fuelType;
        this.traction = traction;
    }
}
