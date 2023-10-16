package com.reports;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FacebookReports {
	public static ChromeDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static ChromeOptions options;
	public static int i=0;
	
	
	@BeforeSuite
	public void begin() {
		report=new ExtentReports(".//reports//FacebookReport.html",true);
		report.addSystemInfo("Author", "Suma");
		report.addSystemInfo("Environment","QA");
		report.addSystemInfo("Userstory","US1000");
		test=report.startTest("Verify user is able to login to facebook application with valid credentials");
	}
	
	@Test
	public void facebook() throws IOException, InterruptedException {
		options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumancherla88@gmail.com");
		test.log(LogStatus.PASS, "Entering username"+test.addScreenCapture(snap()));//LogStatus logStatus, String details
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("number1232XCIOU");
		test.log(LogStatus.PASS, "Entering password"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "User is logged in after clicked in login button"+test.addScreenCapture(snap()));
		
	}
	
	//for takescreenshot method
	public String snap() throws IOException {
		Random r = new Random();
		String myDummy="";
		
		if(r.nextInt()!=0) {
			i=i+1;
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File(".//Images//FacebookPic"+i+".png");
			FileUtils.copyFile(src, dest);
			myDummy=dest.getAbsolutePath();
		}
		
		return myDummy;
		
	}
	
	@AfterSuite
	public void finish() {
		report.endTest(test);
		report.flush();
		
	}

}
