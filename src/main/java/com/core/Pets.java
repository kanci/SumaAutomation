package com.core;

public class Pets extends USAPet {

	public static void main(String[] args) {
		Pets p = new Pets();
		p.lion();
		p.tiger();
		p.dove();
		p.duck();
		p.hamster();
		p.cat();
		p.dog();
		

	}
	
	public void lion() {
		System.out.println("lion");
	}
	
	public void tiger() {
		System.out.println("tiger");
	}
	
	
	@Override
	public void dog() {
		System.out.println("dog");
		
	}

	@Override
	public void cat() {
		System.out.println("cat");
		
	}

	@Override
	public void hamster() {
		System.out.println("hamster");
		
	}

	@Override
	public void fish() {
		System.out.println("fish");
		
	}
}
