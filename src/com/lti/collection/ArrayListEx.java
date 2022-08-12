package com.lti.collection;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<>();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		
		Collections.reverse(l);
		
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collections.sort(l);
		
		Iterator<String> i1=l.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
