package com.collection.java;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		PriorityQueue<Seller> p1 = new PriorityQueue<Seller>();
           p1.offer(new Seller(2,"Shree"));
           p1.offer(new Seller(45,"Sushant"));
           for (Seller s1 : p1) {
			System.out.println(s1);
		}
	}

}
