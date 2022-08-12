package com.lti.collection;

import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> l = new HashSet<>();
		l.add("one");
		l.add("two");
		l.add("two");
		l.add("four");
		l.add("five");
		
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		SortedSet<String> ss=new TreeSet<>();
		
		ss.add("one");
		ss.add("two");
		ss.add("two");
		ss.add("four");
		ss.add("five");
		
		Iterator<String> i1=ss.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
	}

}
