package com.core;

public class ReturnProgram {

	public static void main(String[] args) {
		ReturnProgram rp=new ReturnProgram();
		System.out.println(rp.sum());

	}
	public int sum() {
		int a=10;
		int b=5;
		int c=a+b;
		return c;	
	}
}
