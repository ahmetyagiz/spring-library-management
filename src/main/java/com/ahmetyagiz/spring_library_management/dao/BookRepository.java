package com.ahmetyagiz.spring_library_management.dao;

import com.ahmetyagiz.spring_library_management.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByIsAvailable(boolean isAvailable);
}
