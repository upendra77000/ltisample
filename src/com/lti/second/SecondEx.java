package com.lti.second;
import com.lti.first.*;
public class SecondEx {

	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondEx s=new SecondEx();
		s.add(FirstEx.x, 30);
	}

}
