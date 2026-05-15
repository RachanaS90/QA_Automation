package AutomationExcercise;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;


@Listeners(Utils.Listeners.class)
public class Logintest extends Basetest{

	
	@DataProvider(name = "signupData")
	public Object[][] signupData() {
	    return new Object[][] {
	        {"Rachana Sinha", "Rachana2037@gmail.com","test@123","10", "April", "1980", "India", "ACCOUNT CREATED!"}
	    };	
	}
	
	@DataProvider(name ="existingSignupData")
	public Object[][] existingSignupData(){
		return new Object[][] {
			{"Rachana Sinha","Rachana2037@gmail.com"}
		};
	}
	
	@DataProvider(name ="existingData")
	public Object[][] existingData(){
		return new Object[][] {
			{"Rachana2026@gmail.com","test@123"}
		};
	}
	
	@DataProvider(name ="deleteAccount")
	public Object[][] deleteAccount(){
		return new Object[][] {
			{"Rachana2037@gmail.com","test@123"}
		};
	}
	
	@DataProvider(name ="invalidLoginData")
	public Object[][] inavlidLoginData()
	{
		return new Object[][] {
			{"test676777@gmail.com","test@123"}
		};
	}
	
	@Test(groups= {"smoke", "regression"}, priority=0)
	public void verifyHomepage()
	{
		String actualtitle = loginpage.getHomepageTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@Test(groups={"smoke", "regression"}, dataProvider = "signupData", priority=1)
	public void verifyUserSignUp(String username, String email, String password,String day, String month, String year, String country, String expectedMessage)
	{
		loginpage.signUp(username,email);
		loginpage.selectCheckbox();
		Assert.assertTrue(loginpage.newslettercheckbox.isSelected());
		loginpage.selectDay(day);
		loginpage.selectMonth(month);
		loginpage.selectYear(year);
		loginpage.selectCountry(country);
		String actualmessage = loginpage.addDetails(password);
		Assert.assertEquals(actualmessage, expectedMessage);
	}
	
	@Test(groups={"smoke","regression"}, dataProvider = "existingSignupData", dependsOnMethods= {"verifyUserSignUp"})
	public void verifyExistingEmail(String username, String email)
	{
		loginpage.signUp(username,email);
		String errormesage = loginpage.addExistingEmail();
		Assert.assertEquals(errormesage, expectederrormessage);
	}
	

	@Test(groups={"smoke"}, dataProvider = "existingData", priority=3)
	public void verifyLogin(String email, String password)
	{
		loginpage.checkLogin(email, password);
	}
	
	@Test(groups={"smoke","regression"},dataProvider="deleteAccount", priority=4)
	public void verifyDeleteAccount(String email, String password)
	{
		String actualdeleteaccountmessage = loginpage.checkDeleteAccount(email,password);
		Assert.assertEquals(actualdeleteaccountmessage, expecteddeletemessage);
	}
	
	@Test(groups = {"regression"}, dataProvider="invalidLoginData", priority=5)
	public void verifyinvalidLogin(String invalidemail, String invalidpassword)
	{
		String actualinvaliderrormessage = loginpage.checkExistingLogin(invalidemail, invalidpassword);
		Assert.assertEquals(actualinvaliderrormessage, expectedinvaliderrormessage);
	}
	
}
