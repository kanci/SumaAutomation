package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLoggingInKeyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
		//uname.sendKeys("RaMa");
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys(uname, "r")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.keyDown(Keys.SHIFT).sendKeys("m")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.build().perform();
		
		
		
		WebElement passw = driver.findElement(By.xpath("//input[@id='pass']"));
		a.sendKeys(passw, "GoPi").build().perform();
		
		//a.moveToElement(passw).click().keyDown(Keys.SHIFT).sendKeys("g")
		//.keyUp(Keys.SHIFT).sendKeys("o")
		//.build().perform();
		
		//a.keyDown(Keys.SHIFT).sendKeys(passw,"g")
		//.keyUp(Keys.SHIFT).sendKeys("o")
		//.keyDown(Keys.SHIFT).sendKeys("p")
		//.keyUp(Keys.SHIFT).sendKeys("i")
		//.build().perform();
		
		
	}

}
