package com.edu.unbosque.bosquecar.model.dto;

public class CustomerDTO {
    private int id;
    private String cedula;
    private String name;
    private String lastName;
    private String email;

    public CustomerDTO(int id, String cedula, String name, String lastName, String email) {
        this.id = id;
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
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
    public String getEmail() {
        return email;
    }
    public String getCedula() { return cedula; }
}
