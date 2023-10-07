package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumbersTestNG {
	
	@AfterSuite
	public void one() {
		System.out.println("one");
		
	}
	
	@AfterTest
	public void two() {
		System.out.println("two");
	}
	
	@AfterClass
	public void three() {
		System.out.println("three");
	}
	
	@AfterMethod
	public void four() {
		System.out.println("four");
	}
	
	@Test
	public void five() {
		System.out.println("five");
	}
	
	@BeforeMethod
	public void six() {
		System.out.println("six");
	}
	
	@BeforeClass
	public void seven() {
		System.out.println("seven");
	}
	
	@BeforeTest
	public void eight() {
		System.out.println("eight");
	}
	
	@BeforeSuite
	public void nine() {
		System.out.println("nine");
	}

}
