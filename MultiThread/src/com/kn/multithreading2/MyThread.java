package com.kn.multithreading2;

public class MyThread {
  public void run() {
	  Thread t1=Thread.currentThread();
	  System.out.println(t1);
  }
}
