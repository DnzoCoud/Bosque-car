package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.Customer;
import com.edu.unbosque.bosquecar.model.persistence.dao.ICustomerDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

import java.util.List;
@Stateless
public class CustomerDAOImpl implements ICustomerDAO {

    @PersistenceContext(name = "BosqueCarPu")
    protected EntityManager em;

    @Override
    public void save(Customer entity) {
        em.persist(entity);
    }

    @Override
    public void update(Integer id, Customer entity) {
        Customer customer = this.findById(id);
        if (customer != null) {
            em.merge(customer);
        }
    }

    @Override
    public void delete(Integer id) {
        Customer customer = this.findById(id);
        if (customer != null) {
            em.remove(customer);
        }
    }

    @Override
    public Customer findById(Integer id) {
        return em.find(Customer.class, id);
    }

    @Override
    public List<Customer> findAll() {
        return em.createNamedQuery("Customer.findAll", Customer.class).getResultList();
    }

    @Override
    public Customer findByEmail(String email) {
        try {
            return em.createNamedQuery("Customer.findByEmail", Customer.class)
                    .setParameter("email", email).getSingleResult();
        }catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Customer saveAndReturn(Customer entity) {
        em.persist(entity);
        return entity;
    }
}
