package WebAutomation.MakeMyTripFlow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {

	WebDriver driver;
	WebDriverWait wait;
	
	public Basepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		
	}
	
	public WebElement checkElementToBeClickable(WebElement element)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public WebElement visibilityOfWebElement(WebElement element)
	{
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	
}
