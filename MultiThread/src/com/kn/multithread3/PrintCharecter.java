package com.kn.multithread3;

public class PrintCharecter extends Thread{

	public void run() {
		for(int i=65; i<=69;i++) {
			System.out.println((char)(i));
		}
	}
}
