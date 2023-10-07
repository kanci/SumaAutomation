package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGJoin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.ihg.com/hotels/us/en/reservation");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		
		
		//this is for joining
		driver.findElement(By.xpath("//a[normalize-space()='Join']")).click();
		
		
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@class='logIn-link'])[2]")).click();
		//driver.findElement(By.xpath("//a[text()[contains(.,'Sign In')]]")).click();
		
		//Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Suma");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kancherla");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumancherla88@gmail.com");
		driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("sumancherla88@gmail.com");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SumaGanesh88!!*");
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("SumaGanesh88!!*");
		
		
		Thread.sleep(5000);
		
		
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		Select c = new Select(country);
		c.selectByIndex(5);
		//c.selectByIndex(1);//USA country

		
		
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("10429 River Birch Run");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Fort Wayne");
		
		Thread.sleep(5000);
		
		WebElement state = driver.findElement(By.xpath("//select[@id='stateList']"));
		Select s = new Select(state);
		
		s.selectByValue("IN");
		
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("46814");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Join now']")).click();

		Thread.sleep(5000);

		driver.close();
	}

}
