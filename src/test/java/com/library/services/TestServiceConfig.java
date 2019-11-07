package com.library.services;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.library.layer.services.AuthorService;

@TestConfiguration
public class TestServiceConfig {
	@Bean
	public AuthorService authorService() {
		return new AuthorService();
	}
}
