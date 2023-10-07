package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		
		//Thread.sleep(2000);
		//WebElement linkedIn=driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']"));
		//linkedIn.click();
		
		Thread.sleep(3000);
		
		//driver.switchTo().frame(0);//still wanting to switch focus for orangeHRM window
		
		//driver.findElement(By.xpath("//*[text()=\" Login \"]")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("kanci");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();//normalize space works, since there's spaces before and after text 'reset'
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Performance']")).click();
		
		Thread.sleep(2000);
		
		WebElement jobTitle = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		
		jobTitle.click();
		
		
		//bootstrap is complicated..... for now.. since there's no select tag, and no ul nor li tags.., just only div
		//driver.findElements(By.xpath(""))
		
		
		Thread.sleep(4000);
		
		
		
		driver.close();
		
		//Thread.sleep(2000);
		//driver.quit();
		


	}

}
