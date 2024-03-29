package com.library.layer.presentation;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.layer.entities.Book;

public interface BookEndpoint {
	
	@RequestMapping(
			consumes = MediaType.APPLICATION_JSON_VALUE,
			path = "/add",
			method = RequestMethod.PUT
			)
	void addBook(Book book);
}
