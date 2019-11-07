package com.library.layer.presentation;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.layer.entities.Author;

public interface AuthorEndpoint {
	
	@RequestMapping(
			consumes = MediaType.APPLICATION_JSON_VALUE,
			path = "/add",
			method = RequestMethod.PUT
			)
	void addAuthor(@RequestBody Author author);
	
	@RequestMapping(
			path = "/authors",
			method = RequestMethod.GET
			)
	List<Author> getAuthors();
}
