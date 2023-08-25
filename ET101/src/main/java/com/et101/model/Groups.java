package com.et101.model;

import org.springframework.data.annotation.Id;

import lombok.NonNull;

public class Groups {
	
	@Id
	private Integer id;
	
	@NonNull
	private String groupName;
	private String description;

}
