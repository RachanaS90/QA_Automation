package AutomationExcercise;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;


public class Producttest extends Basetest{

	Productpage productpage;
	Homepage homepage;

	
	@Test(dataProvider="existingData",dataProviderClass = Logintest.class,priority=0)
	public void verifyAllProductsPage(String email, String password)
	{
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
		String actualproducttitle = productpage.verifyProductPage();
		AssertJUnit.assertTrue(actualproducttitle.contains(expectedproducttext));
	}
	
	@Test(dataProvider="existingData",dataProviderClass = Logintest.class,priority=1)
	public void searchProduct(String email, String password)
	{
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
	    productpage.searchProduct();
	    String actualsearchedproducttitle = productpage.product_title.getText();
	    AssertJUnit.assertEquals(actualsearchedproducttitle, expectedsearchproducttitle);
		AssertJUnit.assertTrue(productpage.verifySearchedResult("TShirt"));
	}
	
	@Test(dataProvider="existingData",dataProviderClass = Logintest.class,priority=2)
	public void verifyClickProductByName(String email, String password) {
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
	    productpage.clickProductByName("Men Tshirt"); 
	}
	
	@Test(dataProvider="existingData",dataProviderClass = Logintest.class,priority=3)
	public void verifyProductAddedToCart(String email, String password)
	{
		homepage = loginpage.checkLogin(email, password);
		productpage  = homepage.getProducts();
		productpage.clickProductByName("Men Tshirt"); 
		String actualmessage = productpage.addProductByName();
		AssertJUnit.assertTrue(actualmessage.contains("Added!"));
	}
	
	
	
	
	
}
