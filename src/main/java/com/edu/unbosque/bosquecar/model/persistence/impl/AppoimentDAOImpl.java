package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.Appoinment;
import com.edu.unbosque.bosquecar.model.persistence.dao.IAppoimentDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class AppoimentDAOImpl implements IAppoimentDAO {

    @PersistenceContext (name = "BosqueCarPu")
    protected EntityManager em;

    @Override
    public void save(Appoinment entity) {
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
