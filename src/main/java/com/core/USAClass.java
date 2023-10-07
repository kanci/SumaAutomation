package com.core;

public class USAClass implements USA {
 
	public static void main(String[] args) {
		
		USAClass usa = new USAClass();
		usa.newYork();
		usa.washington();
		usa.Chicago();
		usa.Dallas();
		usa.Indianapolis();
		usa.Brooklyn();
		usa.SanFrancisco();
	}
	
	public void newYork() {
		System.out.println("New York");
	}
	
	public void washington() {
		System.out.println("Washington");
	}

	public void Chicago() {
		System.out.println("Chicago");
		
	}

	public void Dallas() {
		System.out.println("Dallas");
		
	}

	public void Indianapolis() {
		System.out.println("Indianapolis");
		
	}

	public void Brooklyn() {
		System.out.println("Brooklyn");
	}

	public void SanFrancisco() {
		System.out.println("San Francisco");
		
	}
}
