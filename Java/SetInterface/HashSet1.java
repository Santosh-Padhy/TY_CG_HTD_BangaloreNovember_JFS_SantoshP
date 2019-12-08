import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add(12);
		h1.add(45);
		h1.add(67);
		h1.add(null);
		for(Object o1:h1) {
		System.out.println(o1);
			
			HashSet<String> s1 = new HashSet<String>();
			s1.add("Sheree");
			s1.add("Suman");
			s1.add("Vandana");
			for (String string : s1) {
				System.out.println(string);
			}
			
			
		}

	}
}


