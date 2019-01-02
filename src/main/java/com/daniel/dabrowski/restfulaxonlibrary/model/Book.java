package com.daniel.dabrowski.restfulaxonlibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@Document(collection = "books")
public class Book {

    @Id
    private String id;

    @NotEmpty(message = "Book Name must be provided")
    @Size(max = 140, min = 3)
    private String name;

    @NotEmpty(message = "Category Name for book must be provided")
    @Size(max = 80, min = 3)
    private String categoryName;

    @NotEmpty(message = "ISBN must be provided")
    @Size(max = 10, min = 3)
    private String isbn;
}
