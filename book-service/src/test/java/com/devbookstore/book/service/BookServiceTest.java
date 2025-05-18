package com.devbookstore.book.service;

import java.util.Arrays;
import java.util.List;

import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.devbookstore.book.model.Book;
import com.devbookstore.book.repository.BookRepository;

public class BookServiceTest {

    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeMethod
    public void setUp() {
        bookRepository = Mockito.mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testGetAllBooks() {
        List<Book> mockBooks = Arrays.asList(
                new Book("Book One", "Author A"),
                new Book("Book Two", "Author B")
        );

        Mockito.when(bookRepository.findAll()).thenReturn(mockBooks);

        List<Book> books = bookService.getAllBooks();
        Assert.assertEquals(books.size(), 2);
        Assert.assertEquals(books.get(0).getTitle(), "Book One");
    }

    @Test
    public void testSaveBook() {
        Book book = new Book("Book X", "Author X");
        Mockito.when(bookRepository.save(book)).thenReturn(book);

        Book saved = bookService.saveBook(book);
        Assert.assertEquals(saved.getTitle(), "Book X");
        Assert.assertEquals(saved.getAuthor(), "Author X");
    }

    @DataProvider(name = "bookTitles")
    public Object[][] bookTitles() {
        return new Object[][] {
            {"Clean Code"}, {"The Pragmatic Programmer"}, {"Refactoring"}
        };
    }

    @Test(dataProvider = "bookTitles")
    public void testFindBookByTitle(String title) {
        Book book = new Book(title, "Author");
        Mockito.when(bookRepository.findByTitle(title)).thenReturn(book);

        Book result = bookService.findBookByTitle(title);
        Assert.assertEquals(result.getTitle(), title);
    }
}
