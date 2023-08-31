package com.skcet.Restapispring.repository;


import java.util.List;
//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skcet.Restapispring.model.Bookmodel;

import jakarta.transaction.Transactional;

public interface Modelrepository extends JpaRepository<Bookmodel,Long> {
	
	boolean existsByBookName(String bookName);
      Optional<Bookmodel> findById(Long id);
	  void deleteById(Long id);
	@Modifying
	@Transactional
	@Query(value = "update user set bookstore = :bName where id = :id", nativeQuery = true)
	int updateUser(@Param("bName") String fname, @Param("id") Long id);
	@Modifying
	@Transactional
	@Query(value = "delete from bookstore where id = ?1", nativeQuery = true)
	int deleteUser(Long id);
//    List<Bookmodel> findAllQuery();
	Bookmodel findByBookName(String bookName);


}

