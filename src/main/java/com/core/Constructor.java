package com.core;

public class Constructor {
	


	public static void main(String[] args) {
		Dog myDog = new Dog();
		Dog myDog1 = new Dog("Chewy");
		Dog myDog2 = new Dog(6);
		Dog myDog3 = new Dog("praban", 30);
		
		System.out.println(myDog.age);
		System.out.println(myDog1.name);
		System.out.println(myDog2.age);
		System.out.println(myDog3.name + " " + myDog3.age);
		

	}

}
