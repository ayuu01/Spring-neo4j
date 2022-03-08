package com.example.Springneo4j.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@NodeEntity
public class Book {

    @Id
    private String id;
    private String name;
    private String author;
}