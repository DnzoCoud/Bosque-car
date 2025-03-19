package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_vehiculo", discriminatorType = DiscriminatorType.STRING)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private int id;

    @Column(name = "marca")
    private String brand;

    @Column(name = "modelo")
    private String model;

    @Column(name = "precio")
    private double price;

    @Column(name = "kilometraje")
    private int mileage;

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private VehicleState state;

    @Column(name = "disponibilidad")
    @Enumerated(EnumType.STRING)
    private VehicleDisponibility disponibility;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Category category;
    @Column(nullable = true)
    private String image;

    public Vehicle() {  }

    public Vehicle(int id, String brand, String model, double price, int mileage, VehicleState state, VehicleDisponibility disponibility, Category category, String image) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.state = state;
        this.disponibility = disponibility;
        this.category = category;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public VehicleState getState() {
        return state;
    }

    public void setState(VehicleState state) {
        this.state = state;
    }

    public VehicleDisponibility getDisponibility() {
        return disponibility;
    }

    public void setDisponibility(VehicleDisponibility disponibility) {
        this.disponibility = disponibility;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
