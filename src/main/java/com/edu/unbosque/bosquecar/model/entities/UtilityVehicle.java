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

    @Column(name = "versatilidad")
    private String versatility;

    public UtilityVehicle(){
        super();
    }

    public UtilityVehicle(Integer id, String brand, String model, Double price, Integer mileage, VehicleState status, VehicleDisponibility availability, Category category, String image, String trunkSize, String specialEquipment, String versatility) {
        super(id, brand, model, price, mileage, status, availability, category, image);
        this.trunkSize = trunkSize;
        this.specialEquipment = specialEquipment;
        this.versatility = versatility;
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

    public String getVersatility() {
        return versatility;
    }

    public void setVersatility(String versatility) {
        this.versatility = versatility;
    }
}
