package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseSetup {

	private WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(String browserType, String URL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(URL);
			break;
		default:
			System.out.println("Browser: " + browserType + " is invalid, Launching Chrome as browser of choice...");
			driver = initChromeDriver(URL);
		}
	}

	private WebDriver initChromeDriver(String URL) {
		System.out.println("Launching Chrome browser...");
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		return driver;
	}

	@Parameters({ "browserType", "URL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String URL) {
		try {
			setDriver(browserType, URL);
		} catch (Exception e) {
			System.out.println("Error..." + e.getStackTrace());
		}
	}

	@AfterClass
	public void tearDown() throws Exception {
	     if (driver != null) {
	        // 	driver.quit();
	            System.out.println("Done");
	        }
	   
	}	
}
