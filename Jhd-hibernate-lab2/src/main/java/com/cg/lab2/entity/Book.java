package com.cg.lab2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "books_lab2")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="isbn")
	private Long isbn;
	@Column(name="title",length = 20)
	private String title;
	@Column(name="price")
	private Long price;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Author author;

	public Book() {
		super();
		/* no implementation */
	}

	public Book(String title, Long price) {
		super();
		this.title = title;
		this.price = price;
	}

	public Long getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return String.format("Book [isbn=%s, title=%s, price=%s]", isbn, title, price);
	}
	
}