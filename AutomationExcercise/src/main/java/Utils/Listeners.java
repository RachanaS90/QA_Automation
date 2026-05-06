package Utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listeners implements ITestListener {

	private static ExtentReports extent = ExtentManager.getInstance();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
 private WebDriver driver;
	
	public Listeners() {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
		String screenshotPath = Utils.captureScreenshot(driver, result.getName());
		test.get().fail("Test Failed").addScreenCaptureFromPath(screenshotPath);
		System.out.println("Screenshot captured for failed test: " + result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
		test.set(extentTest);
		System.out.println("Starting test: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test Passed");
		System.out.println("Test passed: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.get().skip("Test Skipped");
		System.out.println("Test skipped: " + result.getName());
	}

}
