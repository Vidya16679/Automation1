package org.automation.batch2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.fb.com/");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.name("email"));

		Actions action = new Actions(driver);
		action.click(userName).keyDown(Keys.SHIFT).sendKeys("vidya").keyUp(Keys.SHIFT).build().perform();
		
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();

	}

}
