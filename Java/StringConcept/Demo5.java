
public class Demo5 {
public static void main(String[] args) {
	StringBuilder b1 = new StringBuilder("Aditya");
	System.out.println(b1.hashCode());
	b1 = b1.append("Sinha");
	System.out.println(b1.hashCode());
	
}
}
