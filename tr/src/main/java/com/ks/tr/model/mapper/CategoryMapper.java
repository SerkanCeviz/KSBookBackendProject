package com.ks.tr.model.mapper;

import com.ks.tr.entity.Category;
import com.ks.tr.model.dto.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(source = "id", target = "id")
    CategoryDto entitytoDto(Category category);

    @Mapping(source = "name", target = "name")
    Category dtotoEntity(CategoryDto categoryDto);
}
