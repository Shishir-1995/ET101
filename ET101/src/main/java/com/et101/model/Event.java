package com.et101.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Event {
	
	@Id
	private Integer id;
	
	@NonNull
	private String name;
	
	@NonNull
	@DBRef
	private List<User> paidBy;
	@DBRef
	private Map<User, Double> expenseDivision;
	

}
