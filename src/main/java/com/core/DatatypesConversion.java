package com.core;

public class DatatypesConversion {

	public static void main(String[] args) {
		
		int a = 100;
		
		byte b=(byte) a;
		
		//convert from String to char
		String myStr = "j";
		char myChar = myStr.charAt(0);
		
		//convert from String to int
		String myRow = "13";
		int myRowInt=Integer.parseInt(myRow);
		
		//convert from int to char
		int c = 1;
		char ch = (char) c;
		
		//convert from int to String
		int d=100;
		String myString=Integer.toString(d);
		
		//convert from char to String
		char v = 'l';
		String u = Character.toString(v);
		
		//convert from char to integer
		char w = '6';
		int x = Character.getNumericValue(w);
		
		System.out.println(b);
		
		System.out.println(myChar);
		System.out.println(myRowInt);
		System.out.println(ch);
		System.out.println(myString);
		System.out.println(u);
		System.out.println(x);

	}

}
