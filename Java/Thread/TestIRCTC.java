package com.capg.thread.creatingThread;

public class TestIRCTC {
public static void main(String[] args) {
	
System.out.println("main started");
	IRCTC i2 = new IRCTC();
	User1 u2 = new User1(i2);
	u2.start();
	User1 u3 = new User1(i2);
	u3.start();
	
	
	
//	try {
//		Thread.sleep(600);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	i2.leaveMe();
	
	System.out.println("main ended");
	
}
}
