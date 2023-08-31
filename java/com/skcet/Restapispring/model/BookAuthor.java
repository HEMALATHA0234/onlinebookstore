package com.skcet.Restapispring.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Author")
public class BookAuthor {
	@Id
private Long id;
private String authorName;
private String description;
public BookAuthor() {
	super();
	
}

public BookAuthor(Long id, String authorName, String description) {
	super();
	this.id = id;
	this.authorName = authorName;
	this.description = description;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
