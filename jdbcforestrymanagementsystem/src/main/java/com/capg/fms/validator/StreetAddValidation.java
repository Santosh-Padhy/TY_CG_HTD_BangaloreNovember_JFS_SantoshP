package com.capg.fms.validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreetAddValidation {
	static Scanner sc = new Scanner(System.in);

	static private Matcher matcher;
	

	static public String Street_Address = "^([0-9a-zA-Z]+)(,\\s*[0-9a-zA-Z]+)*$";
		

	static private Pattern pattern = Pattern.compile(Street_Address);
 
	/**
	 * Validate hex with regular expression
	 * 
	 * @param hex
	 *            hex for validation
	 * @return true valid hex, false invalid hex
	 */

	public static boolean validate(final String hex) {

		matcher = pattern.matcher(hex);
		return matcher.matches();

	}
   
	
}//end of class
