package com.lti.oops;

//Base Class or Super Class or Parent Class
class Car{
	String name="car";
	public void getDrive() {
		System.out.println("nice");
	}
}

//Single Level Inheritance
//Child Class or Derived Class or Sub Class
class Maruti extends Car{
	public void getName(){
		System.out.println(name);
	}
}

//Multi Level Inheritance
class Suzuki extends Maruti{
	
}

public class InheritanceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti m=new Maruti();
		m.getDrive();
		m.getName();
		
		Suzuki s=new Suzuki();
		s.getDrive();
		s.getName();
		System.out.println(s.name+m.name);
	}

}
