package PracticeWebAutomation.FileHandling;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Basetest {
    
	WebDriver driver;
	String expectedmsg = "Updated Excel Data Successfully.";
	
 public WebDriver initializeDriver()
 {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 return driver;
 }
 
 public Filepage goToURL()
 {
	 initializeDriver();
	 driver.get("https://rahulshettyacademy.com/upload-download-test");
	 return new Filepage(driver);
 }
  
  
}
