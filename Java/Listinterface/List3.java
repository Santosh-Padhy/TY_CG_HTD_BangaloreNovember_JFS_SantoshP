import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List3 {
public static void main(String[] args) {
	
	ArrayList<String>s2 = new ArrayList<String>();
	s2.add("xyz");
	s2.add("ycb");
	
	
	ArrayList<String> s1 = new ArrayList<String>();
	s1.add("Santosh");
	s1.add("rudra");
	s1.add("sonu");
	s1.add("Manas");
	
	System.out.println(s1.size());
	System.out.println(s1.isEmpty());
	System.out.println(s1.contains(56));
	s1.add("mama");
	System.out.println(s1);
	s1.remove(2);
	s1.remove(new String("Santosh"));
	System.out.println(s1);

	s1.addAll(s2);
	System.out.println(s1);
	System.out.println(s1.containsAll(s2));
	s1.add(3, "wwe");
	System.out.println(s1);
	s1.remove(3);
	System.out.println(s1);
	System.out.println(s1.lastIndexOf("ycb"));
	System.out.println(s1.get(4));
	s1.set(4, "michele");
	System.out.println(s1);
List s3  =	s1.subList(2, 4);
System.out.println(s3);
	
}
}
