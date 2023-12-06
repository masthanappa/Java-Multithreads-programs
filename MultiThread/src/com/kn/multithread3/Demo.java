package com.kn.multithread3;

public class Demo {

	public static void main(String[] args) {
		PrintName t1=new PrintName();
		t1.start();
		PrintCharecter t2 =new PrintCharecter();
		t2.start();

	}

}
