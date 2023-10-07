package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IHGSign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.ihg.com/hotels/us/en/reservation");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		
		//this is for signing in
		
		driver.findElement(By.xpath("(//a[text()[contains(.,'Sign In')]])[1]")).click();
		driver.findElement(By.xpath("//a[@title='Sign In']")).click();//this also works too
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='ex: johndoe@website.com']")).sendKeys("sumacherla@gmail.com");
		driver.findElement(By.xpath("(//input[@name='password' and @name='password'])[2]")).sendKeys("passer");
		driver.findElement(By.xpath("(//input[@type='submit'])[6]")).click();
		Thread.sleep(12000);//using more seconds, take time to load due to slow functionality
		
		driver.close();
		

	}

}
