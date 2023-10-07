package com.parametertests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM {

	@Test
	@Parameters({"user","pass"})
	public void orangehrm(String first, String second) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(first);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(second);
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
