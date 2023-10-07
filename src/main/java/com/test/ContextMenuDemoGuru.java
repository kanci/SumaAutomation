package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuDemoGuru {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement myButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(myButton).doubleClick().build().perform();
		
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();
		
		Thread.sleep(2000);
		WebElement myButton2 = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.contextClick(myButton2).build().perform();

	}
}
