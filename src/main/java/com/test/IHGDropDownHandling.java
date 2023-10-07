package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGDropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.xpath("//select[@id='country']"));
		Select s = new Select(e);
		
		//s.selectByIndex(1);
		List<WebElement> list = s.getOptions();
		System.out.println("The countries are: ");
		for(WebElement each: list) {
			System.out.println(each.getText());
		}
		
		//list.iterator();

		
		Thread.sleep(5000);
		
		driver.close();
	}

}