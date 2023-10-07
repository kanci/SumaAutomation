package com.core;

public class Amazon {	

	public static void main(String[] args) {
		//Amazon a = new Amazon();
		//a.amazon();
		//a.amazon(mobile, price);
		Amazon a = new Amazon("samsung",10000);
		Amazon b = new Amazon();
	}
	
	public Amazon() {
		System.out.println("Amazon is online shopping");
	}
	
	public Amazon(String mobile, int price) {
		System.out.println("mobile name: "+mobile);
		System.out.println("price is: "+ price);
	}

}
