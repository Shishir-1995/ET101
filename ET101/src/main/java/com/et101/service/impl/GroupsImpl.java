package com.et101.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et101.model.Groups;
import com.et101.model.User;
import com.et101.repository.GroupsRepository;
import com.et101.repository.UserRepository;

@Service
public class GroupsImpl implements GroupInterface{
	
	
	private UserRepository userRepo;
	private GroupsRepository groupsRepo;
	
	@Autowired
	public GroupsImpl(UserRepository userRepo, GroupsRepository groupsRepo) {
		super();
		this.userRepo = userRepo;
		this.groupsRepo = groupsRepo;
	}

	public GroupsImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Groups addGroup(Groups group, Integer id) {
		// TODO Auto-generated method stub
		User user = userRepo.findById(id).get();
		group.setCreator(user);
		return groupsRepo.save(group);
	}



}
