package Base;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class SwitchWindow {
    public static boolean switchToWindowWithTitle(WebDriver driver, String title) {
        Set<String> allWindowHandles = driver.getWindowHandles(); 
        for (String handle : allWindowHandles) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
}
