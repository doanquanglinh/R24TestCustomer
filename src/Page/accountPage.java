package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class accountPage {
	private WebDriver driver;
	public accountPage(WebDriver driver) {
		this.driver = driver;
	}
	public void  inputCurAccount(List<String> inputCurAccountData) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement customerIDElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.CUSTOMER_ID));
	WebElement productCodeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.PRODUCT_CODE));
	WebElement mnemonicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.MNEMONIC));
	WebElement currencyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.CURRENCY));
	WebElement nhomTaiKhoanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.NHOM_TAI_KHOAN));
	WebElement commitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	customerIDElement.isDisplayed();
	customerIDElement.sendKeys(inputCurAccountData.get(0));
	productCodeElement.clear();
	productCodeElement.sendKeys(inputCurAccountData.get(1));
	mnemonicElement.sendKeys(inputCurAccountData.get(2));
	currencyElement.sendKeys(inputCurAccountData.get(3));
	nhomTaiKhoanElement.sendKeys(inputCurAccountData.get(4));
	commitElement.click();
	}
	
	public void  inputLoanAccount(List<String> inputLoanAccount) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement customerIDElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.CUSTOMER_ID));
	WebElement productCodeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.PRODUCT_CODE));
	WebElement mnemonicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.MNEMONIC));
	WebElement currencyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.CURRENCY));
	WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.MESSAGE));
	WebElement nhomTaiKhoanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.NHOM_TAI_KHOAN));
	customerIDElement.isDisplayed();
	
	customerIDElement.sendKeys(inputLoanAccount.get(0));
	productCodeElement.sendKeys(inputLoanAccount.get(1));
	mnemonicElement.sendKeys(inputLoanAccount.get(2));
	currencyElement.sendKeys(inputLoanAccount.get(3));
	messageElement.sendKeys(inputLoanAccount.get(4));
	nhomTaiKhoanElement.sendKeys(inputLoanAccount.get(5));
	}

}

