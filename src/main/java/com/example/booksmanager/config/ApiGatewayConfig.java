package com.example.booksmanager.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("books", r -> r.path("/api/books/**")
                        .uri("http://localhost:8081"))
                .route("bookshelves", r -> r.path("/api/bookshelves/**")
                        .uri("http://localhost:8082"))
                .route("bookshelf-books", r -> r.path("/api/bookshelf-books/**")
                        .uri("http://localhost:8082"))
                .route("bookshelf-categories", r -> r.path("/api/bookshelf-categories/**")
                        .uri("http://localhost:8082"))
                .route("bookshelf-category-books", r -> r.path("/api/bookshelf-category-books/**")
                        .uri("http://localhost:8082"))
                .route("bookshelf-favourites", r -> r.path("/api/bookshelf-favourites/**")
                        .uri("http://localhost:8082"))
                .route("bookshelf-book-reading-progresses", r -> r.path("/api/bookshelf-book-reading-progresses/**")
                        .uri("http://localhost:8082"))
                .route("users", r -> r.path("/api/users/**")
                        .uri("http://localhost:8084"))
                .route("auth", r -> r.path("/api/auth/**")
                        .uri("http://localhost:8084"))
                .route("forums", r -> r.path("/api/forums/**")
                        .uri("http://localhost:8085"))
                .route("forum-comments", r -> r.path("/api/forum-comments/**")
                        .uri("http://localhost:8085"))
                .route("reviews", r -> r.path("/api/reviews/**")
                        .uri("http://localhost:8085"))
                .route("reviews-comments", r -> r.path("/api/reviews-comments/**")
                        .uri("http://localhost:8085"))
                .route("language-settings", r -> r.path("/api/language-settings/**")
                        .uri("http://localhost:8086"))
                .route("security-settings", r -> r.path("/api/security-settings/**")
                        .uri("http://localhost:8086"))
                .route("theme-settings", r -> r.path("/api/theme-settings/**")
                        .uri("http://localhost:8086"))
                .build();
    }

}