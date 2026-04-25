package WebAutomation.MakeMyTripFlow;

import org.testng.annotations.Test;

public class Logintest extends Basetest{

	
	@Test
	public void loginPage() throws InterruptedException
	{
		Loginpage loginpage = goToURL();
		Homepage home = loginpage.userLogin();
		home.searchFlight();
	}
	
	
}
