package finallyBlock;

public class TestB {
public static void main(String[] args) {
	GoogleMAp g1 = new GoogleMAp();
	OlaBook o1 = new OlaBook(g1);
	o1.find(null);
	System.out.println("main ends");
	
}
}
