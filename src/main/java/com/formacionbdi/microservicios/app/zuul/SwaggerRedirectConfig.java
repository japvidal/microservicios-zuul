package com.formacionbdi.microservicios.app.zuul;

import java.net.URI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class SwaggerRedirectConfig {

    @Bean
    RouterFunction<ServerResponse> swaggerRedirectRouter() {
        return RouterFunctions.route()
                .GET("/swagger", request -> ServerResponse.temporaryRedirect(
                        URI.create("/webjars/swagger-ui/index.html"))
                        .build())
                .GET("/swagger-ui.html", request -> ServerResponse.temporaryRedirect(
                        URI.create("/webjars/swagger-ui/index.html"))
                        .build())
                .build();
    }
}
