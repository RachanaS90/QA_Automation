package PHPAPI.FACEAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class ApiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI ="https://postman-echo.com";
		
		String response = given().when().get("/get").then().log().all().extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		
		String url = js.getString("url");
		
		System.out.println("the url is " + url);
		
		
		
	}

}
