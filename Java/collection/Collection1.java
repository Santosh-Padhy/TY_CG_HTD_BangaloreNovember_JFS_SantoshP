package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	public static void main(String[] args) {
		
	
Collection c1 = new ArrayList();

	c1.add(2);
	System.out.println(c1);
	c1.remove(2);
	System.out.println(c1);
  System.out.println(c1.size());
  System.out.println(c1.isEmpty());
  System.out.println(c1.contains(2));
  c1.add("Santosh");
  System.out.println(c1);
  System.out.println("-------------------------------------------------------------");
  
  Collection c4 = new ArrayList();
  c4.add(25);
  c4.add(23);
  c4.add(12);
  c4.add(14);
  System.out.println(c4);
  Collection c5 = new ArrayList();
  c5.add(25);
  c5.add(23);
  c5.add(12);
  c5.add(14);
  
  c4.retainAll(c5);
  System.out.println(c4);
 // c4.clear();
  System.out.println(c4.containsAll(c5));
  
  
  
	
}
}
