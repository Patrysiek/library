package com.library.layer.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Book")
@Getter
@Setter
public class Book {

	@Id
	@Column(name = "book_id")
	private long id;
	private String title;
	private boolean hired;

	@ManyToMany(mappedBy = "books")
	private List<Author> authors;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hire_id")
	private Hire hire;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;

}
