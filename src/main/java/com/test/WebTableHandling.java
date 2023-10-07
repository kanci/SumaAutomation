package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println();
		
		Thread.sleep(5000);
		
		WebElement myTable = driver.findElement(By.xpath("//table[@id='webtable']"));
		
		List<WebElement> rows = myTable.findElements(By.tagName("tr"));
		
		outer:
		for(int i=1; i<rows.size(); i++) {
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			for(int j=0; j<col.size(); j++) {
				String val=col.get(j).getText();
				if(val.equals("google.com")) {
					System.out.println(col.get(2).getText());
					break outer;
				}
			}
		}
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
