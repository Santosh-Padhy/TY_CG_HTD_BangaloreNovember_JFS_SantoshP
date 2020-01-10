package com.capg.fms.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TownValidation {
	static private Matcher matcher;
	static private final String TOWN_PATTERN="^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
	static private Pattern pattern=Pattern.compile(TOWN_PATTERN);
	public static boolean validate(final String townName) {
		matcher=pattern.matcher(townName);
		 return matcher.matches();
	}
	
	
}//end of class
