package com.library;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.library.layer.endpoints.AuthorEndpointImplo;

@SpringBootTest
class LibraryApplicationTests {

	@Autowired
	private AuthorEndpointImplo authorEndpoint;
	
	
	@Test
	void contextLoads() {
	assertThat(authorEndpoint).isNotNull();
	}

}
