package com.daniel.dabrowski.restfulaxonlibrary.unit;

import com.daniel.dabrowski.restfulaxonlibrary.agregates.BookAggregate;
import com.daniel.dabrowski.restfulaxonlibrary.bookManagmentModule.AddBookCommand;
import com.daniel.dabrowski.restfulaxonlibrary.bookManagmentModule.AddedBookEvent;
import com.daniel.dabrowski.restfulaxonlibrary.model.BookDTO;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.Before;
import org.junit.Test;

public class AxonBookManagmentTest {

    private FixtureConfiguration<BookAggregate> fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new AggregateTestFixture<>(BookAggregate.class);
    }

    @Test
    public void addBook() {
        BookDTO dto = new BookDTO("1", "TestBook", "Novel", "ISBN-1234-56");
        fixture.givenNoPriorActivity()
                .when(new AddBookCommand("11", dto))
                .expectEvents(new AddedBookEvent("11", dto));
    }
}
