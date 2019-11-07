package com.library.layer.endpoints;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.layer.entities.Author;
import com.library.layer.presentation.AuthorEndpoint;
import com.library.layer.services.AuthorService;


@RestController
@RequestMapping("/author")
public class AuthorEndpointImplo implements AuthorEndpoint {

	@Autowired
	private AuthorService service;

	@Override
	public void addAuthor(Author author) {
		service.save(author);
		LoggerFactory.getLogger(AuthorService.class).info(author.getName());
	}

	@Override
	public List<Author> getAuthors() {
		return service.findAll();
	}

}
