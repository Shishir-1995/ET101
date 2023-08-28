package com.et101.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Groups {
	
	@Id
	private Integer id;
	
	@NonNull
	private String groupName;

	private String description;

	@NonNull
	@DBRef
	private User creator;
	@DBRef
	private List<User> members;
	@DBRef
	private List<Event> events;
	
}
