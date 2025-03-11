package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;

public class FamilyVehicleDTO extends VehicleDTO {
    private int passengerCapacity;
    private String specialEquipment;

    public FamilyVehicleDTO(int id, String brand, String model, int year, double price, String mileage, VehicleState state, VehicleDisponibility disponibility, String category, String image, int passengerCapacity, String specialEquipment) {
        super(id, brand, model, year, price, mileage, state, disponibility, category, image);
        this.passengerCapacity = passengerCapacity;
        this.specialEquipment = specialEquipment;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public String getSpecialEquipment() {
        return specialEquipment;
    }
}
