package com.daniel.dabrowski.restfulaxonlibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Book {

    @Id
    private String id;
    private String name;
    private String categoryName;
    private String iban;
}
