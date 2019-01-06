package com.daniel.dabrowski.restfulaxonlibrary;


import com.daniel.dabrowski.restfulaxonlibrary.model.BookDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryReactiveRepository { //extends ReactiveMongoRepository

    List<BookDTO> findAll();
}
