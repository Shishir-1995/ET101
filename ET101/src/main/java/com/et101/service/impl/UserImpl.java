package com.et101.service.impl;

import org.springframework.stereotype.Service;

import com.et101.model.User;
import com.et101.repository.UserRepository;
import com.et101.service.inter.UserInterface;

@Service
public class UserImpl implements UserInterface {
	
	UserRepository userRepo;
	
	public UserImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public UserImpl(UserRepository userRepo) {
		// TODO Auto-generated constructor stub
		this.userRepo = userRepo;
	}

	@Override
	public User findUserById(Integer id) {
		User user = userRepo.findById(id).get();
		return user;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		User savedUser = userRepo.save(user);
		return savedUser;
	}

}
