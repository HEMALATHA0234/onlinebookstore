package com.skcet.Restapispring.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Books{
@Id
private Long id;
private String name;
public Books() {
	super();
}

public Books(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}

