package org.oar.com.java;

public class TestQspider {
	public static void main(String[] rags) {
		Qspider oar = new Qspider();
		oar.swipe();
		oar.swipe();
		Qspider btm  = new Qspider();
		btm.swipe();
		btm.swipe();
		System.out.println(oar.branchCount);
		System.out.println(Qspider.totalCount);
		System.out.println(btm.branchCount);
		
		
		
	}

}
