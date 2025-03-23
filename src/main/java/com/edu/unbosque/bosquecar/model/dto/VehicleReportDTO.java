package com.edu.unbosque.bosquecar.model.dto;

public class VehicleReportDTO {
    private int id;
    private String brand;
    private String model;
    private int totalCount;

    public VehicleReportDTO(int id, String brand, String model, int totalCount) {
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
