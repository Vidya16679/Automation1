package org.testng.qa2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeClass
	public void setUp() {
		System.out.println("Setup");
	}
	
	@Test
	public void TC001() {
		System.out.println("TC001-----------------");
	}
	
	@Test
	public void TC002() {
		System.out.println("TC002-----------------");
	}
	
	
	@AfterClass
	public void tearDown() {
		System.out.println("close");
	}

}
