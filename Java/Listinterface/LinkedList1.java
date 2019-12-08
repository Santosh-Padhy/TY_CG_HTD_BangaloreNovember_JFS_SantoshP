import java.util.*;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(12);
		l1.add(34);
		l1.add(34);
		l1.add(null);
		l1.add("Santosh");
		ListIterator ltr = l1.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
l1.remove(new Integer(12));
System.out.println(l1);
System.out.println("-----------------------------------------");
for(Object i2:l1)
	System.out.println(i2);
	}

}
