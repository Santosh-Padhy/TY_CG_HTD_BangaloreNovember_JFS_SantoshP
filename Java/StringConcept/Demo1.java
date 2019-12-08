import java.lang.*;
public class Demo1 {
public static void main(String[] args) {
	String s1 = "Santosh";
	String s2 = "manas";
	//System.out.println(s1.hashCode());
//	System.out.println(s2.hashCode());
	String s3 = new String("Sonu");
	System.out.println(s3.hashCode());
	s3 = new String("Sonu");
	System.out.println(s3.hashCode());
	s1 = new String("Shree");
	//System.out.println(s1.hashCode());
	//System.out.println(s3.hashCode());
	String s4 = "Santosh";
	//System.out.println(s4.hashCode());
	String s6 = "Santosh";
	System.out.println( s6.substring(3,7));
	

	
	
}
}
