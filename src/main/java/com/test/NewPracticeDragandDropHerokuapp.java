package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewPracticeDragandDropHerokuapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		WebElement colA = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement colB = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions a = new Actions(driver);
		
		//this does NOT seem to be working.. maybe later to learn javascript executor?
		
		
		a.dragAndDrop(colA,colB).build().perform();

	}

}
