package com.example.api.service;
import com.example.api.model.Book;

import java.util.HashSet;

public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();

    void deleteBookById(long id);
}
