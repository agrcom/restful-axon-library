package com.daniel.dabrowski.restfulaxonlibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDTO {

    private String id;
    private String bookName;
    private String categoryName;
    private String iban;
}
