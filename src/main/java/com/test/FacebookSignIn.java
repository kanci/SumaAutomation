package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
			
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(5000);
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		driver.findElement(By.name("firstname")).sendKeys("Rama");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Krrish");
		driver.findElement(By.xpath("//*[@aria-label='Mobile number or email']")).sendKeys("jageskh@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("duisjkdjd");
		
		Thread.sleep(5000);
		
		Select m = new Select(month);
		Select d = new Select(day);
		Select y = new Select(year);
		
		
		m.selectByValue("5");
		d.selectByIndex(3);
		y.selectByVisibleText("1995");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//WebElement findElement = driver.findElement(By.xpath(""));
		
		//Thread.sleep(5000);
		
		driver.close();
	}

}
