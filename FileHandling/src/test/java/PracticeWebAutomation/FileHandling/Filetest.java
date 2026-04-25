package PracticeWebAutomation.FileHandling;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Filetest extends Basetest{

	
	@Test
	public void naviagteHomePage()
	{
		Filepage filepage = goToURL();
		filepage.downloadFile();
		String message = filepage.uploadFile();
		System.out.println(message);
		Assert.assertEquals(message, expectedmsg);
		String actualprice = filepage.checkPrice();
		Assert.assertEquals("345", actualprice);
	}
	
}
