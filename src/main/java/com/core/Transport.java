package com.core;

public class Transport {

	public static void main(String[] args) {
		Transport ts = new Transport();
		ts.vehicle();
		ts.vehicle(3);
		ts.vehicle("Mazda", 5);

	}
	
	public void vehicle() {
		System.out.println("Transport vehicle");
	}
	
	public void vehicle(int numbers) {
		System.out.println("There are "+numbers + " in vehicle");	
	}
	
	public void vehicle(String name, int numbers) {
		System.out.println("The vehicle name is: "+name+". There are "+numbers + " transporting in vehicle.");	
	}

}
