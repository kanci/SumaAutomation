package com.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmWindows {
	public static Set<String> all;
	public static Iterator<String> it;
	public static String parent,linkedIn,facebook,twitter,youtube;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		parent = driver.getWindowHandle();
		
		Thread.sleep(3000);
		WebElement lIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		lIcon.click();

		Thread.sleep(2000);
		all = driver.getWindowHandles();
		System.out.println();

		it = all.iterator();
		while(it.hasNext()) {
			linkedIn = it.next();
			
			if(!parent.equals(linkedIn)) {
				driver.switchTo().window(linkedIn);	
			}	
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		WebElement fIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		fIcon.click();
		all = driver.getWindowHandles();
		it = all.iterator();

		while(it.hasNext()) {
			facebook = it.next();
			if(!parent.equals(facebook)) {
				driver.switchTo().window(facebook);	
			}	
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println();
		Thread.sleep(3000);
		
		driver.switchTo().window(linkedIn);
		Thread.sleep(3000);

		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		WebElement twitIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[3]"));
		twitIcon.click();
		all = driver.getWindowHandles();
		it = all.iterator();
		
		while(it.hasNext()) {
			twitter = it.next();
			
			if(!parent.equals(twitter)) {
				driver.switchTo().window(twitter);	
			}	
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		WebElement youtubeIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[4]"));
		youtubeIcon.click();
		
		all = driver.getWindowHandles();
		it = all.iterator();
		
		while(it.hasNext()) {
			youtube = it.next();
			
			if(!parent.equals(youtube)) {
				driver.switchTo().window(youtube);
			}	
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
