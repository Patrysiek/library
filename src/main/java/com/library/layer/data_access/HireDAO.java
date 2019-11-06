package com.library.layer.data_access;

import org.springframework.data.repository.CrudRepository;

import com.library.layer.entities.Hire;

public interface HireDAO extends CrudRepository<Hire, Long>{

}
