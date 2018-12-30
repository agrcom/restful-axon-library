package com.daniel.dabrowski.restfulaxonlibrary;

import com.daniel.dabrowski.restfulaxonlibrary.restfulModule.MainWebClient;
import org.axonframework.eventsourcing.eventstore.EventStorageEngine;
import org.axonframework.eventsourcing.eventstore.inmemory.InMemoryEventStorageEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestfulAxonLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulAxonLibraryApplication.class, args);
		MainWebClient mainWebClient = new MainWebClient();
		System.out.println(mainWebClient.getResult());
	}

	@Bean
	public EventStorageEngine eventStorageEngine(){
		return new InMemoryEventStorageEngine();
	}

}

