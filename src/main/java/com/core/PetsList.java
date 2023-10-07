package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class PetsList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("dog");
		ar.add("cat");
		ar.add("fish");
		ar.add("parrot");
		ar.add("dog");
		ar.add("fish");
		
		System.out.println(ar);
		ar.add("pig");
		ar.add("snake");
		ar.add("mouse");
		ar.add("fish");
		
		System.out.println(ar);
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println();
		Iterator<String> it = ar.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}