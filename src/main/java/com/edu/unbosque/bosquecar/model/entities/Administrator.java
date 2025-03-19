package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "administrador")
public class Administrator {
    @Id
    @Column(name = "id_admin")
    private int id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "email")
    private String email;

    public Administrator(){

    }
    public Administrator(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
