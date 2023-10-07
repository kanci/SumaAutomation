package com.core;

import java.util.LinkedList;
import java.util.ListIterator;

public class FoodLinkedList {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("cheese");
		link.addLast("milk");
		link.addFirst("butter");
		link.remove(1);
		link.add(2, "beans");
		link.addLast("ice cream");
		link.addFirst("mochi");
		
		System.out.println(link);
		
		ListIterator<String> listIterator = link.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		

	}

}
