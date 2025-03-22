package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class FamilyVehicle extends Vehicle {
    @Column(name = "capacidad_pasajeros")
    private Integer passengerCapacity;

    @Column(name = "sistema_seguridad")
    private String securitySystem;

    @Column(name = "confort")
    private String confort;

    public FamilyVehicle(){}

    public FamilyVehicle(Integer id, String brand, String plate, String model, Double price, Integer mileage, VehicleState status, VehicleDisponibility availability, Category category, String image, Integer passengerCapacity, String securitySystem, String confort) {
        super(id, plate, brand, model, price, mileage, status, availability, category, image);
        this.passengerCapacity = passengerCapacity;
        this.securitySystem = securitySystem;
        this.confort = confort;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getSecuritySystem() {
        return securitySystem;
    }

    public void setSecuritySystem(String securitySystem) {
        this.securitySystem = securitySystem;
    }

    public String getConfort() {
        return confort;
    }

    public void setConfort(String confort) {
        this.confort = confort;
    }
}
