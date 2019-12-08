package Customizedcheck;

public class Person {
public static void main(String[] args) {
	Election e1 = new Election();
	try {
		e1.vote(45);
	} catch (AgeLimitException e) {
	System.out.println(e.getMessage());
	}
}
}
