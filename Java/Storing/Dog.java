package com.capg.type.pack1;

public class Dog extends Animal {
	
	void dogisBarking()
	{
		System.out.println("dog is barking");
	}
public static void main(String[] args) {
	Animal a2 = new Animal();
	a2.eating();
	Animal a1 = new Dog();
	a1.eating();
	Dog d1 = (Dog)a1;
d1.eating();
	d1.dogisBarking();
	
}
}

