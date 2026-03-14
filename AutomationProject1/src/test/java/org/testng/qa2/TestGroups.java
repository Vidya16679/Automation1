package org.testng.qa2;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGroups {
	
   
	 
	@Test( dependsOnMethods  = {"TC002_Google_Signgup"})
	public void TC001_Google_Login() {
		System.out.println("Google login-----------------");
	}
	
	@Test(priority = 1, groups = "Google")
	public void TC002_Google_Signgup() {
		
		Assert.assertEquals(true, false);
		
		System.out.println("Google Signup-----------------");
	}
	
}
