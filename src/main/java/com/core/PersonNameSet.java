package com.core;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.Set;

public class PersonNameSet {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		s.add("Ganesh");
		s.add("Lakshmi");
		s.add("Lakshmi");
		s.add("Suma");
		s.add("Venkata");
		s.add("Suma");
		s.add("Suma");
		
		System.out.println(s);
		System.out.println(s.contains("Lakshmi"));
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
