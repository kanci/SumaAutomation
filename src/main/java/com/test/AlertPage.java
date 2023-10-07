package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@class='analystic']")).click();//already it's clicked "alert with ok" button, //just to note if more than one, if first is selected, then no need to use [1] stuff
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()[contains(.,'click the button')]]")).click();//first selection, just use general approach
		
		Thread.sleep(5000);
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()[contains(.,'click the button')]])[2]")).click();

		Thread.sleep(3000);
		
		
		a.accept();//this clicks OK
		//a.dismiss();//this clicks cancel
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()[contains(.,'click the button')]])[3]")).click();

		Thread.sleep(3000);
		
		a.sendKeys("Suma");
		a.accept();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
