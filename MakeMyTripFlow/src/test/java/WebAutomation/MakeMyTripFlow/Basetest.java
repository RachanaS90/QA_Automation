package WebAutomation.MakeMyTripFlow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	WebDriver driver;
	
	public WebDriver initializeDriver() {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--incognito");
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    return driver;
		}
	
	public Loginpage goToURL() 
	{
		 driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		return new Loginpage(driver);
	}
	

}
