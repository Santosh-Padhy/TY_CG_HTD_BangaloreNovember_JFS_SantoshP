package com.capgemini.fms.exception;

public class CustomException extends RuntimeException{

	public static String patternMatcher(String string) {
		
		String input="...";
		String pattern ="-?\\d+";
		if(input.matches("-?\\d+")){ 
		 System.out.println("Enter a positive Number");
		}
		return null;
	}
	
	
	
	
	
	
	
}//end of class
