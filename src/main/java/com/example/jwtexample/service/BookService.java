package com.example.jwtexample.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public String getBookName(Long id){
        return "Microservices Book";
    }
}
