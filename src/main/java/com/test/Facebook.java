package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Facebook {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver(options);
		
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.facebook.com/login.php");
		//driver.get("https://www.facebook.com/reg/?next=%2FOrangeHRM%2F");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//control+1, assign to new variable
		//driver.findElement(By.xpath(""));
	
		
		//driver.findElement(By.id("email")).sendKeys("sumancherla88@gmail.com");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumancherla88@gmail.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("sumancherla88@gmail.com");
		
		//driver.findElement(By.id("pass")).sendKeys("number1232XCIOU");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("number1232XCIOU");
		//driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("number1232XCIOU");
		//driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("number1232XCIOU");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("number1232XCIOU");
		
		//driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Forgot password?']")).click();
		
		Thread.sleep(5000);
		
		/**
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//to log out
		driver.findElement(By.xpath("(//div[@role='navigation'])[2]/span")).click();//this clicks the image
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[@dir='auto'])[7]")).click();//it clicks log out

		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();//this closes removes my pic from device after logging out
		
		Thread.sleep(5000);
		**/
		driver.close();
	}

}
