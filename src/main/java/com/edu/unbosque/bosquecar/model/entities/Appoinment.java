package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "cita")
@NamedQueries({
        @NamedQuery(name = "Appoinment.findAll", query = "SELECT a FROM Appoinment a")
})
public class Appoinment {
    @Id
    @Column(name = "id_cita")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehicle vehicle;

    @Column(name = "motivo")
    private String reason;

    @Column(name = "fecha")
    private LocalDate date;

    public Appoinment(){

    }
    public Appoinment(int id, Customer customer, Vehicle vehicle, String reason, LocalDate date) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
