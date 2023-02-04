package com.bbj.spring6webapp.controllers;

import com.bbj.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    //we use the interface, not the implementation (loosely coupled)
    //so we will be able to use dependency injection flexibility, as BookService is a Spring Bean
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * @param model is a Spring MVC component, injected by Spring at runtime
     * @return the view name
     */
    @RequestMapping("/books")                   //when Spring see this, /books queries will call getBooks(model)
    public String getBooks(Model model) {

        model.addAttribute("books", bookService.findAll());

        return "books"; //view name, to be defined as Spring MVC view
    }
}
