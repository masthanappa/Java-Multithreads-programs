package com.kn.multithreading4;

public class Demo {

	public static void main(String[] args) {
     PrintNumbers t1= new PrintNumbers();
     t1.start();
     PrintCharcters t2= new PrintCharcters();
     t2.start();
	}

}
