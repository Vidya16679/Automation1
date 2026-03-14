package org.testng.qa2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertion {
	
	WebDriver driver; 

	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");}
	
	@Test
	public void TC001() {
	
		String actualGoogleTitle=driver.getTitle();
		Assert.assertEquals(actualGoogleTitle, "Google", "Title is not matching");
	
		Assert.assertTrue(actualGoogleTitle.equals("Google"));
		
		System.out.println("Google title is matching");	
	}
	
	@AfterMethod
	public void tearDown() {
	
		driver.quit();
	}

	

	
}
