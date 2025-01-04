package com.sheru.news.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI pepperNewsOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Pepper News API")
                        .description("API documentation for the Pepper News application.")
                        .version("v1.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("Pepper News Wiki Documentation")
                        .url("https://pepper-news.wiki"));
    }
}
