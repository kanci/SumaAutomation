package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogInJavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//approach 1
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('email').value='rama';");
		
		//approach 2
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		js.executeScript("arguments[0].value='sumancherla88@gmail.com'", email);
		
		WebElement passwr = driver.findElement(By.xpath("//input[@id='pass']"));
		js.executeScript("arguments[0].value='number1232XCIOU'", passwr);
		
		//WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		//loginButton.click();
		
		//scroll
		//js.executeScript("window.scrollBy(0,500)");
		

	}

}
