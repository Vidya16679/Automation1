package org.datadriventest.qa;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class Test2 {
	WebDriver driver;  

	ExtentSparkReporter spark;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeSuite
	public void beforeSuite() {
		

		spark=new ExtentSparkReporter("C:\\Users\\Admin\\Desktop\\Automation By Ajeet Sir\\AutomationProject1\\TestReports\\Extent.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setTheme(Theme.STANDARD);
		
		reports=new ExtentReports();
		reports.attachReporter(spark);
	}

	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");}
	
	@Test(dataProvider = "getData") //Hard Assertion
	public void TC001(String un, String pwd) {
	test=reports.createTest("FB Login-DataDriven");
	
	test.info("Login Test is Starting");
	
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.linkText("Log in")).click();
	
		test.log(Status.PASS, "FB Login test got passed");
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
		test.info("Brwoser is closed");
	}
	
	@AfterSuite
	public void afterSuite() {
		reports.flush();
	}
}

