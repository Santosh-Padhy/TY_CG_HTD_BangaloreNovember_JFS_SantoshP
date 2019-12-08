package exceptionPropagation;

public class A {
public static void main(String[] args) {
	System.out.println("main started ");
	try {
		B.n();
	} catch (ClassNotFoundException e) {
		
System.out.println("Exception handled");
	}
	System.out.println("main ended");
}
}
