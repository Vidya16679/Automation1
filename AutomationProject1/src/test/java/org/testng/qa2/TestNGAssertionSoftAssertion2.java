package org.testng.qa2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertionSoftAssertion2 {

    WebDriver driver;
    SoftAssert soft;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        soft = new SoftAssert();
    }
 
    @Test(priority = 1)
    public void TC002() {
        String actualGoogleTitle = driver.getTitle();
        soft.assertEquals(actualGoogleTitle, "Google", "Title is not matching");
        soft.assertAll();
    }

    @Test(priority = 2) // Soft Assertion
    public void TC001() {
        String actualGoogleTitle = driver.getTitle();
        soft.assertEquals(actualGoogleTitle, "Google1", "Title is not matching");
        System.out.println("Google title is matching");
        soft.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
