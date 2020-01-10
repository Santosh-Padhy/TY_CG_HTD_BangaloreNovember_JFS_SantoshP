package com.capgemini.fms.exception;

public class IdNotFoundException extends RuntimeException {

	private String message="No Such Id is Found";
	
		public IdNotFoundException(String string) {
			super(string);
					}
	
		public String getMessage() {
			return message;
		}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
