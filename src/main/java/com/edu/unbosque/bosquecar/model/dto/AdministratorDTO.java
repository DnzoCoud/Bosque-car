package com.edu.unbosque.bosquecar.model.dto;

public class AdministratorDTO {
    private int id;
    private String name;
    private String email;
    private String password;

    public AdministratorDTO(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
