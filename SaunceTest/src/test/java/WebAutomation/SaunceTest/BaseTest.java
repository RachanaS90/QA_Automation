package WebAutomation.SaunceTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	
	
	public WebDriver initializeDrive()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		return driver;
	}
	
	public void gotoURL()
	{
		initializeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
}

