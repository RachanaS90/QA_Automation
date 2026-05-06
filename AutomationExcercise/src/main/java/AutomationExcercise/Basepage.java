package AutomationExcercise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
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
		wait = new WebDriverWait(driver, Duration.ofMillis(20000));
	}
	
	public WebElement elementToBeClickable(WebElement ele)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public WebElement visibilityOf(WebElement ele)
	{
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public List<WebElement> visibilityOfAllElements(List<WebElement> ele)
	{
		return wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}
	//"#aswift_3"
	public void frameToBeAvailableAndSwitchToIt(WebElement ele) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
		// Locate the close button of the ad popup
		WebElement closeBtn = driver.findElement(By.cssSelector("#dismiss-button-element"));
		elementToBeClickable(closeBtn).click();
		System.out.println("Advertisement popup closed");
	}
	
	
}
