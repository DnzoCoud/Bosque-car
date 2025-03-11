package com.edu.unbosque.bosquecar.model.entities;

public class FamilyVehicle extends Vehicle {
    private int passengerCapacity;
    private String specialEquipment;

    public FamilyVehicle(int id, String brand, String model, int year, double price, String mileage, VehicleState state, VehicleDisponibility disponibility, String category, String image, int passengerCapacity, String specialEquipment) {
        super(id, brand, model, year, price, mileage, state, disponibility, category, image);
        this.passengerCapacity = passengerCapacity;
        this.specialEquipment = specialEquipment;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getSpecialEquipment() {
        return specialEquipment;
    }

    public void setSpecialEquipment(String specialEquipment) {
        this.specialEquipment = specialEquipment;
    }
}
