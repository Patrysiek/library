package com.library.layer.data_access;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.User;

public interface UserDAO extends CrudRepository<User, Long>{
	User save(User user);
	void deleteById(Long id);
	Optional<User> findById(Long id);
	List<User> findAll();
}
