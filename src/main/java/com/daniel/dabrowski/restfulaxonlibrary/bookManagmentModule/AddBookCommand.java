package com.daniel.dabrowski.restfulaxonlibrary.bookManagmentModule;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
public class AddBookCommand {

    @TargetAggregateIdentifier
    public String id;
    public String bookName;
    public String categoryName;
}
