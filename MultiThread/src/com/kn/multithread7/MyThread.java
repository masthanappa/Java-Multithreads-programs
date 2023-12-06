package com.kn.multithread7;

public class MyThread extends Thread {
   
	public void run() {
		if (Thread.currentThread().getName().equalsIgnoreCase("Number")) {
			
		}else {
			printCharacters();
			
		}
	}
	
	private void printNumbers() {
	 System.out.println("=====> Printing Numbers Started");
	 for(int i=1; i<=10; i++) {
		 System.out.println("***"+i+"");
	 }
		System.out.println("====> Printing Numbers Ended");
	}
	
private void printCharacters() {
	 System.out.println("=====> Printing Characters Started");
	 for(int i=65; i<=74; i++) {
		 System.out.println((char)i+" ");
	 }
		System.out.println("====> Printing Caraters Ended");
	}
}
