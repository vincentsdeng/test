package com.zr.crm.service;

import java.util.List;

import com.zr.crm.model.User;

public interface ILoginService {
	 public User Login(Long id);

	 public	void save(User user);

	 public	void update(User user);

	 public	void delete(int id);

	 public	User findById(int id);

	 public	List<User> findAll();
}
