package com.devbookstore.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;                  // ✅ Add this
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;  // ✅ Add this

@SpringBootApplication
@EntityScan("com.devbookstore.book.model")
@EnableJpaRepositories("com.devbookstore.book.repository")
public class BookServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }
}
