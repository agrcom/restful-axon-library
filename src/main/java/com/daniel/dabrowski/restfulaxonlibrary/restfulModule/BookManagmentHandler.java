package com.daniel.dabrowski.restfulaxonlibrary.restfulModule;

import com.daniel.dabrowski.restfulaxonlibrary.LibraryReactiveRepository;
import com.daniel.dabrowski.restfulaxonlibrary.bookManagmentModule.AddedBookEvent;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@AllArgsConstructor
public class BookManagmentHandler {

  //  LibraryReactiveRepository repository;

//    public Mono addBookToLibrary(ServerRequest request) {
//        Mono<AddedBookEvent> addBook = request.bodyToMono(AddedBookEvent.class);
//        return ok().contentType(MediaType.TEXT_PLAIN)
//                .build(repository.save(addBook));
//    }

//    public Mono<ServerResponse> listBooks(ServerRequest request) {
//        Flux<> books = repository.findAll();
//        return ok().contentType(MediaType.APPLICATION_JSON).body(books, book.class);
//    }
}
