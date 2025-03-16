package com.edu.unbosque.bosquecar.model.dto;

import com.edu.unbosque.bosquecar.model.entities.Customer;

import java.time.LocalDate;

public class AppoimentDTO {
    private int id;
    private Customer customer;
    private String reason;
    private LocalDate date;

    public AppoimentDTO(int id, Customer customer, String reason, LocalDate date) {
        this.id = id;
        this.customer = customer;
        this.reason = reason;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public String getReason() {
        return reason;
    }
    public LocalDate getDate() {
        return date;
    }

}
