import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
public static void main(String[] args) {
	LinkedHashSet<Employee> l2 = new LinkedHashSet<Employee>();
	l2.add(new Employee(34,"Ramesh"));
	l2.add(new Employee(34,"Ramesh"));
	
	Iterator<Employee> itr = l2.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
}
}
