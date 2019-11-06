package com.library.layer.data_access;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.User;

public interface BookDAO extends CrudRepository<User, Long>{

}
