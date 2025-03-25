package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.*;
import com.edu.unbosque.bosquecar.model.mapper.CategoryMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

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
    @Transactional
    public void update(Integer id, Vehicle entity) {
        Vehicle existingVehicle = this.findById(id);
        if (existingVehicle != null) {
            existingVehicle.setPlate(entity.getPlate());
            existingVehicle.setBrand(entity.getBrand());
            existingVehicle.setModel(entity.getModel());
            existingVehicle.setPrice(entity.getPrice());
            existingVehicle.setMileage(entity.getMileage());

            if (entity.getStatus() != null) {
                existingVehicle.setStatus(entity.getStatus());
            }
            if (entity.getAvailability() != null) {
                existingVehicle.setAvailability(entity.getAvailability());
            }
            existingVehicle.setImage(entity.getImage());

            if (entity.getCategory() != null && entity.getCategory().getId() != null) {
                Category category = em.find(Category.class, entity.getCategory().getId());
                if (!existingVehicle.getCategory().getId().equals(category.getId())) {
                    if (existingVehicle instanceof FamilyVehicle) {
                        FamilyVehicle existingFamilyVehicle = (FamilyVehicle) existingVehicle;
                        existingFamilyVehicle.setPassengerCapacity(null);
                        existingFamilyVehicle.setSecuritySystem(null);
                        existingFamilyVehicle.setConfort(null);
                    } else if (existingVehicle instanceof CargoVehicle) {
                        CargoVehicle existingCargoVehicle = (CargoVehicle) existingVehicle;
                        existingCargoVehicle.setLoadCapacity(null);
                        existingCargoVehicle.setFuelType(null);
                        existingCargoVehicle.setTraction(null);
                    } else if (existingVehicle instanceof UtilityVehicle) {
                        UtilityVehicle existingUtilityVehicle = (UtilityVehicle) existingVehicle;
                        existingUtilityVehicle.setTrunkSize(null);
                        existingUtilityVehicle.setSpecialEquipment(null);
                        existingUtilityVehicle.setVersatility(null);
                    }
                }
                existingVehicle.setCategory(category);
            }

            if (existingVehicle instanceof FamilyVehicle && entity instanceof FamilyVehicle) {
                FamilyVehicle existingFamilyVehicle = (FamilyVehicle) existingVehicle;
                FamilyVehicle newFamilyVehicle = (FamilyVehicle) entity;

                existingFamilyVehicle.setPassengerCapacity(newFamilyVehicle.getPassengerCapacity());
                existingFamilyVehicle.setSecuritySystem(newFamilyVehicle.getSecuritySystem());
                existingFamilyVehicle.setConfort(newFamilyVehicle.getConfort());
            } else if (existingVehicle instanceof CargoVehicle && entity instanceof CargoVehicle) {
                CargoVehicle existingCargo = (CargoVehicle) existingVehicle;
                CargoVehicle newCargoVehicle = (CargoVehicle) entity;

                existingCargo.setLoadCapacity(newCargoVehicle.getLoadCapacity());
                existingCargo.setFuelType(newCargoVehicle.getFuelType());
                existingCargo.setTraction(newCargoVehicle.getTraction());
            } else{
                UtilityVehicle existingUtility = (UtilityVehicle) existingVehicle;
                UtilityVehicle newUtility = (UtilityVehicle) entity;

                existingUtility.setTrunkSize(newUtility.getTrunkSize());
                existingUtility.setSpecialEquipment(newUtility.getSpecialEquipment());
                existingUtility.setVersatility(newUtility.getVersatility());
            }

            em.merge(existingVehicle);
            em.flush();
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
