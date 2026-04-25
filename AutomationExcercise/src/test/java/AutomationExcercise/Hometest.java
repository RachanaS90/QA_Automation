package AutomationExcercise;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Hometest extends Basetest{
	
	Homepage homepage;

	@Test(dataProvider = "existingData",dataProviderClass = Logintest.class,  priority = 0)
	public void verifyTestCasesLink(String email, String password)
	{
		loginpage.checkLogin(email, password);
		homepage = new Homepage(driver);
		homepage.getTestCases();
	}
	
	@Test(dataProvider = "existingData", dataProviderClass = Logintest.class, priority = 1)
	public void verifyProductLink(String email, String password)
	{
		loginpage.checkLogin(email, password);
		Homepage homepage = new Homepage(driver);
	    homepage.getProducts();
	}
}
