package com.library.layer.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {

	@Id
	@Column(name = "user_id")
	private long id;
	private String name;
	private String surname;

	@OneToMany(mappedBy = "user", 
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	private List<Hire> hires;
}
