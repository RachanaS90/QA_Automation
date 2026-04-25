package DriveAPI;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomateDriveAPI extends ReusableMethods {

	int orderID;
	private final WebDriver driver;
	private DriverAPIService apiService = null;

	public AutomateDriveAPI(WebDriver driver, DriverAPIService apiService) {
		super(driver);
		this.driver = driver;
		this.apiService = apiService;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[formcontrolname='parking']")
	public WebElement parkingslotnumber;

	public By selectstar(int count) {
		return By.cssSelector("img[alt*='" + count + "']");
	}

	@FindBy(css = "button[type='submit']")
	public WebElement validerbutton;

	@FindBy(css = ".feedback-icon")
	public List<WebElement> feedback;

	@FindBy(xpath = "//div[@class=\"reasons-grid\"]/child::div")
	public List<WebElement> reasons;

	@FindBy(css = ".thanks-message")
	public WebElement thanksmessage;

	@FindBy(xpath = "//textarea[@placeholder='Vous pouvez écrire votre appréciation ici...']")
	public WebElement appreciationcomment;

	@FindBy(xpath = "//a[@class='skip-link']")
	public WebElement skipratings;

	By actualdeliverymessage = By.xpath("//strong[contains(text(),'Merci et à bientôt chez POINT.P ')]");

	public WebElement skipLink() {
		return driver.findElement(By.cssSelector(".skip-link"));
	}

	String baseurl = System.getProperty("env.url");

	/*
	 * public String getCustomerURL(int orderId) { RestAssured.baseURI = baseurl;
	 * String customerurl = given().relaxedHTTPSValidation().header("API-Key",
	 * "3df689fd-d44b-41f6-8838-4e12487cb9aa") .header("Content-Type",
	 * "application/json").body(payload.getPayload(orderId)).when()
	 * .post("/drive-api-private/order").then().extract().response().asPrettyString(
	 * );
	 * 
	 * String url = jsonPath(customerurl).getString("customerUrl");
	 * System.out.println(url); return url; }
	 */

	public void insertParkingLot(int orderId, String parkingslot) {
		driver.get(apiService.getCustomerURL(orderId));
		parkingslotnumber.sendKeys(parkingslot);
		validerbutton.click();
		this.orderID = orderId;
	}

	public void orderInProgress() throws InterruptedException {
		apiService.orderInProgress(orderID);
		visibilityOfElementLocated(By.className("rating-title"));
	}

	public void orderDelivered() {
		apiService.orderDelivered(orderID);

	}

	public String checkRatings() throws InterruptedException {
		visibilityOfElementLocated(By.className("rating-title"));
		for (int i = 1; i <= 3; i++) {
			Thread.sleep(3000);
			elementToBeClickableBy(selectstar(i)).click();
			allElementVisibility(reasons);
			reasons.forEach(WebElement::click);

			if (i == 3) {
				driver.findElement(By.id("autre")).sendKeys("Test");
				driver.findElement(By.className("submit-button")).click();
				break;
			}
			try {
				skipLink().click();
			} catch (Exception e) {
				skipLink().click();
			}
		}
		System.out.println(thanksmessage.getText());
		return thanksmessage.getText();
	}

	public String checkFeedback() throws InterruptedException {
		visibilityOfElementLocated(By.className("rating-title"));
		for (int i = 4; i <= 5; i++) {
			Thread.sleep(3000);
			elementToBeClickableBy(selectstar(i)).click();
			Thread.sleep(3000);
			allElementVisibility(feedback);
			feedback.forEach(WebElement::click);

			if (i == 5) {
				Thread.sleep(2000);
				appreciationcomment.sendKeys("appreciation test");
				driver.findElement(By.className("submit-button")).click();
				break;
			}
			try {
				skipLink().click();
			} catch (Exception e) {
				skipLink().click();
			}
		}
		System.out.println(thanksmessage.getText());
		return thanksmessage.getText();
	}

	public String skipRatingsPage() {
		elementToBeClickable(skipratings).click();
		return visibilityOfElementLocated(actualdeliverymessage).getText();
	}

}
