package com.library.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.library.layer.data_access.AuthorDAO;
import com.library.layer.entities.Author;
import com.library.layer.services.AuthorService;

@RunWith(SpringRunner.class)
@Import(TestServiceConfig.class)
@SpringBootTest
public class AuthorServiceTest {
	@Autowired
	private AuthorService authorService;

	@MockBean
	private AuthorDAO authorDAO;
	
	
	@BeforeEach
	public void setUp() {
		Author al = new Author();
		al.setName("Alex");
		al.setSurname("Morgan");
		al.setId(7l);
	    Optional<Author> alex = Optional.of(al);
	    
	    Mockito.when(authorDAO.findById(7l))
	      .thenReturn(alex);
	}
	@Test
	public void serviceNotNullAssertion() {
		assertThat(authorService).isNotNull();
	}
	
	@Test
	public void whenValidName_thenAuthorShouldBeFound() {
	    long id = 7;
	    Author found = authorService.findById(id);
	     assertThat(found.getId())
	      .isEqualTo(id);
	 }
}
