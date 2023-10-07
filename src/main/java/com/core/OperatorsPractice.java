package com.core;

public class OperatorsPractice {

	public static void main(String[] args) {
		int i = 20;
		int j = 10;
		int k = 12;
		int l=22;
		int m=23;
		int n=5;
		int o=6;
		
		//arithmetic operators:
		//System.out.println(i+j);
		//System.out.println(i-j);
		//System.out.println(i*j);
		//System.out.println(i/j);
		//System.out.println(i%j); 

		//unary operators:
		//System.out.println(++i);//pre-increment 
		//System.out.println(i++);//post-increment
		//System.out.println(i);
		//System.out.println();
		//System.out.println(j++ + "is the post increment");
		//System.out.println(++k + "is the pre increment");
		
		//System.out.println(l-- + " is the post decrement");
		//System.out.println(--m + " is the pre decrement");
		
		//System.out.println(i);
		//System.out.println(j);
		System.out.println();
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i>j);
		System.out.println(i<j);
		System.out.println(i>=j);
		System.out.println(i<=j);
		
		System.out.println();
		System.out.println(i<j && i==j);
		System.out.println(i<j || i==j);
		System.out.println();
		
		
		//assignment operators
		//i=i+5 is same as i+=5
		System.out.println(i+=5);
		
		System.out.println();
		
		//i%=5 is same as i%=5
		System.out.println(i%=5);
		
		System.out.println();
		
		//i=i=7 is same as i-=7
		System.out.println(i-=7);
		
		System.out.println();
		
		System.out.println(j + " is the current value");
		
		
		System.out.println();
		
		//j=j*6 is same as j*=6
		System.out.println(j*=6);
		
		System.out.println();
		
		
		//j=j/2 is same as j/=2
		System.out.println(j/=2);
		
		System.out.println(j + " is now the current value");
		
	}

}
