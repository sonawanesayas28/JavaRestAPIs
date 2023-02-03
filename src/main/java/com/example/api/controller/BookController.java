package com.example.api.controller;

import java.util.HashSet;

import com.example.api.model.ReverseString;
import com.example.api.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Book;

import com.example.api.service.BookServiceImpl;

@RestController
public class BookController {

    @Autowired
    BookServiceImpl bookServiceImpl;

    @PostMapping("/book")
    public void addBook(@RequestBody Book book) {
        bookServiceImpl.addBook(book);
    }

    @GetMapping("/book")
    public HashSet<Book> getAllBook() {
        return bookServiceImpl.findAllBook();
    }

    @GetMapping("/book/{id}")
    public Book geBookById(@PathVariable long id) {
        return bookServiceImpl.findBookByID(id);
    }

    @DeleteMapping("/book")
    public void deleteBook() {
        bookServiceImpl.deleteAllData();
    }

    @DeleteMapping("/book/{id}")
    public void deleteBookById(@PathVariable long id) {
        bookServiceImpl.deleteBookById(id);
    }

    @PostMapping("/reversestring")
    public Response reverseString(@RequestBody ReverseString string){
        return null;
    }
}


