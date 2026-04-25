package DriveAPI;

public class Payload {
	
	public String getPayload(int orderid) {
		return "{\r\n"
				+ "  \"agencyId\": \"1132\",\r\n"
				+ "  \"orderId\": \""+orderid+"\"\r\n"
				+ "}";
	}
	
	public String getOperatorDetailPayload()
	{
		return "{\r\n"
				+ "  \"operatorId\": \"R9224560\",\r\n"
				+ "  \"operatorName\": \"Rachana\"\r\n"
				+ "}";
	}
	
	public String getDeliveryNumber()
	{
		return "{\r\n"
				+ "  \"deliveryNumber\": \"22ZI39\"\r\n"
				+ "}";
	}

}
