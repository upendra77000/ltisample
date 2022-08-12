package com.lti.opps2;

class Car{
	String name="car";
	public void getDrive() {
		System.out.println("nice");
	}
}

class Maruti extends Car{
	public void getMax(){
		System.out.println("50MPH");
	}
}
 
class Audi extends Car{
	public void getMilage(){
		System.out.println("40MPH");
	}
}

public class HeirarchialLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti m=new Maruti();
		m.getMax();
		
		Audi a=new Audi();
		a.getMilage();
	}

}
