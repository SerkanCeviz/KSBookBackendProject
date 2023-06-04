package com.ks.tr.service.Impl;

import com.ks.tr.entity.Category;
import com.ks.tr.model.dto.CategoryDto;
import com.ks.tr.model.mapper.CategoryMapper;
import com.ks.tr.repository.CategoryRepository;
import com.ks.tr.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return CategoryMapper.INSTANCE.entitytoDto(categoryRepository.save(CategoryMapper.INSTANCE.dtotoEntity(categoryDto)));
    }

    @Override
    public Set<CategoryDto> getAll() {
        List<Category> allCategories = categoryRepository.findAll();
        Set<CategoryDto> categories = allCategories.stream()
                .map(category -> CategoryMapper.INSTANCE.entitytoDto(category)).collect(Collectors.toSet());
        return categories;
    }
}
