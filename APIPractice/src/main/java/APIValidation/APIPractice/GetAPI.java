package APIValidation.APIPractice;

import io.restassured.response.Response;

public class GetAPI extends BasePage {

	public int getUserId() {
		Response response = getResponse("/users/octocat");
		String userid = getJsonpath(response.getBody().asString()).getString("id");
		System.out.println(userid);
		return response.getStatusCode();
	}

	public String getlocation() {
		Response response = getResponse("/users/octocat");
		String location = getJsonpath(response.getBody().asString()).getString("location");
		System.out.println(location);
		return location;
	}

	public String getURL() {
		Response response = getResponse("/users/octocat");
		String actualurl = getJsonpath(response.getBody().asString()).getString("url");
		System.out.println(actualurl);
		return actualurl;

	}

}
