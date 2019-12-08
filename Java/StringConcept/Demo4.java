
public class Demo4 {
public static void main(String[] args) {
	StringBuffer b1 = new StringBuffer("John");
	System.out.println(b1.hashCode());
	b1  = b1.append("Sina");
	System.out.println(b1.hashCode());
	
}
}
