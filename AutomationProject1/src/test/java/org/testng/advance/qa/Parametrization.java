package org.testng.advance.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.fb.com");
    }

    @Test
    @Parameters({"userName", "password"})
    public void TC001(String userName, String password) {

        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Facebook", "Title is not matching");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
    	
    	Thread.sleep(5000);
        driver.quit();
    }
}
