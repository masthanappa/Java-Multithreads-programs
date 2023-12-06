package com.kn.multithread7;

public class Dummy {

	public static void main(String[] args) {
		Dummy d1=new Dummy();
		d1.m1();
	}
	public void m1() {
		System.out.println("Called m1()");
		m2();

	}
	public void m2() {
		System.out.println("Called m2()");
	}

}
