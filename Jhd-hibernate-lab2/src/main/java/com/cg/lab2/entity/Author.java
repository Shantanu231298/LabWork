package com.cg.lab2.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author_lab2")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long authorId;
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "author")
	private List<Book> book = new ArrayList<>();

	public Author() {
		super();
		/* no implementation */
	}

	public Author(String name) {
		super();
		this.name = name;
	}

	public Long getAuthorId() {
		return authorId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return String.format("Author [authorId=%s, name=%s]", authorId, name);
	}
	
}