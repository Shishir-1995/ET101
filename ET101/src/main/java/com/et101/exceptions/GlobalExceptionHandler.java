package com.et101.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidIDException.class)
	public ResponseEntity<ErrorDetailsFormat> invalidId(InvalidIDException ex, WebRequest req){
		ErrorDetailsFormat edf = new ErrorDetailsFormat();
		edf.setTitle("Invalid ID ");
		edf.setDescription(ex.getMessage());
		edf.setUri(req.getDescription(false));
		return new ResponseEntity<ErrorDetailsFormat>(edf, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetailsFormat> noHandler(NoHandlerFoundException ex, WebRequest req){
		ErrorDetailsFormat edf = new ErrorDetailsFormat();
		edf.setTitle("Invalid URI ");
		edf.setDescription(ex.getMessage());
		edf.setUri(req.getDescription(false));
		return new ResponseEntity<ErrorDetailsFormat>(edf, HttpStatus.BAD_REQUEST);
	}
}
