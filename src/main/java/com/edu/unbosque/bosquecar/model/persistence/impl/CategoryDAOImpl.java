package com.edu.unbosque.bosquecar.model.persistence.impl;

import com.edu.unbosque.bosquecar.model.dto.CategoryDTO;
import com.edu.unbosque.bosquecar.model.entities.Category;
import com.edu.unbosque.bosquecar.model.persistence.dao.ICategoryDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class CategoryDAOImpl implements ICategoryDAO {

    @PersistenceContext(name = "BosqueCarPU")
    private EntityManager em;

    @Override
    public Category getCategory(int id) {
        return em.find(Category.class, id);
    }

    @Override
    public List<Category> getAllCategories() {
        return em.createQuery("select c from Category c", Category.class).getResultList();
    }
}
