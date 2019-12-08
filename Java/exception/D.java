package exceptionPropagation;

public class D {
public static void o() throws ClassNotFoundException {
	Class.forName("A");
}
}
