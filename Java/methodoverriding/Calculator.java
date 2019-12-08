package methodoverriding;

public class Calculator {
	int add(int a) {
		return a+a;
	}
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a)
	{
		return a+a;
	}
 static void multiply(int a) {
	 System.out.println(a+a);
 }
 static void multiply(int a ,int b) {
	 System.out.println(a+b);
 }
  static void multiply(double d) {
	  System.out.println(d*d);
	 
 }
}
