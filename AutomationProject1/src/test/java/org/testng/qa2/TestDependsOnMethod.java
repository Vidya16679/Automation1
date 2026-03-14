package org.testng.qa2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDependsOnMethod {
	
  
	 
	@Test(groups = "Google", priority = 2)
	public void TC001_Google_Login() {
		System.out.println("Google login-----------------");
	}
	
	@Test(priority = 1, groups = "Google")
	public void TC002_Google_Signgup() {
		System.out.println("Google Signup-----------------");
	}
	@Test(priority = 3, groups = "Google")
	public void TC003_Google_Logout() {
		System.out.println("Google Signout-----------------");
	}
	
	@Test(priority = 4, groups = "Facebook")
	public void TC004_FB_Login() {
		System.out.println("FB Login-----------------");
	}
	
	@Test(priority = 5, groups = "Facebook")
	public void TC005_FB_Logout() {
		System.out.println("FB Signout-----------------");
	}
}
