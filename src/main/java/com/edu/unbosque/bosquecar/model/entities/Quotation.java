package com.edu.unbosque.bosquecar.model.entities;

//Hola
import java.time.LocalDate;

public class Quotation {
    private int id;
    private Customer customer;
    private Vehicle vehicle;
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
