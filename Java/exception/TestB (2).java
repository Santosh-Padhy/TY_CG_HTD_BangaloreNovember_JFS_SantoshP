//Null pointer Exception
public class TestB {
	
void write() {
String s1 = null;
try {
	System.out.println("length of string is"+s1.length());
}
catch(NullPointerException e) {
	System.out.println("Exception is handled");
}
}
	

public static void main(String[] args) {
	System.out.println("started");
	TestB b1 = new TestB();
	b1.write();
	System.out.println("ended");
	
}






}
