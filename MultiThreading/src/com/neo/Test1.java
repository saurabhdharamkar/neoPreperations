package com.neo;

class MultiThreading3 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread 1");
	}
	
}

class MultiThreading4 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread 2");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		MultiThreading3 mt3=new MultiThreading3();
		Thread th=new Thread(mt3);
		th.start();
		
		MultiThreading4 mt4=new MultiThreading4();
		Thread th1=new Thread(mt4);
		th1.start();
	}
}
