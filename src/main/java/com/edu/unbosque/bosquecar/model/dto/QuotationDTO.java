package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.Customer;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;

import java.time.LocalDate;

public class QuotationDTO {
    
    private int id;
    private CustomerDTO customer;
    private VehicleDTO vehicle;
    private LocalDate date;

    public QuotationDTO() {}

    public QuotationDTO(int id, CustomerDTO customer, VehicleDTO vehicle, LocalDate date) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle; 
        this.date = date;
    }
    
    public int getId() {
        return id;
    }
    public CustomerDTO getCustomer() {
        return customer;
    }
    public VehicleDTO getVehicle() {
        return vehicle;
    }
    public LocalDate getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public void setVehicle(VehicleDTO vehicle) {
        this.vehicle = vehicle;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
