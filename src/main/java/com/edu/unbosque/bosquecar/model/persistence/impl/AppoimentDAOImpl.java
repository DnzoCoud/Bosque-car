package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.Appoinment;
import com.edu.unbosque.bosquecar.model.entities.Customer;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.persistence.dao.IAppoimentDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.ICustomerDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class AppoimentDAOImpl implements IAppoimentDAO {

    @PersistenceContext (name = "BosqueCarPu")
    protected EntityManager em;

    @Inject
    private IVehicleDAO vehicleDAO;
    @Inject
    private ICustomerDAO customerDAO;

    @Override
    public void save(Appoinment entity) {
        Vehicle vehicle = vehicleDAO.findById(entity.getVehicle().getId());
        Customer customer = customerDAO.findByEmail(entity.getCustomer().getEmail());
        if (customer == null) {
            entity.setCustomer(customerDAO.saveAndReturn(entity.getCustomer()));
        }
        entity.setVehicle(vehicle);
        em.persist(entity);
    }

    @Override
    public void update(Integer id, Appoinment entity) {
        Appoinment appoinment = this.findById(id);
        if (appoinment != null) {
            em.merge(appoinment);
        }
    }

    @Override
    public void delete(Integer id) {
    Appoinment appoinment = this.findById(id);
    if (appoinment != null) {
        em.remove(appoinment);
    }
    }

    @Override
    public Appoinment findById(Integer id) {
        return em.find(Appoinment.class, id);
    }

    @Override
    public List<Appoinment> findAll() {
      return em.createNamedQuery("Appoinment.findAll", Appoinment.class).getResultList();
    }
}
