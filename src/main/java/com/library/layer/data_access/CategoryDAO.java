package com.library.layer.data_access;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.Category;

public interface CategoryDAO extends CrudRepository<Category, Long>{

}
