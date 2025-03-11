package com.edu.unbosque.bosquecar.model.entities;

public class UtilityVehicle extends Vehicle {
    private String trunkSize;
    private String specialEquipment;

    public UtilityVehicle(int id, String brand, String model, int year, double price, String mileage, VehicleState state, VehicleDisponibility disponibility, String category, String image, String trunkSize, String specialEquipment) {
        super(id, brand, model, year, price, mileage, state, disponibility, category, image);
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
