package AutomationExcercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

    protected WebDriver driver;       // MUST be protected
    protected Loginpage loginpage;     // accessible to child tests
    
    String expectedtitle = "Automation Exercise";
	String expectederrormessage = "Email Address already exist!";
	String expectedtext = "Logged in as";
	String expecteddeletemessage = "ACCOUNT DELETED!";
	String expectedinvaliderrormessage = "Your email or password is incorrect!";
	String expectedproducttext = "ALL PRODUCTS";
	String expectedsearchproducttitle = "SEARCHED PRODUCTS";
	String productName = "Men Tshirt";
	String expectedorderplacedmessage = "ORDER PLACED!";

    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("https://automationexercise.com");

        // ✅ Initialize page object AFTER driver
        loginpage = new Loginpage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}