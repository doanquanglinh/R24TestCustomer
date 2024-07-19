package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.SwitchWindow;

import java.time.Duration;
import java.util.List;
public class LimitPage {
	private WebDriver driver;
	private SignInPage signInPage;
	public LimitPage(WebDriver driver) {
		this.driver = driver;
	}
	public void inputLimit(List<String> inputLimitData) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement transactionID  = wait.until(ExpectedConditions.visibilityOfElementLocated(LimitUI.TRANSACTION_ID_LIMIT));
		transactionID.isDisplayed();
		WebElement editTransaction  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
		editTransaction.click();
		WebElement proposalDate  = wait.until(ExpectedConditions.visibilityOfElementLocated(LimitUI.PROPOSAL_DATE));
		WebElement approvalDate  = wait.until(ExpectedConditions.visibilityOfElementLocated(LimitUI.APPROVAL_DATE));
		WebElement termLimit  = wait.until(ExpectedConditions.visibilityOfElementLocated(LimitUI.TERM_LIMIT));
		WebElement reviewFrequency	  = wait.until(ExpectedConditions.visibilityOfElementLocated(LimitUI.REVIEW_FREQUENCY));
		WebElement expiryDate  = wait.until(ExpectedConditions.visibilityOfElementLocated(LimitUI.EXPIRY_DATE));
		WebElement productAllowed  = wait.until(ExpectedConditions.visibilityOfElementLocated(LimitUI.PRODUCT_ALLOWED));
		WebElement internalAmount  = wait.until(ExpectedConditions.visibilityOfElementLocated(LimitUI.INTERNAL_AMOUNT));
		proposalDate.isDisplayed();
		
		transactionID.sendKeys(inputLimitData.get(0));
		proposalDate.sendKeys(inputLimitData.get(1));
		approvalDate.sendKeys(inputLimitData.get(2));
		termLimit.sendKeys(inputLimitData.get(3));
		reviewFrequency.sendKeys(inputLimitData.get(4));
		expiryDate.sendKeys(inputLimitData.get(5));
		productAllowed.sendKeys(inputLimitData.get(6));
		internalAmount.sendKeys(inputLimitData.get(7));
	}
	public void authoriseLIMIT(String acccountAuth, String authoriseCustomerData) throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		signInPage.signin(acccountAuth, "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LIMIT");
		
	}
	

	
}