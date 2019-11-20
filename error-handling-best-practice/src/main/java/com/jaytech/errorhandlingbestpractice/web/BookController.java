package com.jaytech.errorhandlingbestpractice.web;

import com.jaytech.errorhandlingbestpractice.domain.Book;
import com.jaytech.errorhandlingbestpractice.repository.BookRepository;
import com.jaytech.errorhandlingbestpractice.web.exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    private BookRepository repository;

    @GetMapping("/{id}")
    public Book findById(@PathVariable long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }
}
