package org.testng.qa2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	
	WebDriver driver;  

	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");}
	
	@Test(dataProvider = "getData") //Hard Assertion
	public void TC001(String un, String pwd) {
	
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.linkText("Log in")).click();
	
	}
	
	@DataProvider
	public Object[][] getData(){
		
		/*
		 * Object[][] obj=new Object[2][2]; obj[0][0]="Abc"; obj[0][1]="Abc@123";
		 * obj[1][0]="Xyz"; obj[1][1]="Xyz@123";
		 */
		
		Object[][] obj= {{"Abc", "Abc@123"},{"Xyz","Xyz@123"},{"Admin","Admin@123"}};
		
		return obj;
	}

	
	@AfterMethod
	public void tearDown() throws InterruptedException {
	
		Thread.sleep(5000);
		driver.quit();
	}

}
