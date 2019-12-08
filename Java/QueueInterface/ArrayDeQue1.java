package com.collection.java;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeQue1 {
	public static void main(String[] args) {
		 ArrayDeque a1 = new ArrayDeque();
		 a1.add(23);
		 a1.add(2);
		 a1.add(34);
		// a1.add(null);
		 Iterator itr  = a1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 
		 
		 
		 
		 
		 System.out.println(a1);

	}

}
