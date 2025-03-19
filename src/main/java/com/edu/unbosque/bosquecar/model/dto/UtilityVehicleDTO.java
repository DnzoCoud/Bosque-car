package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;

public class UtilityVehicleDTO extends VehicleDTO {
    private String trunkSize;
    private String specialEquipment;

    public UtilityVehicleDTO(int id, String brand, String model, double price, int mileage, VehicleState state, VehicleDisponibility disponibility, CategoryDTO category, String image, String trunkSize, String specialEquipment) {
        super(id, brand, model, price, mileage, state, disponibility, category, image);
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
