package com.capg.thread.creatingThread;

public class TestPVR {
public static void main(String[] args) {
	System.out.println("main started");
	PVR p1 = new PVR();
	User u1 = new User(p1);
	u1.start();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
	}
	
	p1.leaveMe();
	
	
	System.out.println("main ended");
}
}
