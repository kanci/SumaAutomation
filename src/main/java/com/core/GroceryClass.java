package com.core;

public class GroceryClass extends GroceryAbstr implements GroceryI {

	public static void main(String[] args) {
		GroceryClass g = new GroceryClass();
		g.beans();
		g.bread();
		g.cheese();
		g.waffles();
		g.strawberry();
		g.tomato();

	}

	public void bread() {
		System.out.println("Bread");
		
	}

	public void cheese() {
		System.out.println("Cheese");
		
	}

	public void beans() {
		System.out.println("beans");
		
	}

	public void waffles() {
		System.out.println("waffles");
		
	}

	@Override
	public void tomato() {
		System.out.println("Tomato");
		
	}

	@Override
	public void eggplant() {
		System.out.println("eggplant");
		
	}

	@Override
	public void strawberry() {
		System.out.println("strawberry");
		
	}

}
