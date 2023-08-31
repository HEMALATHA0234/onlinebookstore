package com.skcet.Restapispring.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.skcet.Restapispring.model.Bookmodel;

import com.skcet.Restapispring.repository.Modelrepository;
import com.skcet.Restapispring.service.Bookservice;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookServiceImpl implements Bookservice{
	
	@Autowired
	private Modelrepository userRepository;

	@Override
	public boolean addUser(Bookmodel user) {
		boolean userExists = userRepository.existsByBookName(user.getBookName());
		if(!userExists) {
			userRepository.save(user);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Bookmodel> getUser() {
		return userRepository.findAll();
	}

	@Override
	public boolean updateUser(Long id,Bookmodel user) {
		Optional<Bookmodel> existingUserOptional = userRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			Bookmodel userExists = existingUserOptional.get();
			
			userExists.setBookName(user.getBookName());
			userExists.setGenre(user.getGenre());
			userExists.setAuthor(user.getAuthor());
			userExists.setStock(user.getStock());
			userExists.setPrice(user.getPrice());
			userRepository.save(userExists);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean deleteUser(Long id) {
		Optional<Bookmodel> existingUserOptional = userRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			userRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	@Override
	public Page<Bookmodel> getAllUser(PageRequest pageRequest){
		return userRepository.findAll(pageRequest);
	}
//	@Override
//	public List<Bookmodel> findAllQuery(){
//		return userRepository.findAllQuery();
//	}
	@Override
	public Bookmodel findByBookName(String bookName) {
		return userRepository.findByBookName(bookName);
	}

	@Override
	public Bookmodel findByBookName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bookmodel findByBookName1() {
		// TODO Auto-generated method stub
		return null;
	}


	

	 

	

	

	

	

}