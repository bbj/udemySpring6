package com.bbj.spring6webapp.services;

import com.bbj.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
