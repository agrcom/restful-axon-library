package com.daniel.dabrowski.restfulaxonlibrary.bookManagmentModule;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

@Value @AllArgsConstructor
public class AddedBookEvent {

    @TargetAggregateIdentifier
    public String id;
    public String bookName;
    public String categoryName;
}
