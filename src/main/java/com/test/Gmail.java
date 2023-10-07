package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		driver.findElement(By.id("identifierId")).sendKeys("sumancherla88@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("number1232XCIOU");
		//driver.findElement(By.name("login")).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='identifierNext']/div/button")).click();
		
		Thread.sleep(3000);

	}

}
