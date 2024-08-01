package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MMPage {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPage customerPage;

	public MMPage(WebDriver driver) {
		this.driver = driver;
	}
	public void  inputCustomer(List<String> inputCustomerData) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement newDealElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.newDeal));
		newDealElement.isDisplayed();
		newDealElement.click();
		
		
	}
}