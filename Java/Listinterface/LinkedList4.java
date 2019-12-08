import java.util.*;
public class LinkedList4 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add(34);
	l1.add(67);
	l1.add(90);
	System.out.println(l1);
	l1.push(12);
	System.out.println(l1);
	l1.pop();
	System.out.println(l1);
	System.out.println(l1.element());
	System.out.println(l1);
}
}
