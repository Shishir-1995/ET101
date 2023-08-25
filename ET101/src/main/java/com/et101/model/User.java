package com.et101.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@NonNull
	private String name;
	
	@Id
	@NonNull
	private String phoneNumber;
	
	@NonNull
	private String password;
	
}
