package com.core;

public class ArraysConcept {

	public static void main(String[] args) {
		int[]a = {10, 20, 30, 40, 50};
		
		int[]b = {22, 44, 33, 21};
		String names[]= {"rama", "krishna", "hanuman", "ravi"};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println(a.length);
		
		
		System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
