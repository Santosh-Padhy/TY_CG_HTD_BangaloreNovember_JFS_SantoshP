import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List2 {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	
	a1.add(12);
	a1.add(23);
	a1.add(45);
	Iterator<Integer> i1 = a1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	System.out.println("------------------------------------------------------------------------");
	
	ListIterator<Integer> i2 = a1.listIterator();
	while(i2.hasNext()) {
		System.out.println(i2.next());
	}
	
	
	
	
}
}
