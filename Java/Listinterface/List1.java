
import java.util.ArrayList;
import java.util.List;

public class List1 {
public static void main(String[] args) {
	List l1 = new ArrayList();
	l1.add(0, 12);
	l1.add(1, 14);
	l1.add(2, 13);
	l1.add(3, 45);
	//System.out.println(l1);
	l1.add(1, 45);
	//System.out.println(l1);
	l1.remove(3);
	System.out.println(l1);
	for(int i=0;i<l1.size();i++)
		System.out.println(l1.get(i));
	System.out.println("--------------");
	List l2 = new ArrayList();
	l2.add(12);
	l2.add(23);
	l2.addAll(0, l1);
	System.out.println(l2);
	l2.add(6, 56);
	System.out.println(l2);
	System.out.println(l2.lastIndexOf(110));
	
	List l5= l2.subList(2, 5);
	System.out.println(l5);
	
	
}
}
