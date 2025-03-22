package com.edu.unbosque.bosquecar.model.dto;

import java.math.BigDecimal;

public class VehicleDTO {
    private Integer id;
    private String plate;
    private String brand;
    private String model;
    private double price;
    private Integer mileage;
    private String status;          // "nuevo" o "usado"
    private String availability;    // "disponible", "reservado", "vendido"
    private Integer categoryId;

    // Atributos específicos según la categoría
    private Integer cargoCapacity;
    private String fuelType;
    private String traction;
    private Integer passengerCapacity;
    private String securitySystem;
    private String confort;
    private String specialEquipment;
    private String trunkSize;
    private String versatility;

    public VehicleDTO(){}

    public VehicleDTO(Integer id, String plate, String brand, String model, double price, Integer mileage, String status, String availability, Integer categoryId, Integer cargoCapacity, String fuelType, String traction, Integer passengerCapacity, String securitySystem, String confort, String specialEquipment, String trunkSize, String versatility) {
        this.id = id;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.status = status;
        this.availability = availability;
        this.categoryId = categoryId;
        this.cargoCapacity = cargoCapacity;
        this.fuelType = fuelType;
        this.traction = traction;
        this.passengerCapacity = passengerCapacity;
        this.securitySystem = securitySystem;
        this.confort = confort;
        this.specialEquipment = specialEquipment;
        this.trunkSize = trunkSize;
        this.versatility = versatility;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(Integer cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = traction;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getSecuritySystem() {
        return securitySystem;
    }

    public void setSecuritySystem(String securitySystem) {
        this.securitySystem = securitySystem;
    }

    public String getConfort() {
        return confort;
    }

    public void setConfort(String confort) {
        this.confort = confort;
    }

    public String getSpecialEquipment() {
        return specialEquipment;
    }

    public void setSpecialEquipment(String specialEquipment) {
        this.specialEquipment = specialEquipment;
    }

    public String getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(String trunkSize) {
        this.trunkSize = trunkSize;
    }

    public String getVersatility() {
        return versatility;
    }

    public void setVersatility(String versatility) {
        this.versatility = versatility;
    }
}
