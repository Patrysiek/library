package com.library.layer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.layer.data_access.BookDAO;
import com.library.layer.entities.Book;

@Service
public class BookService {

	@Autowired
	private BookDAO bookDAO;

	public void addBook(Book book) {
		Book b = bookDAO.save(book);
	}

}
