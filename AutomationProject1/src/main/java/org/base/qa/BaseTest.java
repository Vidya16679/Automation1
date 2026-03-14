package org.base.qa;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
	
public static	WebDriver driver;
static Properties pro;
	
	public BaseTest() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Automation By Ajeet Sir\\AutomationProject1\\appliction.properties");
		pro.load(fis);
	}
	
	public void initialization() {
		
		
		String browser=pro.getProperty("browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("safari")) {
			driver=new SafariDriver();
		}else {
			System.out.println("No Browser Found");
		}
		
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
	
	
	
	

}
