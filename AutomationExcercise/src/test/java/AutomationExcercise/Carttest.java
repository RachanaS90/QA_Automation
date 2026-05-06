package AutomationExcercise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

@Listeners(Utils.Listeners.class)
public class Carttest extends Basetest{

	Cartpage cartpage;
	Homepage homepage;
	Productpage productpage;
	
	@Test(groups={"smoke"},dataProvider="existingData",dataProviderClass=Logintest.class, priority=0)
	public void verifyCartDescription(String email, String password)
	{
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
		productpage.clickProductByName("Men Tshirt"); 
		productpage.addProductByName();
		cartpage = productpage.clickViewCartLink();
		Cartitem item = cartpage.checkCartDetails();
		AssertJUnit.assertTrue(item.getName().contains(productName));
	    AssertJUnit.assertEquals(item.getQuantity(), "2");
	    AssertJUnit.assertEquals(item.getPrice(), "Rs. 400"); 
	}
	
	@Test(groups={"smoke", "regression"},dataProvider="existingData",dataProviderClass=Logintest.class, priority = 1)
	public void verifyCheckoutProcess(String email, String password)
	{
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
		productpage.clickProductByName("Men Tshirt"); 
		
		productpage.addProductByName();
		cartpage = productpage.clickViewCartLink();
		String actualorderplacemessage = cartpage.checkProceedToCheckout();
		AssertJUnit.assertEquals(actualorderplacemessage, expectedorderplacedmessage);
	}
}
