package com.library.layer.data_access;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.Category;

public interface CategoryDAO extends CrudRepository<Category, Long>{
	Category save(Category category);
	void deleteById(Long id);
	Optional<Category> findById(Long id);
	List<Category> findAll();
}
