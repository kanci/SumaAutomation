package com.core;

public class FruitMarket {

	public static void main(String[] args) {
		FruitMarket fr = new WalMart();
		FruitMarket market = new FruitMarket();
		
		fr.apple();
		market.apple();

	}
	
	public void mango() {
		System.out.println("FruitMarket mango price is 10 rupees");
	}
	
	public void apple() {
		System.out.println("FruitMarket apple price is 15 rupees");
	}
	
	public void pomo() {
		System.out.println("FruitMarket pomo price is 20 rupees");
	}
	

}
