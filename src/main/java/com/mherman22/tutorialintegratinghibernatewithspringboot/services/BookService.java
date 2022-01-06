package com.mherman22.tutorialintegratinghibernatewithspringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mherman22.tutorialintegratinghibernatewithspringboot.model.Book;
import com.mherman22.tutorialintegratinghibernatewithspringboot.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }
}