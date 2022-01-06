package com.mherman22.tutorialintegratinghibernatewithspringboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="BOOK")
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	
	private String bookName;
	
	private String bookAuthor;
	
	private Date dateOfPublication;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Date getDateOfPublication() {
		return dateOfPublication;
	}
	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
}
