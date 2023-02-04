package com.bbj.spring6webapp.services;

import com.bbj.spring6webapp.domain.Book;
import com.bbj.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

/**
 * @Service: will be registered as a Spring component
 * when it is instantiated, the Spring framework will call constructor and inject the BookRepository
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
