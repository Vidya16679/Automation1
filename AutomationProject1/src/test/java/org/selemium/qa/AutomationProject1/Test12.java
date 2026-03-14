package org.selemium.qa.AutomationProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
