package com.kn.multithread;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		System.out.println("currentThread="+t1);
		

	}

}
//Output--------------------
//currentThread=Thread[main,5,main]