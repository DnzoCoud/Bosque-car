package com.edu.unbosque.bosquecar.model.entities;

public class VehicleReport {
    private int id;
    private String brand;
    private String model;
    private int totalCount;

    public VehicleReport(int id, String brand, String model, int totalCount) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.totalCount = totalCount;
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

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
