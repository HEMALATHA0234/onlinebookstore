package com.skcet.Restapispring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.Restapispring.model.BookAuthor;

public interface Authorrepository extends JpaRepository<BookAuthor, Long> {

}
