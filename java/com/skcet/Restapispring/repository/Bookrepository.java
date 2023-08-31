package com.skcet.Restapispring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.Restapispring.model.Books;

public interface Bookrepository extends JpaRepository<Books,Long> {

}
