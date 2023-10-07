package com.core;

public class DataTypePractice {

	public static void main(String[] args) {
		//practicing datatypes
		
		byte number=-128;//-128 is the minimum length; -129 won't support because it's out of range, and memory is full capacity
		byte number2=127;//127 is the maximum length; 128 won't support because it's out of range, and memory is full capacity
		
		short number3 = -32768;
		short number4 = 32767;
		
		int number5 = -2147483648;
		int number6= 2147483647;
		
		long number7 = -214748364;//the actual minimum of long is -9223372036854775808
		long number8 = 2147483647;//the actual maximum of long is 9223372036854775807
		
		boolean value=true;
		
		double num9 = 100.22222;
		float num10=20.33f;
		
		System.out.println(number + " is a minimum byte");
		System.out.println(number2 + " is a maximum byte");
		
		System.out.println(number3 + " is a minimum short");
		System.out.println(number4 + " is a maximum short");
		
		System.out.println(number5 + " is a minimum int");
		System.out.println(number6 + " is a maximum int");
		
		System.out.println(number7 + " is a minimum long for me");
		System.out.println(number8 + " is a maximum long for me");
		
		System.out.println(value);
		System.out.println(num9);
		System.out.println(num10);
	}

}
