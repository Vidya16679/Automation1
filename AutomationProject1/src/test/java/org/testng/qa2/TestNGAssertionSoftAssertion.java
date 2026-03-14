package org.testng.qa2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertionSoftAssertion {

	WebDriver driver;
	SoftAssert soft;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		soft=new SoftAssert();
	}

	@Test // Hard Assertion
	public void TC001() {

		String actualGoogleTitle = driver.getTitle();
		soft.assertEquals(actualGoogleTitle, "Google", "Title is not matching");

		soft.assertTrue(actualGoogleTitle.equals("Google"));

		System.out.println("Google title is matching");
		
	}

	@AfterMethod
	public void tearDown() {
		soft.assertAll();
		driver.quit();
		
	}

}
