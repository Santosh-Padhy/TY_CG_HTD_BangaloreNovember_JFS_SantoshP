package checkedException;

public class ExceptionA {
 public static void main(String[] args) {
	 System.out.println("main started");
	try {
		Class c1 = Class.forName("checK.Person");
		System.out.println("class found");
	} catch (ClassNotFoundException e) {

		System.out.println("Class is  not found Exception");
	}
	
	System.out.println("main ended");
}
}
