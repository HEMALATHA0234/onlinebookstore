package com.skcet.Restapispring.service;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.skcet.Restapispring.model.Bookmodel;
public interface Bookservice  {
	    public boolean addUser(Bookmodel user);
		public List<Bookmodel> getUser();
		public boolean updateUser(Long id, Bookmodel user);
		public boolean deleteUser(Long id);
		public Page<Bookmodel> getAllUser(PageRequest pageRequest);
//		List<Bookmodel> findAllQuery();
		public Bookmodel findByBookName();
		Bookmodel findByBookName(String bookName);
		Bookmodel findByBookName1();
		
	}
