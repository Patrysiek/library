package com.library.layer.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.layer.entities.Book;
import com.library.layer.presentation.BookEndpoint;
import com.library.layer.services.BookService;

@RestController
@RequestMapping("/book")
public class BookEndpointImplo implements BookEndpoint {
	
	
	@Autowired
	private BookService bookService;

	@Override
	public void addBook(Book book) {
		bookService.addBook(book);
	}


}
