package com.core;

public class StringProgram {

	public static void main(String[] args) {
		String name1="Rama";
		String name2="Hanuma";
		String name3="Seeta";
		String name4="Lakshmana";
		String name5="Bhaaratha";
		String name6="GOPI";
		String name7="murali";
		String name8="RAMA";
		
		System.out.println(name6.toLowerCase());
		
		System.out.println(name7.toUpperCase());
		
		System.out.println(name2.length());
		
		System.out.println(name1.concat(name2));

		System.out.println(name3.charAt(2));
		
		System.out.println(name4.contains("R"));
		
		System.out.println(name4.contains("s"));
		
		System.out.println(name5.endsWith("a"));
		
		System.out.println(name6.startsWith("G"));
		
		System.out.println(name7.isEmpty());
		
		System.out.println(name1.endsWith(name8));
		
		
	}

}
