package com.app.thread;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread t1 = new MyThreads();
		Thread t2 =  new MyThreads();
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Both thread ended");
	}

}

class MyThreads extends Thread
{

	@Override
	public void run() {
		System.out.println("My thread is running");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(getName() + "has Finished");
	}
	
}
