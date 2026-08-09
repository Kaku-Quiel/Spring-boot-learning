package com.empresa.bookstore.services;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    public String seekBook(String title){

        if(title == null){
            return "success";
        }

        if(title.toLowerCase().equals("naruto")){
            return "success";
        }
        
        return "error";
    }
}
