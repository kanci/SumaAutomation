package com.core;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=12;
		int c=10;
		int d=13;
		int f=10;
		
		//using logical AND
		System.out.println((a<b) && (c==f)); //one statement true, and other statement true
		System.out.println((c!=f) && (d>b)); //one statement true, other statement false
		System.out.println((d==a) && (f>a));//one statement false, other statement false
		System.out.println((f==b) && (d>f)); //one statement false, other statement true
		
		System.out.println();

		//using logical OR
		System.out.println((f==c) || (d>f));//one statement true, other statement true
		System.out.println((b<a)||(c==f)); //one statement false, other statement true
		System.out.println((b>=d)||(f!=c));//one statement false, other statement false
		System.out.println((d>c)||(f>d));//one statement true, other statement false

	}

}
