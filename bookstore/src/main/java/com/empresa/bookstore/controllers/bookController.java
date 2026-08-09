package com.empresa.bookstore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.bookstore.models.Book;
import com.empresa.bookstore.models.DTOs.BookDTO;
import com.empresa.bookstore.services.BookService;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class bookController {
    private final BookService SERVICE;

    public bookController(BookService SERVICE){
        this.SERVICE = SERVICE;
    }

    @GetMapping("/book")
    public BookDTO book(@RequestParam(required = false) String title) {
        return SERVICE.seekBookDTO(title);
    }

    @GetMapping("/books")
    public List<Book> books() {
        
        return SERVICE.books();
    }

    @GetMapping("/clon")
    public String clon() {

        Book original = SERVICE.findByID(1);

        if(original == null){
            return "error";
        }

        Book clon = new Book(original);
        clon.setAuthor("Jeremy");

        return clon.toString() + "\n\n" + original.toString();
    }
    
    
}
