package com.core;

import java.util.HashSet;
import java.util.Iterator;

public class FoodSet {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		
		hash.add("beans");
		hash.add("cheese");
		hash.add("milk");
		hash.add("beans");
		
		System.out.println(hash);
		
		Iterator<String> loop = hash.iterator();
		
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}

	}

}
