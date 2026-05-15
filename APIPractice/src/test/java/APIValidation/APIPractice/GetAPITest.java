package APIValidation.APIPractice;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class GetAPITest extends BaseTest{

	GetAPI getapi = new GetAPI();
	
	@Test(groups = {"smoke", "regression"})
	public void validateStatuscode()
	{
		Setup();
		int statuscode = getapi.getUserId();
		Assert.assertNotSame(statuscode, 200);
	}
	
	@Test(groups = {"smoke", "regression"})
	public void validateLocation()
	{
		Setup();
		String actuallocation = getapi.getlocation();
		Assert.assertEquals(actuallocation, "San Francisco");
	}
	
	@Test(groups = {"smoke"})
	public void validateURL()
	{
		Setup();
		String actualurl = getapi.getURL();
		Assert.assertEquals(actualurl, "https://api.github.com/users/octocat");
	}
	
	
}
