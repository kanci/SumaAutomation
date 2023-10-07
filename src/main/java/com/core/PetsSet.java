package com.core;

import java.util.HashSet;
import java.util.Iterator;

public class PetsSet {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		
		s.add("fish");
		s.add("cat");
		s.add("fish");
		s.add("cat");
		s.add("cat");
		s.add("parrot");
		s.add("parrot");
		s.add("dog");
		s.add("mouse");
		s.add("parakeet");
		s.add("dog");
		s.add("lion");
		
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
