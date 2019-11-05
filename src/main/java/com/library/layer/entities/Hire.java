package com.library.layer.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Hire")
@Getter
@Setter
public class Hire {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "hire_id")
	private long id;
	
	private Date hireEnd;
	private Date hireStart;
	private String comment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "hire", cascade = { CascadeType.MERGE, CascadeType.PERSIST }, orphanRemoval = false)
	private List<Book> books;
}
