package org.selenium.handlings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

		Actions action = new Actions(driver);
		action.keyDown(element, Keys.SHIFT).sendKeys("mobile").keyUp(element, Keys.SHIFT).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		

	}

}
