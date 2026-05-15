package AutomationExcercise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;


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
		productpage.product_qty.click();
		productpage.addProductByName();
		cartpage = productpage.clickViewCartLink();
		Cartitem item = cartpage.checkCartDetails();
		Assert.assertTrue(item.getName().contains(productName));
	    Assert.assertEquals(item.getQuantity(), "2");
	    Assert.assertEquals(item.getPrice(), "Rs. 400"); 
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
		Assert.assertEquals(actualorderplacemessage, expectedorderplacedmessage);
	}
}
