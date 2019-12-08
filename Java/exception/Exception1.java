
public  class Exception1 {
void exception(int a,String b) {

	try {
	System.out.println(500/a);
	     try {
	         System.out.println(b.length());
	                           }
	
	         catch(NullPointerException e1)
	{
	System.out.println("Dont pass the null values");
                       }
	}
	catch(ArithmeticException e2) 
	{
		System.out.println("Dont pass the null value");
	}
		
	

}
public static void main(String[] args) {
	Exception1 e1 = new Exception1();
	e1.exception(4, null);
	e1.exception(0,"ramu");
	
}
}