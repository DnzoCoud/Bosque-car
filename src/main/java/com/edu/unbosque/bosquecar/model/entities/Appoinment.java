package com.edu.unbosque.bosquecar.model.entities;

import java.time.LocalDate;

public class Appoinment {
    private int id;
    private Customer customer;
    private String reason;
    private LocalDate date;

    public Appoinment(int id, Customer customer, String reason, LocalDate date) {
        this.id = id;
        this.customer = customer;
        this.reason = reason;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
