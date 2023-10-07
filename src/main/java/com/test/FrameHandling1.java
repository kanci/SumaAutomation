package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame("singleframe");
		//WebElement ele = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		//driver.switchTo().frame(ele);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		//driver.switchTo().frame(textbox);
		textbox.sendKeys("Suma");
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
