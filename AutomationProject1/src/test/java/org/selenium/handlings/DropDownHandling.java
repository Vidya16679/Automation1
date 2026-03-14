package org.selenium.handlings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		WebElement dayElement=driver.findElement(By.id("day"));
		Select day=new Select(dayElement);
		day.selectByIndex(20);
		
		WebElement monthElement=driver.findElement(By.id("month"));
		Select month=new Select(monthElement);
		month.selectByVisibleText("Jul");
		
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("2024");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
