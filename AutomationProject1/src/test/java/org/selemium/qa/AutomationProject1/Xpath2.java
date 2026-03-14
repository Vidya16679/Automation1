package org.selemium.qa.AutomationProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=samsung&rh=p_90%3A6741118031&dc&ds=v1%3Afix7XNsM7jWy5ed5By5mIoKYJvhrMZCmZTUvax%2FRGXU&crid=OALXENQ9376G&qid=1762607104&rnid=6741116031&sprefix=sams%2Caps%2C748&ref=sr_nr_p_90_1");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']/preceding-sibling::div/descendant::i")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
