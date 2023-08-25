package com.et101.service;

import com.et101.model.User;

public interface UserInterface {
	
	User findUserById(Integer id);
	
	User addUser(User user);

}
