package com.example.Springneo4j.repository;

import com.example.Springneo4j.node.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;


public interface BookRepository extends Neo4jRepository<Book, String> {

    Book findByName(String name);

}