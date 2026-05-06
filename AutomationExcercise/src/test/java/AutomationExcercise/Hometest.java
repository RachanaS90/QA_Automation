package AutomationExcercise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utils.Listeners.class)
public class Hometest extends Basetest{
	
	Homepage homepage;

	@Test(groups={"smoke"},dataProvider = "existingData",dataProviderClass = Logintest.class,  priority = 0)
	public void verifyTestCasesLink(String email, String password)
	{
		loginpage.checkLogin(email, password);
		homepage = new Homepage(driver);
		homepage.getTestCases();
	}
	
	@Test(groups={"smoke"}, dataProvider = "existingData", dataProviderClass = Logintest.class, priority = 1)
	public void verifyProductLink(String email, String password)
	{
		loginpage.checkLogin(email, password);
		Homepage homepage = new Homepage(driver);
	    homepage.getProducts();
	}
}
