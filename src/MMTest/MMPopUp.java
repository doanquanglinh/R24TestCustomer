package MMTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MMPopUp {
	@Test
    public static void popUp() {
        // Set the path to your ChromeDriver

        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-popup-blocking");
        
        options.addArguments("disable-infobars"); // Disables Chrome's "Chrome is being controlled by automated software" info bar
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://10.32.15.119:10314/BrowserWeb/servlet/BrowserServlet");

        // Your test code here...

        // Close the browser
    }
}
