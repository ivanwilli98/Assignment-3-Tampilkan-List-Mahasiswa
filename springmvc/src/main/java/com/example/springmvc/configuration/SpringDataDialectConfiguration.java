package com.example.springmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@Configuration
public class SpringDataDialectConfiguration {
	@Bean
	public SpringDataDialect springDataDialect() {
        return new SpringDataDialect();
    }
}
