package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignInJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		WebElement sexRadioButton = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", sexRadioButton);
		
		Thread.sleep(5000);
		
		//refresh
		js.executeScript("history.go(0)");
		
		//to get title
		String pageTitle=js.executeScript("return document.title;").toString();
		System.out.println(pageTitle);
		
		//to get url
		String urlStr = js.executeScript("return document.URL;").toString();
		System.out.println(urlStr);
		
		
	}

}
