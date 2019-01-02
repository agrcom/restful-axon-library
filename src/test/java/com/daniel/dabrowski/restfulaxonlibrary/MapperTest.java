package com.daniel.dabrowski.restfulaxonlibrary;

import com.daniel.dabrowski.restfulaxonlibrary.model.Book;
import com.daniel.dabrowski.restfulaxonlibrary.model.BookDTO;
import com.daniel.dabrowski.restfulaxonlibrary.model.BookMapper;
import org.junit.Test;

public class MapperTest {

    @Test
    public void bookShouldBeMapped(){
        Book book = new Book("1", "Test Book", "Science", "1234-5678-9012");

        BookDTO dto = BookMapper.INSTANCE.bookToBookDTO(book);

        assert dto != null;
        assert dto.getId().equals(book.getId());
        assert dto.getBookName().equals(book.getName());
        assert dto.getCategoryName().equals(book.getCategoryName());
        assert dto.getIban().equals(book.getIban());
    }
}
