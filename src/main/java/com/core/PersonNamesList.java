package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonNamesList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Rama");
		ar.add("Ganesh");
		ar.add("Suma");
		ar.add("Lakshmi");
		ar.add("Venkata");
		ar.add("Sushma");
		
		System.out.println(ar);
		
		ar.add("Susan");
		ar.add("Peter");
		ar.add("Mani");
		ar.add("Suma");
		ar.add("Lakshmi");
		
		System.out.println(ar);
		
		System.out.println(ar.get(3));
		System.out.println();
		
		Iterator<String> it = ar.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
