package com.lti.collection;
import java.util.*;
public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new Hashtable<>();
		mp.put(1, "One");
		mp.put(2, "Two");
		mp.put(3, "Three");
		
		for (Map.Entry<Integer,String> entry : mp.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
		
	}

}
