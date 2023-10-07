package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignInDropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(e);
		
		System.out.println("The months in the list are: ");
		List<WebElement> list = month.getOptions();
		for(WebElement each: list) {
			System.out.println(each.getText());
		}
		System.out.println();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select daySelect = new Select(day);
		
		System.out.println("The days in a month in the list are: ");
		List<WebElement> listDay = daySelect.getOptions();
		for(WebElement each: listDay) {
			System.out.println(each.getText());
		}
		System.out.println();
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearSelect = new Select(year);
		
		System.out.println("The years in the list are: ");
		List<WebElement> listYear = yearSelect.getOptions();
		for(WebElement each: listYear) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		
		driver.close();
	}
}