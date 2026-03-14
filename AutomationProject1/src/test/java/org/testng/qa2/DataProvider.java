package org.testng.qa2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	
	WebDriver driver;  

	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");}
	
	@Test //Hard Assertion
	public void TC001() {
	
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		driver.findElement(By.linkText("Log in"));
	
	}
	
	@Test //Hard Assertion
	public void TC002() {
	
		driver.findElement(By.id("email")).sendKeys("xyz");
		driver.findElement(By.id("pass")).sendKeys("xyz@123");
		driver.findElement(By.linkText("Log in"));
	
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
	
		Thread.sleep(5000);
		driver.quit();
	}

}
