package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewPracticeJQueryDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//don't forget the frame
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(myFrame);
		
		WebElement myDrag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement myDrop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(myDrag, myDrop).build().perform();
		
		Thread.sleep(3000);
		driver.close();

	}

}
