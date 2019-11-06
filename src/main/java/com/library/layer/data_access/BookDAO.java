package com.library.layer.data_access;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.Book;

public interface BookDAO extends CrudRepository<Book, Long>{
	Book save(Book book);
	void deleteById(Long id);
	Optional<Book> findById(Long id);
	List<Book> findAll();
}
