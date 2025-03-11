package com.edu.unbosque.bosquecar.model.entities;

public abstract class Vehicle {
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

    public Vehicle(int id, String brand, String model, int year, double price, String mileage, VehicleState state, VehicleDisponibility disponibility, String category, String image) {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public VehicleState getState() {
        return state;
    }

    public void setState(VehicleState state) {
        this.state = state;
    }

    public VehicleDisponibility getDisponibility() {
        return disponibility;
    }

    public void setDisponibility(VehicleDisponibility disponibility) {
        this.disponibility = disponibility;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
