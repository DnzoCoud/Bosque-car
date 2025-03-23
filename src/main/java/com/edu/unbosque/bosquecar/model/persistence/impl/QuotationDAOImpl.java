package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.Quotation;
import com.edu.unbosque.bosquecar.model.persistence.dao.IQuotationDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class QuotationDAOImpl implements IQuotationDAO {

    @PersistenceContext(name = "BosqueCarPu")
    protected EntityManager em;

    @Override
    public void save(Quotation entity) {
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
        return em.createNamedQuery("Appoinment.findAll", Quotation.class).getResultList();
    }
}