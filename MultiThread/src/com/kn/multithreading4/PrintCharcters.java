package com.kn.multithreading4;

public class PrintCharcters extends Thread{
	
     public void run() {
	  for(int i=65; i<=69; i++) {
		  System.out.println(i);
	  }
}
}
