package com.lti.oops3;

//Concept of Heirarchial Level Inheritance in Abstraction
class Maruti extends Car{
	//Concept of Method Overriding in Abstraction
	public void getColor() {
		System.out.println("Blue");
	}
}

class BMW extends Car{
	public void getColor() {
		System.out.println("Deep Green");
	}
}

public class AbstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Maruti();
		c1.getColor();
		c1.setYom("2018");
		System.out.println("Year of manufacturing is: "+c1.getYom());
		Car c2=new BMW();
		c2.getColor();
		c2.setYom("2019");
		System.out.println("Year of manufacturing is: "+c2.getYom());
	}

}
