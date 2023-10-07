package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQABrowserWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		
	}

}
