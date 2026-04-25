package DriveAPI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected String baseUrl;
	protected ChromeDriver driver;

    @BeforeClass
    @Parameters("env.url")
    public void setup(String envUrl) {
        this.baseUrl = envUrl;
        System.out.println("Base URL: " + baseUrl);
    }
    
	
	public WebDriver initializeDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		return driver= new ChromeDriver();	
	}
	
	
	
	public void startDrive()
	{
		initializeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}
	
	String expecteddeliverymessage ="Merci et à bientôt chez POINT.P !";
	String expectedmessage = "Merci pour votre retour\r\n"
			+ "qui nous aide à mieux vous servir.\r\n"
			+ "A bientôt chez POINT.P";

}
