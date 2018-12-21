package com.zr.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.UserMapper;
import com.zr.crm.model.User;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private UserMapper mapper; 
	
	@Override
	public User Login(Long id) {
		 
		return mapper.findById(id);
	}

	@Override
	public void save(User user) {
		 
	}

	@Override
	public void update(User user) {
	 
		
	}

	@Override
	public void delete(int id) {
		 
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
