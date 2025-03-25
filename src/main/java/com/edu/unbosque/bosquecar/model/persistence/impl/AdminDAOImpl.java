package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.entities.Administrator;
import com.edu.unbosque.bosquecar.model.persistence.dao.IAdminDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

@Stateless
public class AdminDAOImpl implements IAdminDAO {

    @PersistenceContext(name = "BosqueCarPu")
    private EntityManager em;

    @Override
    public Administrator getAdmin(String email) {
        try{
            return em.createNamedQuery("Administrator.findByEmail", Administrator.class)
                    .setParameter("email", email).getSingleResult();
        }catch (NoResultException e) {
            return null;
        }
    }
}
