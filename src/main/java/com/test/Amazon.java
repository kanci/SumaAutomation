package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Exception  {
		
		//initializing browser
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//select which one...
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.xpath("(//*[normalize-space()='Sign in'])[3]")).click();
		
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("email")).sendKeys("sumancherla88@gmail.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sumancherla88@gmail.com");
		
		Thread.sleep(2000);
	//	driver.findElement(By.id("continue")).click();
	//	driver.findElement(By.xpath("//*[@id='continue']")).click();//click continue button
		
		//new to sign in, click on "create your amazon account" button
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Suma Kancherla");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sumancherla88@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SumaGani1234!!");
		driver.findElement(By.xpath("//input[@name='passwordCheck']")).sendKeys("SumaGani1234!!");
		
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//input[@id='continue']")).click();//i don't have amazon account, so I might not use it then, but this button click verify my email address
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
