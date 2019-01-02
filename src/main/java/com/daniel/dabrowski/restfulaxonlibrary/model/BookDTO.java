package com.daniel.dabrowski.restfulaxonlibrary.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDTO {

    private String id;
    private String bookName;
    private String categoryName;
    private String isbn;
}
