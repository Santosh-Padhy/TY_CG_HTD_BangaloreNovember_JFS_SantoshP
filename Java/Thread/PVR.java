package com.capg.thread.creatingThread;

public class PVR {
 synchronized void bookTicket()
{
	for(int i =0;i<4;i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
  synchronized void leaveMe()
  {
	  notify();
	  System.out.println("notify called");
  }
  
  
}
