package org.selenium.handlings;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.findElement(By.name("submit")).click();
		
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		//alert.accept();
		
		Thread.sleep(5000);

		driver.quit();

	}

}
