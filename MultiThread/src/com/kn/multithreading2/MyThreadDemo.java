package com.kn.multithreading2;

public class MyThreadDemo {

	public static void main(String[] args) {
		Thread t2=Thread.currentThread();
		System.out.println(t2);
		
		MyThread t2=new MyThread();
		t2.start();
		t1.setName("MyThread");
		t1.setPriroty(0);
		
	}

}
