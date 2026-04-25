package DriveAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateDriveAPITest extends BaseTest {

	private final String baseUrl = System.getProperty("env.url");
	private final Payload payload = new Payload();

	@Test
	public void testRatingsFlow() throws InterruptedException {
		startDrive();
		DriverAPIService apiService = new DriverAPIService(baseUrl, payload);
		AutomateDriveAPI automateDriveAPI = new AutomateDriveAPI(driver, apiService);

		automateDriveAPI.insertParkingLot(1566, "12");
		automateDriveAPI.orderInProgress();
		automateDriveAPI.orderDelivered();
		Assert.assertEquals((automateDriveAPI.checkRatings()).replaceAll("\\r\\n", "\n").trim(),
				expectedmessage.replaceAll("\\r\\n", "\n").trim());
	}

	@Test
	public void testFeedbackFlow() throws InterruptedException {
		startDrive();
		DriverAPIService apiService = new DriverAPIService(baseUrl, payload);
		AutomateDriveAPI automateDriveAPI = new AutomateDriveAPI(driver, apiService);

		automateDriveAPI.insertParkingLot(1562, "10");
		automateDriveAPI.orderInProgress();
		automateDriveAPI.orderDelivered();
		Assert.assertEquals((automateDriveAPI.checkFeedback()).replaceAll("\\r\\n", "\n").trim(),
				expectedmessage.replaceAll("\\r\\n", "\n").trim());
	}

	@Test
	public void skipRatingsPage() throws InterruptedException {
		startDrive();

		DriverAPIService apiService = new DriverAPIService(baseUrl, payload);
		AutomateDriveAPI automateDriveAPI = new AutomateDriveAPI(driver, apiService);

		automateDriveAPI.insertParkingLot(1563, "7");
		automateDriveAPI.orderInProgress();
		automateDriveAPI.orderDelivered();
		Assert.assertEquals((automateDriveAPI.skipRatingsPage()), expecteddeliverymessage);
	}
}
