package org.testng.qa2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3Priority {
	
  
	 
	@Test(priority = -1)
	public void TC001() {
		System.out.println("TC001-----------------");
	}
	
	@Test(priority = 2)
	public void AC002() {
		System.out.println("TC002-----------------");
	}
	
	
}
