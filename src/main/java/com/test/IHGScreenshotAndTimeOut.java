package com.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGScreenshotAndTimeOut {
	
	public static int i=0;//static means its common for all the class
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");

		driver=new ChromeDriver();
		
		IHGScreenshotAndTimeOut ihg = new IHGScreenshotAndTimeOut();
		driver.get("https://www.ihg.com/hotels/us/en/reservation");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//this is for joining
		driver.findElement(By.xpath("//a[normalize-space()='Join']")).click();
		
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Suma");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kancherla");
		ihg.snap();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumancherla88@gmail.com");
		driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("sumancherla88@gmail.com");
		ihg.snap();

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SumaGanesh88!!*");
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("SumaGanesh88!!*");
		
		
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		Select c = new Select(country);
		c.selectByIndex(1);
		ihg.snap();

		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("10429 River Birch Run");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Fort Wayne");
		
		ihg.snap();
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.xpath("//select[@id='stateList']"));
		Select s = new Select(state);
		
		s.selectByValue("IN");
		
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("46814");
		
		ihg.snap();
		
		//for multiple checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='svg-checkbox unchecked']"));
		for(int i=0; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		
	
		ihg.snap();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Join now']")).click();
		ihg.snap();
		
		Thread.sleep(5000);

		driver.close();

	}
	
	public void snap() throws IOException {
		Random r = new Random();
		if(r.nextInt()!=0) {
			  i=i+1;
		}
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//Images//pic"+i+".png");
		FileUtils.copyFile(src,dest);
	}
}
