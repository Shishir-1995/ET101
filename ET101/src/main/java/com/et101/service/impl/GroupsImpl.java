package com.et101.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et101.exceptions.InvalidIDException;
import com.et101.model.Groups;
import com.et101.model.User;
import com.et101.repository.GroupsRepository;
import com.et101.repository.UserRepository;
import com.et101.service.inter.GroupInterface;

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
		User user = userRepo.findById(id).get();
		group.setCreator(user);
		return groupsRepo.save(group);
	}

	@Override
	public Groups addUserToGroup(Integer groupId, List<Integer> userIds) {
		Groups group = groupsRepo.findById(groupId).orElseThrow(()->  new InvalidIDException("No groupd with groupID : [ "+groupId+" ] found"));
		List<User> userList = userRepo.findAllById(userIds);
		List<User> groupUsers = group.getMembers();
		groupUsers.addAll(userList);
		return groupsRepo.save(group);
	}



}
