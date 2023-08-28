package com.et101.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetailsFormat {

	private LocalDateTime timestamp = LocalDateTime.now();
	private String title;
	private String description;
	private String uri;
}
