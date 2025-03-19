package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;

public abstract class VehicleDTO {
    private int id;
    private String brand;
    private String model;
    private double price;
    private int mileage;
    private VehicleState state;
    private VehicleDisponibility disponibility;
    private CategoryDTO category;
    private String image;

    public VehicleDTO(int id, String brand, String model, double price, int mileage, VehicleState state, VehicleDisponibility disponibility, CategoryDTO category, String image) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.state = state;
        this.disponibility = disponibility;
        this.category = category;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public VehicleState getState() {
        return state;
    }

    public VehicleDisponibility getDisponibility() {
        return disponibility;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }
}
