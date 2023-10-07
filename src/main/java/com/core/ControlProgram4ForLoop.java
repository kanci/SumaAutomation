package com.core;

public class ControlProgram4ForLoop {

	public static void main(String[] args) {
		//prog4
		//print 1 3 5 7 9
		
		for(int i=1; i<=9; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//prog5
		//print 2 4 6 8 10
		for(int i=2; i<=10; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println();
		//prog6
		//1 2 3 5 8 13, NOT 11 2 3 5 8 13
		int a=0;
		int b=1;
		int c;
		for(int i=1; i<=6; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}

}
