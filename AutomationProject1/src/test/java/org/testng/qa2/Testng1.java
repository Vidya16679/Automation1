package org.testng.qa2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {
	WebDriver driver;

	@AfterSuite
	public void m5() {
		System.out.println("after Suite");
	}

	@AfterTest
	public void m6() {
		System.out.println("after test");
	}

	@AfterClass
	public void m7() {
		System.out.println("after class");
	}

	@BeforeSuite
	public void m1() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void m2() {
		System.out.println("before test");
	}

	@BeforeClass
	public void m3() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void m4() {
		System.out.println("before method");
	}

	@Test
	public void TC001_FBLogin() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.fb.com");

	}

	@Test
	public void TC001_FBHome() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com");

	}

	@AfterMethod
	public void m8() {
		System.out.println("after method");
		driver.quit();
	}


}
