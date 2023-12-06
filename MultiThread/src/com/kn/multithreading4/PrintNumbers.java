package com.kn.multithreading4;

public class PrintNumbers extends Thread {

	public void run() {
		  for(int i=1; i<=5; i++) {
			  System.out.println(i);
		  }
	}
}
