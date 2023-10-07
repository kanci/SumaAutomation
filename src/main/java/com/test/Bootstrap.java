package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		WebElement course = driver.findElement(By.xpath("//button[@id='menu1']"));
		course.click();
		
		
		List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		for(WebElement item:menuItems) {
			if(item.getText().equals("JavaScript")) {
				item.click();
				break;
			}
		}
	}

}
