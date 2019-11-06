package com.library.layer.data_access;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.Hire;

public interface HireDAO extends CrudRepository<Hire, Long>{
	Hire save(Hire hire);
	void deleteById(Long id);
	Optional<Hire> findById(Long id);
	List<Hire> findAll();
}
