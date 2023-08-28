package com.et101.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.et101.model.Groups;
import com.et101.repository.GroupsRepository;
import com.et101.service.impl.GroupsImpl;
import com.et101.service.inter.GroupInterface;

@RestController
@RequestMapping("/groups")
public class GroupController {

	@Autowired
	GroupInterface groupInt = new GroupsImpl();
	
	@PostMapping("/add/{id}")
	public ResponseEntity<Groups> addGroups(@RequestBody Groups group, @PathVariable Integer id){
		Groups savedGroup = groupInt.addGroup(group, id);
		return new ResponseEntity<Groups>(savedGroup, HttpStatus.CREATED);
	}
}
