package com.edu.unbosque.bosquecar.model.persistence.dao;

import com.edu.unbosque.bosquecar.model.entities.Category;

import java.util.List;

public interface ICategoryDAO {
    Category getCategory(int id);
    List<Category> getAllCategories();
}
