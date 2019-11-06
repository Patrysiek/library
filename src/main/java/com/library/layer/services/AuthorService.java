package com.library.layer.services;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.layer.data_access.AuthorDAO;
import com.library.layer.entities.Author;

@Service
public class AuthorService {
	@Autowired
	private AuthorDAO authorDAO;

	public void save(Author author) {
		Author a = authorDAO.save(author);
		
	}

	public void deleteById(Long id) {
		authorDAO.deleteById(id);
	}
	public Author findById(Long id) {
		Author author = authorDAO.findById(id).get();
		return author;
	}
	public List<Author> findAll() {
		return authorDAO.findAll();
	}
}
