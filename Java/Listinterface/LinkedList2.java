import java.util.*;
public class LinkedList2 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add(23);
	l1.add(45);
	l1.add(34);
	System.out.println(l1);
	l1.addFirst(2);
	System.out.println(l1);
	l1.addLast(34);
	System.out.println(l1);
	System.out.println("----------------------------------------------remove------");
	l1.remove();
	System.out.println(l1);
	System.out.println("------------remove first & remove last");
	l1.removeFirst();
	System.out.println(l1);
	l1.removeLast();
	System.out.println(l1);
	LinkedList l2 = new LinkedList();
	l2.add(67);
	l2.add(78);
	l2.add(67);
	l2.add(78);
	System.out.println(l2);
	System.out.println("---------------remove firstOccuranec & remove lastOccurance");
	l2.removeFirstOccurrence(67);
	System.out.println(l2);
	l2.removeLastOccurrence(78);
	System.out.println(l2);
	System.out.println("-----------------getfirst & get last");
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
}
}
