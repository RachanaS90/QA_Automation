package APIValidation.APIPractice;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseTest {

	@BeforeSuite
	public void Setup()
	{
		String url = Config.getProperty("baseUrl");
        RestAssured.baseURI = url;
        
        if (url != null) {
            RestAssured.baseURI = url;
            System.out.println("Base URI successfully set to: " + RestAssured.baseURI);
        } else {
            System.out.println("Failed to fetch baseUrl from properties file!");
        }
		
	}

}
