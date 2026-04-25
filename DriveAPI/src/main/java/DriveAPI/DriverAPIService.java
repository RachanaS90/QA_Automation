package DriveAPI;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class DriverAPIService {

	private static final String API_Key = "3df689fd-d44b-41f6-8838-4e12487cb9aa";
	private String baseUrl = System.getProperty("env.url");
	private Payload payload = new Payload();
	
    public DriverAPIService(String baseUrl, Payload payload)
    {
    	this.baseUrl= baseUrl;
    	this.payload = payload;
    	RestAssured.baseURI = baseUrl;
    }
    
    private RequestSpecification apiRequest()
    {
		return RestAssured.given().relaxedHTTPSValidation().header("API-Key",API_Key)
				.header("Content-Type","application/json");
    }
    
    public String getCustomerURL(int orderId) {
		return apiRequest()
                .body(payload.getPayload(orderId))
                .post("/drive-api-private/order")
                .jsonPath()
                .getString("customerUrl");
	}
    
    public void orderInProgress(int orderId) {
        apiRequest()
                .body(payload.getOperatorDetailPayload())
                .post("drive-api-private/order/" + orderId + "/event/attributed")
                .then().log().all();
    }

    public void orderDelivered(int orderId) {
        apiRequest()
                .body(payload.getDeliveryNumber())
                .post("drive-api-private/order/" + orderId + "/event/delivered")
                .then().log().all();
    }
	
}
