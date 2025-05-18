package com.devbookstore.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbookstore.book.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);  // You can use Optional<Book> if you prefer
}


