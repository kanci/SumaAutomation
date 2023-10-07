package com.core;

public class WalMart extends FruitMarket {

	public static void main(String[] args) {
		WalMart mart = new WalMart();
		mart.apple();

	}
	
	public void grapes() {
		System.out.println("Walmart grapes price is 30 rupees");
	}
	
	public void banana() {
		System.out.println("Walmart banana price is 25 rupees");
	}
	
	public void pear() {
		System.out.println("Walmart pear price is 20 rupees");
	}
	
	public void apple() {
		System.out.println("Walmart apple price is 22 rupees");
	}
}
