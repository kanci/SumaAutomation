package com.core;

public class Car implements IndiaCar {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.tata();
		c.ford();
		c.toyota();
		c.tesla();
		

	}
	
	public void ford() {
		System.out.println("Ford");
	}
	
	public void volkswagon() {
		System.out.println("Volkswagon");
	}

	public void toyota() {
		System.out.println("toyota");
		
	}

	public void tata() {
		System.out.println("tata");
		
	}
	
	public void tesla() {
		System.out.println("Tesla");
	}

}
