package com.parametertests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookTest {
	
	@Test()
	@Parameters({"user", "pass"})
	public void fb(String data1, String data2) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(data1);
		WebElement passw = driver.findElement(By.xpath("//input[@id='pass']"));
		passw.sendKeys(data2);
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	}

}
