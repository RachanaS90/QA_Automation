package WebAutomation.MakeMyTripFlow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basepage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[placeholder='Enter Mobile Number']")
	WebElement mobilenumber;
	
	@FindBy(css="button[data-cy='continueBtn']")
	WebElement continuebtn;
	
	@FindBy(xpath="//span[@data-cy='CommonModal_3']")
	WebElement backbtn;
	
	@FindBy(xpath="//span[@data-cy='closeModal']")
	WebElement closebtn;
	
	public Homepage userLogin()
	{
		//mobilenumber.sendKeys("9773434228");
		//continuebtn.click();
		//visibilityOfWebElement(backbtn).click();
		visibilityOfWebElement(closebtn).click();
		return new Homepage(driver);
	}
	
	
	
	
}
