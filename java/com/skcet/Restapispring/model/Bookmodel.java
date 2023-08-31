package com.skcet.Restapispring.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="book_store")
public class Bookmodel{
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String bookName;
private String genre;
private String author;
private int stock;                                        
private int price;

public Bookmodel() {
	super();
}

@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
@JoinColumn
private Books books;
//
//
@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name="authorid",referencedColumnName = "id")
private List<BookAuthor> ba;


public Bookmodel(Long id, String bookName, String genre, String author, int stock, int price, Books books) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.genre = genre;
	this.author = author;
	this.stock = stock;
	this.price = price;
}
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
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Books getBooks() {
	return books;
}
public void setBooks(Books books) {
	this.books = books;
}
public List<BookAuthor> getBa() {
	return ba;
}
public void setBa(List<BookAuthor> ba) {
	this.ba = ba;
}


}
