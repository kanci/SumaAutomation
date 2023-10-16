package com.gitScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IHGTestScript {
	
	@Test
	public void ihg() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Suma");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kancherla");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumancherla88@gmail.com");
		driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("sumancherla88@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SumaGani88@123");
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("SumaGani88@123");
		
	}

}
