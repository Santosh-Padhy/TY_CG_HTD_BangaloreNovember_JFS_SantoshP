package com.capgemini.fms.exception;

import java.util.Date;

public class CustomException extends RuntimeException{

	public CustomException(String string){
		System.err.println(string);
	}




}//end of class
