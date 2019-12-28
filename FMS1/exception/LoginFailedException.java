package com.capg.fms.exception;

public class LoginFailedException extends RuntimeException {

	
	private String message="Login is Failed Try again";
	public LoginFailedException(String msg) {
		super();
				}

	public String LoginFailedException(String msg) {
		return message;
	}
	
	
	
	
	
	
	
}
