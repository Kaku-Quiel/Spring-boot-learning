package com.empresa.bookstore.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.empresa.bookstore.models.Book;
import com.empresa.bookstore.models.DTOs.BookDTO;
import com.empresa.bookstore.repositories.BookRepository;

@Service
public class BookService {

    private final BookRepository REPOSITORY;

    public BookService(BookRepository REPOSITORY){
        this.REPOSITORY = REPOSITORY;
    }

    public BookDTO seekBookDTO(String title){
        BookDTO dto = new BookDTO();

        if(title == null){
            dto.setStatus("no title");
            dto.setTitle(null);
            return dto;
        }

        for(Book book : REPOSITORY.findAll()){
            if(book.getTitle().equalsIgnoreCase(title)){
                dto.setStatus("success");
                dto.setTitle(book.getTitle());
                return dto;
            }
        }

        dto.setStatus("not found");
        dto.setTitle(null);
        return dto;
    }

    public List<Book> books(){
        return REPOSITORY.findAll();
    }

    public Book findByID(int id){

        for(Book book : REPOSITORY.findAll()){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }
}
