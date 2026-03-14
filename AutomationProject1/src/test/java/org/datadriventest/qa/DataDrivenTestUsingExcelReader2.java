package org.datadriventest.qa;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(TestNGListener.class)
public class DataDrivenTestUsingExcelReader2 {
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
	public Object[][] getData() throws EncryptedDocumentException, IOException{
		
		Object obj[][]=ExcelReader.getExcelData("FbLoginData");

		return obj;
	}

	
	@AfterMethod
	public void tearDown() throws InterruptedException {
	
		Thread.sleep(5000);
		driver.quit();
	}

}
