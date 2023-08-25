package com.et101.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

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
	private User creator;
	private List<User> members;
	private Map<User, Double> expenses;
}
