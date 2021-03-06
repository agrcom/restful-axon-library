package com.daniel.dabrowski.restfulaxonlibrary.restfulModule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class LandingPageRouter {

    @Bean
    public RouterFunction<ServerResponse> route(LandingPageHandler landingPageHandler) {

        return RouterFunctions
                .route(RequestPredicates.GET("/").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), landingPageHandler::main);
    }
}
