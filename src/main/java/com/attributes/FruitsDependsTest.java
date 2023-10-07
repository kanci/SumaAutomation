package com.attributes;

import org.testng.annotations.Test;

public class FruitsDependsTest {
	
	
	@Test(dependsOnMethods= {"apple"})
	public void banana() {
		System.out.println("banana");
	}
	
	@Test(dependsOnMethods= {"mango"})
	public void pears() {
		System.out.println("pears");
	}
	
	@Test(dependsOnMethods= {"pears"})
	public void apple() {
		System.out.println("apple");
	}
	

	
	@Test(dependsOnMethods= {"grapes"})
	public void mango() {
		System.out.println("mango");
	}
	
	@Test()
	public void grapes() {
		System.out.println("Grapes");
	}

}
