package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.persistence.dao.IGenericsDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;

import java.util.ArrayList;
import java.util.List;


public class VehicleDAOImpl implements IVehicleDAO {

    private List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public void save(Vehicle entity) {
        vehicles.add(entity);
    }

    @Override
    public void delete(Integer id) {
        Vehicle vehicle = this.findById(id);
        if(vehicle != null) {
            vehicles.remove(vehicle);
        }
    }

    @Override
    public Vehicle findById(Integer id) {
        return vehicles.stream().filter(v -> v.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Vehicle> findAll() {
        return new ArrayList<>(vehicles);
    }
}
