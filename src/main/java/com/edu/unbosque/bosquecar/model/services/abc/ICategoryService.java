package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> getCategories();
    CategoryDTO getCategory(int id);
}
