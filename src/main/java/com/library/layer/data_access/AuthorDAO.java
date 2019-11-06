package com.library.layer.data_access;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.Author;

public interface AuthorDAO extends CrudRepository<Author, Long>{

}
