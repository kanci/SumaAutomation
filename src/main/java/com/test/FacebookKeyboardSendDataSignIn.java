package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookKeyboardSendDataSignIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Actions a = new Actions(driver);
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		a.sendKeys(fname, "Suma").build().perform();
		
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		a.sendKeys(lname, "Kancherla").build().perform();
		

		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		a.sendKeys(email,"sumancherla88@gmail.com").build().perform();
	
		WebElement newPassword=driver.findElement(By.xpath("//input[@aria-label='New password']"));
		a.sendKeys(newPassword,"number1232IIII").build().perform();
		Thread.sleep(3000);
		
		driver.close();

	}

}
