package com.edu.unbosque.bosquecar.model.entities;

public class Report {
    private int id;
    private Vehicle vehicle;
    private int numberApplication;
    private int numberQuotation;

    public Report(int id, Vehicle vehicle, int numberApplication, int numberQuotation) {
        this.id = id;
        this.vehicle = vehicle;
        this.numberApplication = numberApplication;
        this.numberQuotation = numberQuotation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getNumberApplication() {
        return numberApplication;
    }

    public void setNumberApplication(int numberApplication) {
        this.numberApplication = numberApplication;
    }

    public int getNumberQuotation() {
        return numberQuotation;
    }

    public void setNumberQuotation(int numberQuotation) {
        this.numberQuotation = numberQuotation;
    }
}
