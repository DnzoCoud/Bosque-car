package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;

public class UtilityVehicleDTO extends VehicleDTO {
    private String trunkSize;
    private String specialEquipment;

    public UtilityVehicleDTO(int id, String brand, String model, int year, double price, String mileage, VehicleState state, VehicleDisponibility disponibility, String category, String image, String trunkSize, String specialEquipment) {
        super(id, brand, model, year, price, mileage, state, disponibility, category, image);
        this.trunkSize = trunkSize;
        this.specialEquipment = specialEquipment;
    }

    public String getTrunkSize() {
        return trunkSize;
    }

    public String getSpecialEquipment() {
        return specialEquipment;
    }
}
