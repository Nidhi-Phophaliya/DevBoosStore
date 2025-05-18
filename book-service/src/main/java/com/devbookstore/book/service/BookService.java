package com.devbookstore.book.service;

import com.devbookstore.book.model.Book;
import com.devbookstore.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Book findBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
