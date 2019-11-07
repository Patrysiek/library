package com.library.endpoint;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.library.layer.entities.Author;
import com.library.layer.services.AuthorService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AuthorEndpointTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private AuthorService service;

	@Test
	public void givenEmployees_whenGetEmployees_thenReturnJsonArray() throws Exception {
		Author alex = new Author();
		alex.setName("Alex");
		alex.setSurname("Morgan");
		List<Author> allAuthors = Arrays.asList(alex);
		when(service.findAll()).thenReturn(allAuthors);
		mvc.perform(get("/author/authors").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].name", is(alex.getName())));
	}
}
