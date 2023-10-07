package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScrollOrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

		
		
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='rama'", uname);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		js.executeScript("arguments[0].value='rama'", pass);
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", login);
		

	}

}
