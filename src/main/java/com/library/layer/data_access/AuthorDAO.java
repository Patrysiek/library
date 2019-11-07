package com.library.layer.data_access;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.Author;

public interface AuthorDAO extends CrudRepository<Author, Long>{
	Author save(Author author);
	Author findByName(String name);
	void deleteById(Long id);
	Optional<Author> findById(Long id);
	List<Author> findAll();
}
