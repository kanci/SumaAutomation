package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MedPlusMart {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.medplusmart.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("signInLink")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("13501225577");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
