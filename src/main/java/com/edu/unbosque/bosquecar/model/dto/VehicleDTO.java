package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;

public abstract class VehicleDTO {
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String mileage;
    private VehicleState state;
    private VehicleDisponibility disponibility;
    private String category;
    private String image;

    public VehicleDTO(int id, String brand, String model, int year, double price, String mileage, VehicleState state, VehicleDisponibility disponibility, String category, String image) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getMileage() {
        return mileage;
    }

    public VehicleState getState() {
        return state;
    }

    public VehicleDisponibility getDisponibility() {
        return disponibility;
    }

    public String getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }
}
