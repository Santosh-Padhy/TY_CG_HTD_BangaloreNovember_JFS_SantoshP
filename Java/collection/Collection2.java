package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main(String[] args) {
	Collection c2 = new ArrayList();
		c2.add("Srikantr");
		c2.add("Rohit");
		System.out.println(c2);
		c2.add(456.98);
		System.out.println(c2);
		Collection c6 = new ArrayList();
		c6.add(23);
		c6.add(34);
		Object a[] = c6.toArray();
		for (int i= 0;i<a.length;i++)
			System.out.println(a[i]);
		
		
	}

}
