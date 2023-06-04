package com.ks.tr.model.mapper;

import com.ks.tr.entity.Book;
import com.ks.tr.model.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "id", target = "id")
    BookDto entitytoDto(Book book);

    @Mapping(source = "name", target = "name")
    Book dtotoEntity(BookDto bookDto);
}
