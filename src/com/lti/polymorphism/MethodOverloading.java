package com.lti.polymorphism;

//Static/Compile Time Polymorphism
public class MethodOverloading {

	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	public float sum(float x, float y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.sum(56, 76));
		System.out.println(m.sum(56, 76, 7));
		System.out.println(m.sum(56.4f, 76.6f));
	}

}
