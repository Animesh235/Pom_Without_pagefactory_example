package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class base {

	WebDriver driver;
	ChromeOptions option;
	
	public WebDriver browser() {
		option = new ChromeOptions();
		option.addArguments("-headless");
		driver = new ChromeDriver(option);
		//driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		return driver;
	}
	
	
}
