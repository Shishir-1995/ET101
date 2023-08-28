package com.et101.service.inter;

import java.util.List;

import com.et101.model.Groups;

public interface GroupInterface {

	Groups addGroup(Groups group, Integer id);
	
	Groups addUserToGroup(Integer groupId, List<Integer> userIds);
	
}
