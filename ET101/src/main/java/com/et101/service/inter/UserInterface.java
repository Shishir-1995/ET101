package com.et101.service.inter;

import com.et101.model.User;

public interface UserInterface {
	
	User findUserById(Integer id);
	
	User addUser(User user);

}
