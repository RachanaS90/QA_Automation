package WebAutomation.MakeMyTripFlow;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Basepage{

	WebDriver driver;
	String departurecity = "Pune";
	String arrivalcity = "Amritsar";
	
	
	public Homepage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="fromCity")
	WebElement fromcity;
	
	@FindBy(className=".react-autosuggest__input")
	WebElement enterdepatrurecity;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement tocity;
	
	@FindBy(className=".react-autosuggest__suggestions-list")
	List<WebElement> fromcitysuggestionlist;
	
	@FindBy(className=".makeFlex.font12.headerIconsGap")
	List<WebElement> menus;
		
	
	
	public void searchFlight()
	{
		menus.stream().filter(li->li.getText().equalsIgnoreCase("Flights"))
		.findFirst()
		.ifPresent(WebElement::click);
		
		
		fromcity.click();
		enterdepatrurecity.sendKeys(departurecity);
	    fromcitysuggestionlist.stream().filter(li->li.getText().equalsIgnoreCase(departurecity))
		.findFirst()
		.ifPresent(WebElement::click);
	}
	
	
	
}
