package org.com.java;

public class TestM {
	public static void main(String[] args) {
		FirstGeneration f1 = new ThirdGeneration();
		f1.call();
		f1.message();
		SecondGeneration f2 = new ThirdGeneration();
		f2.radio();
		f2.Game();
		f2.call();
		f2.message();
		ThirdGeneration f3  = new ThirdGeneration();
		f3.camera();
		f2.radio();
		f2.Game();
		f2.call();
		f2.message();
		
		
	}

}
