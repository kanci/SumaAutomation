package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru99 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v1/index.php");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("sumakanc");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SumaGani88");
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@name='btnReset']/preceding-sibling::input")).click();
		
		Thread.sleep(3000);
	
		//there's an alert button saying user is not valid, user should click ok
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("ganeshgi");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SumaGani83");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='btnLogin']/following-sibling::input")).click();
		
		Thread.sleep(10000);
		
		driver.close();
	}

}
