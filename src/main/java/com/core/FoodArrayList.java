package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("milk");
		ar.add("cheese");
		ar.add("rice");
		ar.add("milk");
		ar.add("beans");
		ar.add("beans");
		ar.remove(0);
		
		System.out.println(ar);
		
		Iterator<String> it = ar.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
