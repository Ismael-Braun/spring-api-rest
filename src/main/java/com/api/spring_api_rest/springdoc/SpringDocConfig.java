package com.api.spring_api_rest.springdoc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig
{
    @Bean
    public OpenAPI api()
    {
        return new OpenAPI().info(new Info()
                .title("API Rest")
                .version("1.0")
                .description("API for product registration")
        );
    }
}




