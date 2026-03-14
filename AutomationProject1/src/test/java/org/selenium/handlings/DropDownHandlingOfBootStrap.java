package org.selenium.handlings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingOfBootStrap {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://getbootstrap.com/docs/4.6/components/dropdowns/");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// scrolling

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1255);");

		WebElement dropdownElement = driver.findElement(By.xpath("//button[contains(text(),'Dropdown button')]"));

		dropdownElement.click();

		List<WebElement> ddValues = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));

		for (WebElement element : ddValues) {
			String text = element.getText();

			if (text.equals("Another action")) {
				element.click();
			}

		}

		Thread.sleep(5000);

		driver.quit();

	}

}
