package com.kn.multithread5;

public class InstragramApp {

	public static void main(String[] args) {
		
		Chatting c=new Chatting();
		Reels r= new Reels();
		c.start();
		r.start();
		
	}

}
