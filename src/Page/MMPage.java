package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.SwitchWindow;

import java.time.Duration;
import java.util.List;

public class MMPage {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPage customerPage;

	public MMPage(WebDriver driver) {
		this.driver = driver;
	}
	public void  inputMM(List<String> inputMMData) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement newDealElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.newDeal));
		newDealElement.isDisplayed();
		newDealElement.click();
		WebElement dealDateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.DEALDATE));
		WebElement dealerdeskElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.DEALERDESK));
		WebElement counterpartyElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COUNTERPARTY));
		WebElement currencyElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.CURRENCY));
		WebElement amountPlacedElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.AMOUNTPLACED));
		WebElement startDateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.STARTDATE));
		WebElement termElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TERM));
		WebElement maturitydateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.MATURITYDATE));
//		WebElement interestBasisElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTBASIS));

		WebElement interestRateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTRATE));
		WebElement paymentdetailtabElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.PAYMENTDETAILTAB));
//		WebElement interestTypeElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTTYPE));

		dealDateElement.sendKeys(inputMMData.get(0));
		dealerdeskElement.clear();
		dealerdeskElement.sendKeys(inputMMData.get(1));
		counterpartyElement.sendKeys(inputMMData.get(2));
		currencyElement.sendKeys(inputMMData.get(3));
		amountPlacedElement.sendKeys(inputMMData.get(4));
		startDateElement.sendKeys(inputMMData.get(5));
		termElement.sendKeys(inputMMData.get(6));
		maturitydateElement.sendKeys(inputMMData.get(7));
//		interestTypeElement.click();
//		interestBasisElement.sendKeys(inputMMData.get(8));
		interestRateElement.sendKeys(inputMMData.get(8));
		
		paymentdetailtabElement.click();
	}
}