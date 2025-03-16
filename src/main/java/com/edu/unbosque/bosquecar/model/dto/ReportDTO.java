package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.Vehicle;

public class ReportDTO {
    private int id;
    private Vehicle vehicle;
    private int numberApplication;
    private int numberQuotation;

    public ReportDTO(int id, Vehicle vehicle, int numberApplication, int numberQuotation) {
        this.id = id;
        this.vehicle = vehicle;
        this.numberApplication = numberApplication;
        this.numberQuotation = numberQuotation;
    }
    public int getId() {
        return id;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public int getNumberApplication() {
        return numberApplication;
    }
    public int getNumberQuotation() {
        return numberQuotation;
    }
}
