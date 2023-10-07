package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherPracticeWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		//iterate the loop, row starts with 1, NOT 0
		outer:
		for(int i=1; i< rows.size(); i++) {
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			for(int j=0; j<col.size(); j++) {
				String val = col.get(j).getText();
				if(val.equals("Microsoft")) {
					System.out.println(col.get(2).getText());
					break outer;
				}
			}
		}

	}

}
