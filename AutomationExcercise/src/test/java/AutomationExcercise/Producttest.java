package AutomationExcercise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;

@Listeners(Utils.Listeners.class)
public class Producttest extends Basetest{

	Productpage productpage;
	Homepage homepage;

	
	@Test(groups={"smoke"}, dataProvider="existingData",dataProviderClass = Logintest.class,priority=0)
	public void verifyAllProductsPage(String email, String password)
	{
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
		String actualproducttitle = productpage.verifyProductPage();
		Assert.assertTrue(actualproducttitle.contains(expectedproducttext));
	}
	
	@Test(groups={"smoke", "regression"}, dataProvider="existingData",dataProviderClass = Logintest.class,priority=1)
	public void searchProduct(String email, String password)
	{
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
	    productpage.searchProduct();
	    String actualsearchedproducttitle = productpage.product_title.getText();
	    Assert.assertEquals(actualsearchedproducttitle, expectedsearchproducttitle);
		Assert.assertTrue(productpage.verifySearchedResult("TShirt"));
	}
	
	@Test(groups={"smoke", "regression"},dataProvider="existingData",dataProviderClass = Logintest.class,priority=2)
	public void verifyClickProductByName(String email, String password) {
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
	    productpage.clickProductByName("Men Tshirt"); 
	}
	
	@Test(groups={"smoke", "regression"},dataProvider="existingData",dataProviderClass = Logintest.class,priority=3)
	public void verifyProductAddedToCart(String email, String password)
	{
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
		productpage.clickProductByName("Men Tshirt"); 
		String actualmessage = productpage.addProductByName();
		Assert.assertTrue(actualmessage.contains("Added!"));
	}
	
	
	
	
	
}
