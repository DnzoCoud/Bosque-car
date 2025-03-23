package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.*;
import com.edu.unbosque.bosquecar.model.mapper.CategoryMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

@Stateless
public class VehicleDAOImpl implements IVehicleDAO {

    @PersistenceContext(name = "BosqueCarPU")
    protected EntityManager em;

    @Override
    public void save(Vehicle entity) {
        em.persist(entity);
    }

    @Override
    public void update(Integer id, Vehicle entity) {
        Vehicle vehicle = this.findById(id);
        if (vehicle != null) {
            // Obtén la categoría gestionada
            Category category = null;
            if (entity.getCategory() != null && entity.getCategory().getId() != null) {
                category = em.find(Category.class, entity.getCategory().getId());
            }

            entity = em.merge(entity);

            // Actualiza los campos de vehicle con los valores de entity
            vehicle.setPlate(entity.getPlate());
            vehicle.setBrand(entity.getBrand());
            vehicle.setModel(entity.getModel());
            vehicle.setPrice(entity.getPrice());
            vehicle.setMileage(entity.getMileage());
            vehicle.setStatus(entity.getStatus());
            vehicle.setAvailability(entity.getAvailability());
            vehicle.setImage(entity.getImage());

            // Asigna la categoría gestionada
            if (category != null) {
                vehicle.setCategory(category);
            }
            entity.setId(id);

            if (vehicle instanceof FamilyVehicle existingFamily && entity instanceof FamilyVehicle newFamily) {
                existingFamily.setPassengerCapacity(newFamily.getPassengerCapacity());
                existingFamily.setSecuritySystem(newFamily.getSecuritySystem());
                existingFamily.setConfort(newFamily.getConfort());
            }
            else if (vehicle instanceof CargoVehicle cargoVehicle && entity instanceof CargoVehicle newSport) {
                cargoVehicle.setLoadCapacity(newSport.getLoadCapacity());
                cargoVehicle.setFuelType(newSport.getFuelType());
                cargoVehicle.setTraction(newSport.getTraction());
            }
            else if (vehicle instanceof UtilityVehicle existingUtility && entity instanceof UtilityVehicle newCargo) {
                existingUtility.setTrunkSize(newCargo.getTrunkSize());
                existingUtility.setSpecialEquipment(newCargo.getSpecialEquipment());
                existingUtility.setVersatility(newCargo.getVersatility());
            }
            // Guarda los cambios
            em.merge(vehicle);
        }
    }

    @Override
    public void delete(Integer id) {
        Vehicle vehicle = this.findById(id);
        if(vehicle != null) {
            em.remove(vehicle);
        }
    }

    @Override
    public Vehicle findById(Integer id) {
        return em.find(Vehicle.class, id);
    }

    @Override
    public List<Vehicle> findAll() {
        return em.createNamedQuery("Vehicle.findAll", Vehicle.class).getResultList();
    }

    @Override
    public List<Vehicle> findByAvailability(VehicleDisponibility availability) {
        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.findByDisponibility", Vehicle.class);
        query.setParameter("availability", availability);
        return query.getResultList();
    }

    @Override
    public List<Vehicle> findByStatus(VehicleState status) {
        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.findByState", Vehicle.class);
        query.setParameter("status", status);
        return query.getResultList();
    }
}
