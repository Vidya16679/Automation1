package org.testng.qa2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestIgnoreException {
	
  
	 
	@Test(expectedExceptions = ArithmeticException.class)
	public void TC001_Google_Login() {
		System.out.println("Google login-----------------");
		
		System.out.println(10/0);
	}
	

	
}
