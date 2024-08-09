package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.SwitchWindow;

import java.time.Duration;
import java.util.List;
public class accountPage {
	private WebDriver driver;
	public accountPage(WebDriver driver) {
		this.driver = driver;
	}
	public void  inputCurAccount(List<String> inputCurAccountData) throws InterruptedException {
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
	Thread.sleep(5000);
	}
	
	public void  inputLoanAccount(List<String> inputLoanAccount) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement customerIDElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.CUSTOMER_ID));
	WebElement productCodeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.PRODUCT_CODE));
	WebElement mnemonicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.MNEMONIC));
	WebElement currencyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.CURRENCY));
	customerIDElement.isDisplayed();
	
	customerIDElement.sendKeys(inputLoanAccount.get(0));
	productCodeElement.clear();
	productCodeElement.sendKeys(inputLoanAccount.get(1));
	mnemonicElement.sendKeys(inputLoanAccount.get(2));
	currencyElement.sendKeys(inputLoanAccount.get(3));
	WebElement commitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	commitElement.click();
	}
	
	public void  authAccount(String acccountAuth, String authoriseAccountData) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		SignInPage signInPage = new SignInPage(driver);
		signInPage.closeAfterMethod();
		signInPage.signin(acccountAuth, "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("ACCOUNT");
		SwitchWindow.switchToWindowWithTitle(driver,"ACCOUNT");
		WebElement transactionIDElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.TRANSACTION_ID_AU_ACC));
		transactionIDElement.isDisplayed();
		transactionIDElement.sendKeys(authoriseAccountData);
		WebElement performElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.performContract));
		performElement.click();
		WebElement authDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.authoriseDeal));
		authDealElement.click();
		WebElement getCurAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.MESSAGE));
	    getCurAccountElement.isDisplayed();
		driver.close();
		
	}

	
}

