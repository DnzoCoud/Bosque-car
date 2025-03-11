package com.edu.unbosque.bosquecar.model.entities;

public class Customer {
    private int id;
    private String name;
    private String lastName;
    private int document;
    private String email;

    public Customer(int id, String name, String lastName, int document, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.document = document;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
