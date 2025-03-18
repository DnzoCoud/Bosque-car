package com.edu.unbosque.bosquecar.model.dto;

public class CustomerDTO {
    private int id;
    private String cedula;
    private String name;
    private String lastName;
    private int document;
    private String email;

    public CustomerDTO(int id, String cedula, String name, String lastName, int document, String email) {
        this.id = id;
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getDocument() {
        return document;
    }
    public String getEmail() {
        return email;
    }
    public String getCedula() { return cedula; }
}
