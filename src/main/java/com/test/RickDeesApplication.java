package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RickDeesApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.rick.com/contact");
		
		driver.findElement(By.name("fname")).sendKeys("Suma");
		driver.findElement(By.name("lname")).sendKeys("Kancherla");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sumancherla88@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.rick.com/challenge-2023-34");
		
		Thread.sleep(5000);
		driver.findElement(By.className("eTv7qUMqLR9lJxpIAC3F")).sendKeys("Suma");
		driver.findElement(By.name("lname")).sendKeys("Kancherla");
		
		WebElement country = driver.findElement(By.xpath("//select[@aria-label='Country']"));
		
		Select s = new Select(country);
		
		s.selectByValue("US");
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("India");
		
		Thread.sleep(5000);
		
		s.selectByIndex(22);
		
		Thread.sleep(5000);
		
	
		
		driver.close();

	}

}
