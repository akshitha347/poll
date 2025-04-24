package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Handler {
	@ExceptionHandler(PollIdException.class)
public ResponseEntity<String> PollIdException(PollIdException e){
	return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
}
}
