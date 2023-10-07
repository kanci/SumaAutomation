package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameFormFillingDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Suma");;
		
		//txt.sendKeys("Suma");
		
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();//always use those!, to change frames
		
		WebElement frm = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm);
		
		WebElement txt2 = driver.findElement(By.xpath("//input[@name='mytext2']"));

		txt2.sendKeys("Suma");
		
		driver.switchTo().defaultContent();//always use those!, to change frames
		
		driver.switchTo().frame(2);
		
		WebElement txt3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		
		txt3.sendKeys("Suma");
		
		driver.switchTo().defaultContent();//always use those!, to change frames
		
		driver.switchTo().frame(3);
		WebElement txt4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		
		txt4.sendKeys("Suma");
		
		driver.switchTo().defaultContent();//always use those!, to change frames
		
		driver.switchTo().frame(4);
		WebElement txt5 = driver.findElement(By.xpath("//input[@name='mytext5']"));
		
		txt5.sendKeys("Suma");
		
		driver.switchTo().defaultContent();//always use those!, to change frames
		
		Thread.sleep(3000);
		driver.close();

	}

}
