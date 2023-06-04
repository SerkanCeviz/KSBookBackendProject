package com.ks.tr.service;

import com.ks.tr.model.dto.CategoryDto;

import java.util.Set;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);

    Set<CategoryDto> getAll();
}
