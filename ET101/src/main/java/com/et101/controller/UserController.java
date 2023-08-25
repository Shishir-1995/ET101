package com.et101.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.et101.model.User;
import com.et101.repository.UserRepository;
import com.et101.service.UserImpl;
import com.et101.service.UserInterface;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserInterface userService = new UserImpl();
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to ET ";
	}
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User savedUser = userService.addUser(user);
		
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findUserById(@PathVariable Integer id){
		User user = userService.findUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
}
