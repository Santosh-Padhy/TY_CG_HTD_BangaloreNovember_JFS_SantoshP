import java.util.*;

public class LinkedHashSet1 {
public static void main(String[] args) {
	LinkedHashSet l1 = new LinkedHashSet();
	l1.add(12);
	l1.add(45);
	l1.add(56);
	l1.add(67);
	Iterator itr = l1. iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	
	}
}
}
