package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "reporte")
public class Report {
    @Id
    @Column(name = "id_reporte")
    private int id;
    @Column(name = "id_vehiculo")
    private Vehicle vehicle;
    @Column(name = "numero_de_solicitud")
    private int numberApplication;
    @Column(name = "numero_de_cuota")
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
