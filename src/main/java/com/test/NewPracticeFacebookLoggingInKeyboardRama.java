package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewPracticeFacebookLoggingInKeyboardRama {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//inspect the element for email or username textbox
		WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
		
		//username should be: RaMa, for actions class
		Actions a = new Actions(driver);
		a.moveToElement(uname).click()
		.keyDown(Keys.SHIFT).sendKeys("r")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.keyDown(Keys.SHIFT).sendKeys("m")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.build().perform();
		
		//inspect the element for password textbox
		WebElement passwrd = driver.findElement(By.xpath("//input[@id='pass']"));
		
		//password should be: GoPi for actions class
		a.moveToElement(passwrd).click()
		.keyDown(Keys.SHIFT).sendKeys("g")
		.keyUp(Keys.SHIFT).sendKeys("o")
		.keyDown(Keys.SHIFT).sendKeys("p")
		.keyUp(Keys.SHIFT).sendKeys("i")
		.build().perform();
		
	}

}
