package com.library.layer.presentation;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.layer.entities.Author;
import com.library.layer.entities.Category;

public interface BookEndpoint {
	
	@RequestMapping(
			consumes = MediaType.APPLICATION_JSON_VALUE,
			path = "/book/add",
			method = RequestMethod.PUT
			)
	void addBook(Author author,String title,Category category);
}
