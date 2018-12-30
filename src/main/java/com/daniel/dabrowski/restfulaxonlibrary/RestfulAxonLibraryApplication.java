package com.daniel.dabrowski.restfulaxonlibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulAxonLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulAxonLibraryApplication.class, args);
		MainWebClient mainWebClient = new MainWebClient();
		System.out.println(mainWebClient.getResult());
	}

}

