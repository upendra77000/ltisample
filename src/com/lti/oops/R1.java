package com.lti.oops;

class R3 implements Readable, Readable2{
	public void getName() {
		System.out.println("Ram");
	}
	
	public void getName2() {
		System.out.println("Satya");
	}
}

class R2 implements Readable{
	public void getName() {
		System.out.println("Ajay");
	}
}

public class R1{
	public static void main(String[] args) {
		Readable r1=new R2();
		r1.getName();
		Readable2 r2=new R3();
		r2.getName2();
		R3 r3=new R3();
		r3.getName();
	}
}