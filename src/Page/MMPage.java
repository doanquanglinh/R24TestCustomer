package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;
import java.util.List;

public class MMPage {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPage customerPage;

	public MMPage(WebDriver driver) {
		this.driver = driver;
	}
	public void  inputMM(List<String> inputMMData) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement newDealElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.newDeal));
		newDealElement.isDisplayed();
		newDealElement.click();
		WebElement dealDateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.DEALDATE));
		dealDateElement.sendKeys(inputMMData.get(0));
		WebElement dealerdeskElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.DEALERDESK));
		dealerdeskElement.clear();
		dealerdeskElement.sendKeys(inputMMData.get(1));
		WebElement counterpartyElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COUNTERPARTY));
		counterpartyElement.sendKeys(inputMMData.get(2));
		WebElement currencyElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.CURRENCY));
		currencyElement.sendKeys(inputMMData.get(3));
		WebElement amountPlacedElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.AMOUNTPLACED));
		amountPlacedElement.sendKeys(inputMMData.get(4));
		WebElement startDateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.STARTDATE));
		startDateElement.sendKeys(inputMMData.get(5));
		WebElement termElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TERM));
		termElement.clear();
		termElement.sendKeys(inputMMData.get(6));
		WebElement maturitydateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.MATURITYDATE));
		maturitydateElement.sendKeys(inputMMData.get(7));
		WebElement interestTyperElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTTYPE));
		interestTyperElement.click();
		WebElement interestBasisElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTBASIS));
        Select dropdown = new Select(interestBasisElement);
        dropdown.selectByVisibleText("");
		WebElement negativeRateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.NEGATIVE_RATE));
        Select dropdownnegativeRate = new Select(negativeRateElement);
        dropdownnegativeRate.selectByValue(inputMMData.get(9));

		WebElement interestRateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTRATE));
		interestRateElement.sendKeys(inputMMData.get(8));
		WebElement capitalisationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.CAPITALISATION));
		capitalisationElement.click();
		WebElement paymentDetailTabElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.PAYMENTDETAILTAB));
		paymentDetailTabElement.click();
		WebElement creditAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.CREDITACCOUNT));
		creditAccountElement.sendKeys(inputMMData.get(10));
		WebElement principalLiqacctElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.PRINCIPALLIQACCT));
		principalLiqacctElement.sendKeys(inputMMData.get(11));
		WebElement interestLiqAccttElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INT_LIQ_ACCT));
		interestLiqAccttElement.sendKeys(inputMMData.get(12));
		WebElement securedFormElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.SECURED_FORM));
        Select securedForm = new Select(securedFormElement);
        securedForm.selectByValue(inputMMData.get(13));
        WebElement typeOfTxnsElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TYPE_OF_TXNS));
        Select typeOfTxns = new Select(typeOfTxnsElement);
        typeOfTxns.selectByValue(inputMMData.get(14));
        WebElement free1Element  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.FREE_1));
        free1Element.sendKeys(inputMMData.get(15));
        WebElement freeExpandElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.FREE_EXPAND));
        freeExpandElement.click();
        WebElement free2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.FREE_2));
        free2Element.sendKeys(inputMMData.get(16));
	}
}