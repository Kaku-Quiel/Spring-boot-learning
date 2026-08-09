package com.empresa.bookstore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.bookstore.models.DTOs.BookDTO;
import com.empresa.bookstore.services.BookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class bookController {
    private final BookService SERVICE;

    public bookController(BookService SERVICE){
        this.SERVICE = SERVICE;
    }

    @GetMapping("/books")
    public BookDTO askForBook(@RequestParam(required = false) String title) {
        BookDTO dto = new BookDTO();
        
        String status = SERVICE.seekBook(title);
        dto.setStatus(status);
        dto.setTitle(title);

        return dto;
    }
}
