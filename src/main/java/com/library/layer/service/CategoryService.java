package com.library.layer.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface CategoryService {
	@RequestMapping(
			path = "/category/add",
			method = RequestMethod.PUT
			)
	void addBook(String category);
}
