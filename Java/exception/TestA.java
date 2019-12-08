package finallyBlock;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main Started");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("dont deal witn zero ");
		}
		finally {
			System.out.println("finally block is excuted");
		}
		
		
		System.out.println("main ended");
		
		
	}
	

}
