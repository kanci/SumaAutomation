package com.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMValidations {
	
	@Test
	public void orange() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//always use those, because without it, it will receive no element exception
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String expected="https://opensource-demo.orangehrmlive.com/web/index.php/auth/";
		//String actual=driver.getCurrentUrl();
		Assert.assertTrue(driver.getCurrentUrl().equals(expected));//check whether actual URL is equal to expected: ex:) remove "login" after URL
			//if not equal, then it would not continue executing; 1 failure test case
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
	}

}
