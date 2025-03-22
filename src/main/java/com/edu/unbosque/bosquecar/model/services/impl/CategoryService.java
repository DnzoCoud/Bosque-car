package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.CategoryDTO;
import com.edu.unbosque.bosquecar.model.mapper.CategoryMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.ICategoryDAO;
import com.edu.unbosque.bosquecar.model.services.abc.ICategoryService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class CategoryService implements ICategoryService {

    @Inject
    private ICategoryDAO categoryDAO;

    @Override
    public List<CategoryDTO> getCategories() {
        return categoryDAO.getAllCategories().stream().map(CategoryMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategory(int id) {
        return CategoryMapper.toDto(categoryDAO.getCategory(id));
    }
}
