package com.library.layer.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface CategoryEndpoint {
	@RequestMapping(
			path = "/category/add",
			method = RequestMethod.PUT
			)
	void addBook(String category);
}
