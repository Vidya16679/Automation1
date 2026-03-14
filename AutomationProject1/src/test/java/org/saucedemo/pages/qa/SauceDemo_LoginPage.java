package org.saucedemo.pages.qa;

import java.util.List;

import javax.xml.xpath.XPath;

import org.base.qa.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SauceDemo_LoginPage   {
	static WebDriver driver;
	
	public SauceDemo_LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name")
	WebElement userName; 
	
	@FindBy(id="password")
	WebElement password; 
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginbtn;

	public void login(String un, String pwd) {
		
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
	}
	
}
