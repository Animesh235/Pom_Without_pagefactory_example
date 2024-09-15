package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	By userName = By.cssSelector("input[name='username']");
	By password = By.cssSelector("input[name='password']");
	By loginButton = By.cssSelector("button[type='submit']");
	
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void UserName(String name) {
		driver.findElement(userName).sendKeys(name);
	}
	public void PassWord(String name) {
		driver.findElement(password).sendKeys(name);
	}
	public void LoginButton() {
		driver.findElement(loginButton).click();
	}
	
}
