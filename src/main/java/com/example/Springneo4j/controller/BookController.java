package com.example.Springneo4j.controller;

import com.example.Springneo4j.node.Book;
import com.example.Springneo4j.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        repository.save(book);
        return "Book Added";
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return (List<Book>) repository.findAll();
    }

    @GetMapping("/getBook/{name}")
    public Book getBook(@PathVariable String name) {
        return repository.findByName(name);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable String id) {
        repository.deleteById(id);
        return "Book deleted with id : " + id;
    }
}
