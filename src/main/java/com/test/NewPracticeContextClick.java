package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewPracticeContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(doubleClickButton).doubleClick().build().perform();
		
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();
		Thread.sleep(3000);
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.moveToElement(rightClickButton).contextClick().build().perform();
		
		
		//bootstrap menu, after right click button
		List<WebElement> selections = driver.findElements(By.xpath("//div[@id='context-menu-layer']/following::ul/li"));
		
		for(WebElement each:selections) {
			System.out.println(each.getText());//prints all menu items
			if(each.getText().equals("Quit")) {
				each.click();
				Thread.sleep(2000);
				myAlert.accept();
			}
		}
		Thread.sleep(2000);
		driver.close();

	}

}
