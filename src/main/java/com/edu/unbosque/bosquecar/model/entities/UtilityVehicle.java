package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("3")
public class UtilityVehicle extends Vehicle {
    @Column(name = "tamano_maletero")
    private String trunkSize;

    @Column(name = "equipo_especial")
    private String specialEquipment;

    public UtilityVehicle(){
        super();
    }

    public UtilityVehicle(Integer id, String brand, String model, Double price, Integer mileage, VehicleState status, VehicleDisponibility availability, Category category, String trunkSize, String specialEquipment) {
        super(id, brand, model, price, mileage, status, availability, category);
        this.trunkSize = trunkSize;
        this.specialEquipment = specialEquipment;
    }

    public String getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(String trunkSize) {
        this.trunkSize = trunkSize;
    }

    public String getSpecialEquipment() {
        return specialEquipment;
    }

    public void setSpecialEquipment(String specialEquipment) {
        this.specialEquipment = specialEquipment;
    }
}
