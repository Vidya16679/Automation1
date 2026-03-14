package org.saucedemo.tests.qa;

import java.io.IOException;

import org.base.qa.BaseTest;
import org.saucedemo.pages.qa.SauceDemo_LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest_SauceDemo extends BaseTest{
	
	public SauceDemo_LoginPage sl;
	
	public LoginTest_SauceDemo() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		sl=new SauceDemo_LoginPage();
	
	}
	
	@Test(dataProvider = "getData")
	public void TC001_Login_sauceDemo() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
