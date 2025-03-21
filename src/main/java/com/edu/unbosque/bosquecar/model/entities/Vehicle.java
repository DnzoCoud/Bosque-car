package com.edu.unbosque.bosquecar.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "id_categoria", discriminatorType = DiscriminatorType.INTEGER)
@NamedQueries({
        @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v"),
        @NamedQuery(name = "Vehicle.findByDisponibility", query = "SELECT v FROM Vehicle v WHERE v.availability = :availability"),
        @NamedQuery(name = "Vehicle.findByState", query = "SELECT v FROM Vehicle v WHERE v.status = :status"),
})
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Integer id;

    @Column(name = "marca", nullable = false)
    private String brand;

    @Column(name = "modelo", nullable = false)
    private String model;

    @Column(name = "precio", nullable = false)
    private Double price;

    @Column(name = "kilometraje")
    private Integer mileage;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private VehicleState status; // "nuevo", "usado"

    @Enumerated(EnumType.STRING)
    @Column(name = "disponibilidad", nullable = false)
    private VehicleDisponibility availability; // "disponible", "reservado", "vendido"

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Category category;

    public Vehicle() {  }

    public Vehicle(Integer id, String brand, String model, Double price, Integer mileage, VehicleState status, VehicleDisponibility availability, Category category) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.status = status;
        this.availability = availability;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public VehicleState getStatus() {
        return status;
    }

    public void setStatus(VehicleState status) {
        this.status = status;
    }

    public VehicleDisponibility getAvailability() {
        return availability;
    }

    public void setAvailability(VehicleDisponibility availability) {
        this.availability = availability;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
