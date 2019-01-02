package com.daniel.dabrowski.restfulaxonlibrary;

import com.daniel.dabrowski.restfulaxonlibrary.model.Book;
import com.daniel.dabrowski.restfulaxonlibrary.model.BookDTO;
import com.daniel.dabrowski.restfulaxonlibrary.model.BookMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.Description;

public class MapperTest {

    @Test
    public void bookShouldBeMapped(){
        Book book = new Book("1", "Test Book", "Science", "1234-5678-9012");

        BookDTO dto = BookMapper.INSTANCE.bookToBookDTO(book);

        assert dto != null;
        assert dto.getId().equals(book.getId());
        assert dto.getBookName().equals(book.getName());
        assert dto.getCategoryName().equals(book.getCategoryName());
        assert dto.getIsbn().equals(book.getIsbn());
    }

    @Test @Description("DTO should be properly converted to DB model")
    public void dtoShouldBeMappedToDbModel(){
        BookDTO dto = new BookDTO("1", "Test Book", "Science", "1234-5678-9012");

        Book dbModel = BookMapper.INSTANCE.dtoToDbModel(dto);

        assert dbModel != null;
        assert dbModel.getId().equals(dto.getId());
        assert dbModel.getName().equals(dto.getBookName());
        assert dbModel.getCategoryName().equals(dto.getCategoryName());
        assert dbModel.getIsbn().equals(dto.getIsbn());
    }

}
