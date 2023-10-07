package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);//very important, since timeralert, wait for 5 seconds
		a.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(2000);
		//a.accept();//ok or.....
		a.dismiss();//cancel
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Thread.sleep(2000);
		a.sendKeys("Suma Kancherla");
		a.accept();//ok or ...
		//a.dismiss();//cancel
		
		Thread.sleep(3000);
		driver.close();

	}

}
