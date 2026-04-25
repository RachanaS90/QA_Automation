package DriveAPI;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.restassured.path.json.JsonPath;

public class ReusableMethods {
	WebDriver driver;
	WebDriverWait wait;

	public ReusableMethods(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofMillis(1000));
	}

	public JsonPath jsonPath(String response) {
		JsonPath js = new JsonPath(response);
		System.out.println(response.toString());
		return js;
	}

	public void explicitWait(String url) {
		wait.until(ExpectedConditions.urlToBe(url));
	}

	public WebElement elementToBeClickable(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public WebElement elementToBeClickableBy(By ele) {
		return wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public List<WebElement> visibilityOfElementsLocated(By element) {
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}
	
	public WebElement visibilityOfElementLocated(By element) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public List<WebElement> allElementVisibility(List<WebElement> ele) {
		return wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}

}
