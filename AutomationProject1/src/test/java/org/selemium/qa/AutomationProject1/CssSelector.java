package org.selemium.qa.AutomationProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("input#name")).sendKeys("Gaurav Kumar Pqandey");
	driver.findElement(By.cssSelector("input[placeholder='Enter EMail']")).sendKeys("Win");

}
}