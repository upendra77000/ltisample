package com.lti.polymorphism;

class Animal{
	public void run() {
		System.out.println("Animal is runing");
	}
}

public class MethodOverriding extends Animal{

	public void run() {
		//super.run();
		System.out.println("MethodOverriding is runing");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m=new MethodOverriding();
		Animal a=new Animal();
		Animal a1=new MethodOverriding(); 
		MethodOverriding m1=(MethodOverriding)new Animal();
		a1.run();
		a.run();
		m1.run();
	}

}
