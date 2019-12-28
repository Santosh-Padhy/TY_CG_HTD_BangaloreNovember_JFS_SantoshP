package com.capg.fms.exception;

public class CustomerIdNotFoundException extends RuntimeException {

	private String message="No Such Id is Found";
	
		public CustomerIdNotFoundException(String string) {
			super(string);
					}
	
		public String getMessage() {
			return message;
		}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
