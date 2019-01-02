package com.daniel.dabrowski.restfulaxonlibrary.model;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "name", target = "bookName")
    BookDTO bookToBookDTO(Book book);
}
