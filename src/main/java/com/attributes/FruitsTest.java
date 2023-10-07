package com.attributes;

import org.testng.annotations.Test;

public class FruitsTest {
	@Test(priority=4)
	public void banana() {
		System.out.println("banana");
	}
	
	@Test(priority=3)
	public void apple() {
		System.out.println("apple");
	}
	
	@Test(priority=2)
	public void pears() {
		System.out.println("pears");
	}
	@Test(priority=1)
	public void mango() {
		System.out.println("mango");
	}
	@Test(priority=0)
	public void grapes() {
		System.out.println("Grapes");
	}
}
