package com.edu.unbosque.bosquecar.model.entities;

//Hola
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "cotizacion")
public class Quotation {
    @Id
    @Column(name = "id_cotizacion")
    private int id;
    @Column(name = "id_cliente")
    private Customer customer;
    @Column(name = "id_vehiculo")
    private Vehicle vehicle;
    @Column(name = "fecha_cotizacion")
    private LocalDate date;

    public Quotation(int id, Customer customer, Vehicle vehicle, LocalDate date) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
