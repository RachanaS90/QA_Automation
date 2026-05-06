package WebAutomation.SaunceTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	
	
	public WebDriver initializeDrive()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		return driver;
	}
	
	public void gotoURL()
	{
		initializeDrive();
		driver.get("https://www.saucedemo.com/");
		
	}
}

