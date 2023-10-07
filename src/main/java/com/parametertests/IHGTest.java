package com.parametertests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IHGTest {
	
	@Test
	@Parameters({"firstname","lastName","mail","confirmmail", "pass", "confirmPass"})
	public void ihg(String first, String second, String third, String fourth, String fifth, String sixth) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys(first);
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys(second);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(third);
		WebElement verifyEmail = driver.findElement(By.xpath("//input[@id='confirmEmail']"));
		verifyEmail.sendKeys(fourth);
		
		WebElement passw = driver.findElement(By.xpath("//input[@id='password']"));
		passw.sendKeys(fifth);
		WebElement confirmPass = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		confirmPass.sendKeys(sixth);
		
		
		
	}

}
