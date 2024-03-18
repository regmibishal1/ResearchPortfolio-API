package com.researchportfolio.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // Define a list of allowed origins
    private static final List<String> ALLOWED_ORIGINS = List.of(
            "http://localhost:4200/"
    );

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(ALLOWED_ORIGINS.toArray(String[]::new))
//                .allowedMethods("*") // Allow all methods
                .allowCredentials(true)
                .maxAge(3600);
    }
}