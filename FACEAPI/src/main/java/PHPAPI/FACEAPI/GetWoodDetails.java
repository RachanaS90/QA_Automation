package PHPAPI.FACEAPI;

import POJO.Productdetails;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class GetWoodDetails {
	
	public void getWoodDetails(String string)
	{
		 RestAssured.baseURI="https://apimgr.int.sgdbf.saint-gobain.net:20015/SAP/zsgdbf01/apimgt/v1";
			
		 Productdetails response = given()
		    .relaxedHTTPSValidation()
		    .header("KeyId", "ee0524ab-e37b-4186-b953-ac785e1e6802")
		    .accept("application/json")
		    .queryParam("iv_get_docflow", false)
		    .queryParam("iv_get_docflow_mobile", true)
		.when()
		    .get("/billings/"+string).as(Productdetails.class);
		//System.out.println(response.toString());
		System.out.println(response.getEV_RC());	 
		 }
}
