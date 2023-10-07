package com.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPracticeOrangeHRMWindowsHandling {
	public static String parent;
	public static Set<String> allIcons;
	public static String linkedIn, twitter, youtube, facebook;
	public static Iterator<String> iter;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement linkedInIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		linkedInIcon.click();
		
		parent = driver.getWindowHandle();//orangeHRM
		
		allIcons = driver.getWindowHandles();
		
		iter = allIcons.iterator();
		
		while(iter.hasNext()) {
			linkedIn=iter.next();
			if(!parent.equals(linkedIn)) {
				driver.switchTo().window(linkedIn);
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		WebElement faceIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		faceIcon.click();
		
		allIcons=driver.getWindowHandles();
		iter=allIcons.iterator();
		
		while(iter.hasNext()) {
			facebook=iter.next();
			if(!parent.equals(facebook)) {
				driver.switchTo().window(facebook);
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		WebElement twitIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[3]"));
		twitIcon.click();
		
		allIcons=driver.getWindowHandles();
		iter=allIcons.iterator();
		
		while(iter.hasNext()) {
			twitter=iter.next();
			if(!parent.equals(twitter)) {
				driver.switchTo().window(twitter);
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		WebElement youtubeIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[4]"));
		youtubeIcon.click();
		
		allIcons=driver.getWindowHandles();
		iter=allIcons.iterator();
		while(iter.hasNext()) {
			youtube=iter.next();
			if(!parent.equals(youtube)) {
				driver.switchTo().window(youtube);
			}
		}
		
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
