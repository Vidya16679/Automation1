package org.selemium.qa.AutomationProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		userName.clear();
		userName.sendKeys("Gaurav");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Enter EMail\")]")).sendKeys("gauravcvedak@gmail.com");
		
		driver.findElement(By.xpath("//div[@id='crosscol']/descendant::a[text()='Home']")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
