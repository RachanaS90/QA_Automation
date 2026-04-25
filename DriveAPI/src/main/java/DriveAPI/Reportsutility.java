package DriveAPI;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportsutility {
	
	public static ExtentReports extentReports()
	{
		File file = new File(System.getProperty("user.dir")+"\\ExtentReports\\Index.html");
		ExtentSparkReporter reporter = new ExtentSparkReporter(file);
		reporter.config().setDocumentTitle("API Report");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Web/API Automation Report");
		
		ExtentReports extentreport = new ExtentReports();
		extentreport.attachReporter(reporter);
		
		return extentreport;
		
	}

}
