package com.ks.tr.repository;

import com.ks.tr.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
    Set<Book> findByCategory_Id(UUID id);

}
