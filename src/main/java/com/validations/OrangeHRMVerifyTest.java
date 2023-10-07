package com.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMVerifyTest {
	
	@Test
	public void orange() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String expected="https://opensource-demo.orangehrmlive.com/web/index.php/auth/";
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(driver.getCurrentUrl().equals(expected));
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		//soft assert even if website not same, it will continue to go to next...
	}

}
