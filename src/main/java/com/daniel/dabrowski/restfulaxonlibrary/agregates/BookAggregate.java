package com.daniel.dabrowski.restfulaxonlibrary.agregates;

import com.daniel.dabrowski.restfulaxonlibrary.bookManagmentModule.AddBookCommand;
import com.daniel.dabrowski.restfulaxonlibrary.bookManagmentModule.AddedBookEvent;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

@Aggregate
@NoArgsConstructor
public class BookAggregate {

    @AggregateIdentifier
    public String bookId;
    public  boolean isBorrowed;

    @CommandHandler
    public BookAggregate(AddBookCommand command) {
        apply(new AddedBookEvent(command.getId(), command.getBookName(), command.getCategoryName()));
    }

    @EventSourcingHandler
    public void on(AddedBookEvent event){
        this.isBorrowed = false;
        this.bookId = event.getId();
    }

}
