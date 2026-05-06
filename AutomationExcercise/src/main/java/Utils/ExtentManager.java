package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	    private static ExtentReports extent;
	    public static ExtentReports getInstance() {
	        if (extent == null) {
	            ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");
	            reporter.config().setTheme(Theme.DARK);
	            reporter.config().setDocumentTitle("Automation Excercise Reports");
	            reporter.config().setTimelineEnabled(true);
	            
	            extent = new ExtentReports();
	            extent.attachReporter(reporter);
	        }
	        return extent;
	    }
	

}
