package com.bbj.spring6webapp.services;

import com.bbj.spring6webapp.domain.Author;
import com.bbj.spring6webapp.domain.Book;


public interface AuthorService {

    Iterable<Author> findAll();
}
