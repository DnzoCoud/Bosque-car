package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
@NamedQueries({
        @NamedQuery(name = "Customer.findAll", query = "SELECT v FROM Customer v"),
        @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email")
})
public class Customer {
    @Id
    private String cedula;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellido")
    private String lastName;
    private String email;

    public Customer(){

    }
    public Customer(String cedula, String name, String lastName, String email) {
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
