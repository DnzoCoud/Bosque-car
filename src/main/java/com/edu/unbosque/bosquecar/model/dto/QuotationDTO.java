package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.Customer;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;

import java.time.LocalDate;

public class QuotationDTO {
    
    private int id;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate date;
    
    public QuotationDTO(int id, Customer customer, Vehicle vehicle, LocalDate date) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle; 
        this.date = date;
    }
    
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public LocalDate getDate() {
        return date;
    }
    
    
}
