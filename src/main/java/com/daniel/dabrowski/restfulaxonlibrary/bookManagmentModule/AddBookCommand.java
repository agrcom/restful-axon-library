package com.daniel.dabrowski.restfulaxonlibrary.bookManagmentModule;

import com.daniel.dabrowski.restfulaxonlibrary.model.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
public class AddBookCommand {

    @TargetAggregateIdentifier
    public String id;
    public BookDTO book;
//    public String bookName;
//    public String categoryName;
}
