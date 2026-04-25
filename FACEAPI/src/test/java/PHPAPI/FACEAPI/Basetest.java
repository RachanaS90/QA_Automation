package PHPAPI.FACEAPI;

import org.testng.annotations.Test;

public class Basetest {

	@Test
	public void getWoodArticleDetails()
	{
		GetWoodDetails WoodDetails = new GetWoodDetails();
		WoodDetails.getWoodDetails("9228287770");
	}
	
}

