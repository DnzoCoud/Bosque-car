package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.Customer;
import com.edu.unbosque.bosquecar.model.entities.Quotation;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.persistence.dao.ICustomerDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.IQuotationDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class QuotationDAOImpl implements IQuotationDAO {

    @PersistenceContext(name = "BosqueCarPu")
    protected EntityManager em;

    @Inject
    private IVehicleDAO vehicleDAO;

    @Inject
    private ICustomerDAO customerDAO;

    @Override
    public void save(Quotation entity) {
        Vehicle vehicle = vehicleDAO.findById(entity.getVehicle().getId());
        Customer customer = customerDAO.findByEmail(entity.getCustomer().getEmail());
        if (customer == null) {
            entity.setCustomer(customerDAO.saveAndReturn(entity.getCustomer()));
        }
        entity.setVehicle(vehicle);
        em.persist(entity);
    }

    @Override
    public void update(Integer id, Quotation entity) {
        Quotation quotation = this.findById(id);
        if (quotation != null) {
            em.merge(quotation);
        }
    }

    @Override
    public void delete(Integer id) {
        Quotation quotation = this.findById(id);
        if (quotation != null) {
            em.remove(quotation);
        }
    }

    @Override
    public Quotation findById(Integer id) {
        return em.find(Quotation.class, id);
    }

    @Override
    public List<Quotation> findAll() {
        return em.createNamedQuery("Quotation.findAll", Quotation.class).getResultList();
    }
}