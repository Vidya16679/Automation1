package org.selenium.handlings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions action = new Actions(driver);
		/*
		 * action.moveToElement(element).build().perform();
		 * action.doubleClick().build().perform();
		 * action.contextClick().build().perform();
		 */
		
		action.moveToElement(element).doubleClick().contextClick().build().perform();

	}

}
