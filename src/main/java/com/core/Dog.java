package com.core;

public class Dog {
	String name;
	int age;
	
	public Dog() {
		name="Cinnamon";
		age=8;
	}
	
	public Dog(String name) {
		this.name=name;
		//this.age=age;
	}
	
	public Dog(int age) {
		this.age=age;
	}
	
	public Dog(String name, int age) {
		this.name=name;
		this.age=age;
	}

}
