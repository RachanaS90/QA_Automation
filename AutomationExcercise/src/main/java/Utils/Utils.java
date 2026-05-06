package Utils;
import java.io.File;
import java.nio.file.Paths;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Utils {

	public static String captureScreenshot(WebDriver driver, String testname)
	{
		try {
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(screenshot.toPath(), Paths.get("screenshots",testname +".png"));
			System.out.println("Screenshot saved for test: " + testname);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return testname;
	}
}
