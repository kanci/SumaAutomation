package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("automation testing");
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1").switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Select a = new Select(animals);
		
		a.selectByIndex(2);
		
		List<WebElement> opt = a.getOptions();
		System.out.println("The list of animals are: ");
		for(WebElement each:opt) {
			System.out.println(each.getText());
		}
		
		Thread.sleep(3000);
		
		driver.close();

		
	}

}
