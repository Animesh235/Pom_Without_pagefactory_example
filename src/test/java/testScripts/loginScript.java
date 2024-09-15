package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import base.base;
import pageObject.loginPage;

public class loginScript extends base{
	WebDriver driver;

	@Test
	public void login() {
		driver = browser();
		loginPage loginpage =  new loginPage(driver);
		loginpage.UserName("Admin");
		loginpage.PassWord("admin123");
		loginpage.LoginButton();
		Assert.assertEquals("OrangeHRM", driver.getTitle());
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
