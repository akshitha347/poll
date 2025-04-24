package com.example.Exception;

public class PollIdException extends RuntimeException {
private String error;
private String errorcode;
public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
public String getErrorcode() {
	return errorcode;
}
public void setErrorcode(String errorcode) {
	this.errorcode = errorcode;
}
public PollIdException(String error, String errorcode) {
	super(error);
	this.error = error;
	this.errorcode = errorcode;
}
public PollIdException() {
	
}
}
