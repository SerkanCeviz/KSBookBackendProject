package com.ks.tr.service;

import com.ks.tr.model.dto.BookDto;

import java.util.Set;
import java.util.UUID;

public interface BookService {
    Set<BookDto> getBookWithCategoryId(UUID categoryId);

    BookDto saveBook(BookDto bookDto);
}
