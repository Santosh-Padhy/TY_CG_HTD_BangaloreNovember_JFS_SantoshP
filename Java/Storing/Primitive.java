package com.capg.type.pack1;

public class Primitive {
	byte b= (byte)56.23;
	short s =(short)67.0 ;
	int c =(int)'a';
	char f = 'a';
	//float f= 34;
	//double d = ;
	void values()
	{
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(f);
	
	}
public static void main(String[] args) {
	Primitive p1 = new Primitive();
	p1.values();
}
}
