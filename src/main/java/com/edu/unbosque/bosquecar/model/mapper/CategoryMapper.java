package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.CategoryDTO;
import com.edu.unbosque.bosquecar.model.entities.Category;

public class CategoryMapper {

    public static CategoryDTO toDto(Category category) {
        return new CategoryDTO(
                category.getId(),
                category.getName()
        );
    }

    public static Category toEntity(CategoryDTO dto) {
        return new Category(
                dto.getId(),
                dto.getName()
        );
    }
}
