package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewPracticeFacebookKeyboardSignIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement newAcct = driver.findElement(By.linkText("Create new account"));
		newAcct.click();
		
		Actions a = new Actions(driver);
		
		//inspect firstName element
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		//actions for using keyboard to write firstName
		//to note, sendKeys, take Char String data, not char single quote
		
		a.moveToElement(firstName).click()
		.keyDown(Keys.SHIFT).sendKeys("s")
		.keyUp(Keys.SHIFT).sendKeys("u")
		.keyUp(Keys.SHIFT).sendKeys("m")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.build().perform();
		
		//inspect lastName element
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		//actions for using keyboard to write lastName
		a.moveToElement(lastName).click()
		.keyDown(Keys.SHIFT).sendKeys("k")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.keyUp(Keys.SHIFT).sendKeys("n")
		.keyUp(Keys.SHIFT).sendKeys("c")
		.keyUp(Keys.SHIFT).sendKeys("h")
		.keyUp(Keys.SHIFT).sendKeys("e")
		.keyUp(Keys.SHIFT).sendKeys("r")
		.keyUp(Keys.SHIFT).sendKeys("l")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.build().perform();
		
		//inspect email address textbox
		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		
		//actions for using keyboard to write email address:
		a.moveToElement(email).click()
		.keyUp(Keys.SHIFT).sendKeys("s")
		.keyUp(Keys.SHIFT).sendKeys("u")
		.keyUp(Keys.SHIFT).sendKeys("m")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.keyUp(Keys.SHIFT).sendKeys("c")
		.keyUp(Keys.SHIFT).sendKeys("h")
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
		
		
		//inspect reconfirm Email in textbox (that only happens after user sign in email, not originally, but after)
		WebElement reEmail = driver.findElement(By.xpath("//input[@aria-label='Re-enter email']"));
		
		//actions for using keyboard class for writing confirm email address
		a.moveToElement(reEmail).click()
		.keyUp(Keys.SHIFT).sendKeys("s")
		.keyUp(Keys.SHIFT).sendKeys("u")
		.keyUp(Keys.SHIFT).sendKeys("m")
		.keyUp(Keys.SHIFT).sendKeys("a")
		.keyUp(Keys.SHIFT).sendKeys("c")
		.keyUp(Keys.SHIFT).sendKeys("h")
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
		
		//inspect new password textbox
		WebElement newPassw = driver.findElement(By.xpath("(//input[@type='password'])[2]"));

		//actions for typing password using keyboard
		a.moveToElement(newPassw).click()
		.keyUp(Keys.SHIFT).sendKeys("b")
		.keyUp(Keys.SHIFT).sendKeys("9")
		.keyDown(Keys.SHIFT).sendKeys("m")
		.keyDown(Keys.SHIFT).sendKeys("k")
		.keyUp(Keys.SHIFT).sendKeys("1")
		.keyUp(Keys.SHIFT).sendKeys("g")
		.keyUp(Keys.SHIFT).sendKeys("f")
		.keyUp(Keys.SHIFT).sendKeys("q")
		.keyDown(Keys.SHIFT).sendKeys("5")
		.keyDown(Keys.SHIFT).sendKeys("1")
		.build().perform();
		
		//click sign up button
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
