import java.util.*;
public class LinkedList3 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add(23);
	l1.add(56);
	l1.add(89);
	l1.add(78);
	System.out.println("l1");
	System.out.println("================================ peak first and peek last");
	System.out.println(l1.peek());
	System.out.println(l1.peekFirst());
	System.out.println(l1.peekLast());
	System.out.println(l1);
	System.out.println("==================================== poll ()");
	System.out.println(l1.poll());
	System.out.println(l1.pollFirst());
	System.out.println(l1.pollLast());
	System.out.println(l1);
	System.out.println("=========================offer & offerfirst& offerLast");
	LinkedList l2 = new LinkedList();
	l2.add(45);
	l2.add(76);
	l2.add(0);
	l2.add(22);
	System.out.println(l2);
	l2.offer(63);
	System.out.println(l2);
	

	l2.offerFirst(67);
System.out.println(l2);
l2.offerLast(90);
System.out.println(l2);
	
}
}
