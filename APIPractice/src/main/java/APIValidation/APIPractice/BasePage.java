package APIValidation.APIPractice;

import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasePage {

	public Response getResponse(String resource) {

		return getRequestSpec().when().get(resource).then().log().all().extract().response();
	}
	
	public JsonPath getJsonpath(String response)
	{
	    return new JsonPath(response);
	}
	
	public RequestSpecification getRequestSpec()
	{
		RequestSpecification req =  given().header("content-type", "application/json");
		return req;
	}
}
