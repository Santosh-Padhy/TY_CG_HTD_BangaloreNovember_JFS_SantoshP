package org.oar.com.java;

public class staticAndNonstatic {
public static void main(String[] args) {
	Person p1  = new Person();
	Person.age = 34;
	String name = "Santosh";
	p1.personDetails();
	
	
}
}
