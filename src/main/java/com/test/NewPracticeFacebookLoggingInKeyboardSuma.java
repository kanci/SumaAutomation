package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewPracticeFacebookLoggingInKeyboardSuma {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//inspect email or username textbox
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		//username should be: sumancherla88@gmail.com
		Actions a = new Actions(driver);
		a.moveToElement(email).click()
		.keyUp(Keys.SHIFT).sendKeys("s")
		.keyUp(Keys.SHIFT).sendKeys("u")
		.keyUp(Keys.SHIFT).sendKeys("m")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.keyUp(Keys.SHIFT).sendKeys("n")
		.keyUp(Keys.SHIFT).sendKeys("c")
		.keyUp(Keys.SHIFT).sendKeys("h")
		.keyUp(Keys.SHIFT).sendKeys("e")
		.keyUp(Keys.SHIFT).sendKeys("r")
		.keyUp(Keys.SHIFT).sendKeys("l")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.keyUp(Keys.SHIFT).sendKeys("8")
		.keyUp(Keys.SHIFT).sendKeys("8")
		.keyDown(Keys.SHIFT).sendKeys("2")
		.keyUp(Keys.SHIFT).sendKeys("g")
		.keyUp(Keys.SHIFT).sendKeys("m")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.keyUp(Keys.SHIFT).sendKeys("i")
		.keyUp(Keys.SHIFT).sendKeys("l")
		.keyUp(Keys.SHIFT).sendKeys(".")
		.keyUp(Keys.SHIFT).sendKeys("c")
		.keyUp(Keys.SHIFT).sendKeys("o")
		.keyUp(Keys.SHIFT).sendKeys("m")
		.build().perform();
		
		//inspect WebElement textbox for password
		WebElement passwr = driver.findElement(By.xpath("//input[@id='pass']"));
		
		//this is for my password:
		a.moveToElement(passwr).click()
		.keyUp(Keys.SHIFT).sendKeys("n")
		.keyUp(Keys.SHIFT).sendKeys("u")
		.keyUp(Keys.SHIFT).sendKeys("m")
		.keyUp(Keys.SHIFT).sendKeys("b")
		.keyUp(Keys.SHIFT).sendKeys("e")
		.keyUp(Keys.SHIFT).sendKeys("r")
		.keyUp(Keys.SHIFT).sendKeys("1")
		.keyUp(Keys.SHIFT).sendKeys("2")
		.keyUp(Keys.SHIFT).sendKeys("3")
		.keyUp(Keys.SHIFT).sendKeys("2")
		.keyDown(Keys.SHIFT).sendKeys("x")
		.keyDown(Keys.SHIFT).sendKeys("c")
		.keyDown(Keys.SHIFT).sendKeys("i")
		.keyDown(Keys.SHIFT).sendKeys("o")
		.keyDown(Keys.SHIFT).sendKeys("u")
		.build().perform();
		
		WebElement myButton = driver.findElement(By.xpath("//button[@name='login']"));
		myButton.click();
	}

}
