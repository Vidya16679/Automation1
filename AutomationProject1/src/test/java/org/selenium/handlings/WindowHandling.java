package org.selenium.handlings;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h2[text()='Alerts & Popups']")));
		
		String parentWindowId=driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		driver.findElement(By.xpath("//button[text()='Popup Windows']")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		List<String> list=new ArrayList<>(allWindows);
		driver.switchTo().window(list.get(1));
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
