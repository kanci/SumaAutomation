package com.core;

public class SuperMarket extends SundayMarket {

	public static void main(String[] args) {
		SuperMarket spm = new SuperMarket();
		spm.bananas();
		spm.grapes();
		spm.cloths();
		spm.mango();
		//market.potato();

	}
	
	public void cloths() {
		System.out.println("Cloths");
	}
	
	public void redDahls() {
		System.out.println("Red dahls");
	}
	
	public void coolDrink() {
		System.out.println("Cool drink");
		
	}

}
