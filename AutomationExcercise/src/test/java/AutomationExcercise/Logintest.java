package AutomationExcercise;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Logintest extends Basetest{

	
	@DataProvider(name = "signupData")
	public Object[][] signupData() {
	    return new Object[][] {
	        {"Rachana Sinha", "Rachana2030@gmail.com","test@123","10", "April", "1980", "India", "ACCOUNT CREATED!"}
	    };	
	}
	
	@DataProvider(name ="existingSignupData")
	public Object[][] existingSignupData(){
		return new Object[][] {
			{"Rachana Sinha","RachanaNew@gmail.com"}
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
			{"Rachana20218@gmail.com","test@123"}
		};
	}
	
	@DataProvider(name ="invalidLoginData")
	public Object[][] inavlidLoginData()
	{
		return new Object[][] {
			{"test676777@gmail.com","test@123"}
		};
	}
	
	@Test(priority=0)
	public void verifyHomepage()
	{
		String actualtitle = loginpage.getHomepageTitle();
		AssertJUnit.assertEquals(actualtitle, expectedtitle);
	}
	
	@Test(dataProvider = "signupData", priority=1)
	public void verifyUserSignUp(String username, String email, String password,String day, String month, String year, String country, String expectedMessage)
	{
		loginpage.signUp(username,email);
		loginpage.selectCheckbox();
		AssertJUnit.assertTrue(loginpage.newslettercheckbox.isSelected());
		loginpage.selectDay(day);
		loginpage.selectMonth(month);
		loginpage.selectYear(year);
		loginpage.selectCountry(country);
		String actualmessage = loginpage.addDetails(password);
		AssertJUnit.assertEquals(actualmessage, expectedMessage);
	}
	
	@Test(dataProvider = "existingSignupData", priority=2)
	public void verifyExistingEmail(String username, String email)
	{
		loginpage.signUp(username,email);
		String errormesage = loginpage.addExistingEmail();
		AssertJUnit.assertEquals(errormesage, expectederrormessage);
	}
	

	@Test(dataProvider = "existingData", priority=3)
	public void verifyLogin(String email, String password)
	{
		loginpage.checkLogin(email, password);
	}
	
	@Test(dataProvider="deleteAccount", priority=4)
	public void verifyDeleteAccount(String email, String password)
	{
		String actualdeleteaccountmessage = loginpage.checkDeleteAccount(email,password);
		AssertJUnit.assertEquals(actualdeleteaccountmessage, expecteddeletemessage);
	}
	
	@Test(dataProvider="invalidLoginData", priority=5)
	public void verifyinvalidLogin(String invalidemail, String invalidpassword)
	{
		String actualinvaliderrormessage = loginpage.checkExistingLogin(invalidemail, invalidpassword);
		AssertJUnit.assertEquals(actualinvaliderrormessage, expectedinvaliderrormessage);
	}
	
}
