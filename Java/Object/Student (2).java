package com.capg.access.pack1;

public class Student {
protected String studName;
protected Student(String studName)
{
	this.studName = studName;
}
protected void details1 ()
{
	System.out.println("student name is "+studName);
}
}
