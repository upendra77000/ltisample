package com.lti.oops3;

public abstract class Car {
	//"abstract int x=10;" --> Variable can't be declared with abstract type
	//Abstract Method
	public abstract void getColor();
	
	//Non-Abstract Method
	public void getDrive() {
		System.out.println("Nice");
	}
	
	//Concept of Encapsulation in Abstraction
	private String yom;

	public String getYom() {
		return yom;
	}

	public void setYom(String yom) {
		this.yom = yom;
	}
}
