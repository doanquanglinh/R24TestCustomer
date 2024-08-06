package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Page.MMPage;

import org.openqa.selenium.JavascriptExecutor;


import Base.SwitchWindow;

import org.openqa.selenium.support.ui.Select;


import java.time.Duration;
import java.util.List;

public class MMPage {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPage customerPage;
	private MMPage MMPage;


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
        WebElement commitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
        commitElement.click();
        WebElement overridesElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.OVERRIDES));
        overridesElement.click();
        WebElement commitSuccessfulElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COMMIT_SUCCESSFUL));
        commitSuccessfulElement.isDisplayed();
       
	}
	public void authoriseMM(String acccountAuth, String authoriseMMData) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		MMPage = new MMPage(driver);
		signInPage.signin(acccountAuth, "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.PLACE.OVN");
		SwitchWindow.switchToWindowWithTitle(driver,"MONEY MARKET");
        WebElement transactionAuthMMPlaceOvnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TRANSACTION_ID_MM_PLACE_OVN));
        transactionAuthMMPlaceOvnElement.isDisplayed();
        transactionAuthMMPlaceOvnElement.sendKeys(authoriseMMData);
        WebElement performElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.performContract));
        performElement.click();
        WebElement authoriseDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.authoriseDeal));
        authoriseDealElement.click();
	}
	public String MM002Verify() {
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement commitSuccessfulMessElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mesBox));
		commitSuccessfulMessElement.isDisplayed();
		System.out.println(commitSuccessfulMessElement.getText().substring(14,27));
		return commitSuccessfulMessElement.getText().substring(14,27);
	       
	}
	public void authoriseAndAuthMM003(String acccountAuth, String authoriseMMData) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		MMPage = new MMPage(driver);
		signInPage.signin(acccountAuth, "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.PLACE.MTHLY.INT");
		SwitchWindow.switchToWindowWithTitle(driver,"MONEY MARKET");
        WebElement transactionAuthMMMthkyIntElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TRANSACTION_ID_MM_MTHLY_INT));
        transactionAuthMMMthkyIntElement.isDisplayed();
        transactionAuthMMMthkyIntElement.sendKeys(authoriseMMData);
        WebElement performElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.performContract));
        performElement.click();
        WebElement authoriseDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.authoriseDeal));
        authoriseDealElement.click();
        
	}
	public String MM003Verify() {
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement commitSuccessfulMessElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mesBox));
		commitSuccessfulMessElement.isDisplayed();
		System.out.println(commitSuccessfulMessElement.getText().substring(14,27));
		return commitSuccessfulMessElement.getText().substring(14,27);
	       
	}
	
	public void  inputMM004(List<String> inputMMData004) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement newDealElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.newDeal));
		newDealElement.isDisplayed();
		newDealElement.click();
		WebElement dealDateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.DEALDATE));
		dealDateElement.sendKeys(inputMMData004.get(0));
		WebElement dealerdeskElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.DEALERDESK));
		dealerdeskElement.clear();
		dealerdeskElement.sendKeys(inputMMData004.get(1));
		WebElement counterpartyElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COUNTERPARTY));
		counterpartyElement.sendKeys(inputMMData004.get(2));
		WebElement currencyElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.CURRENCY));
		currencyElement.sendKeys(inputMMData004.get(3));
		WebElement amountPlacedElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.AMOUNTPLACED));
		amountPlacedElement.sendKeys(inputMMData004.get(4));
		WebElement startDateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.STARTDATE));
		startDateElement.sendKeys(inputMMData004.get(5));
		WebElement termElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TERM));
		termElement.clear();
		termElement.sendKeys(inputMMData004.get(6));

		WebElement interestRateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTRATE));
		interestRateElement.sendKeys(inputMMData004.get(8));
		
		
		WebElement maturitydateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.MATURITYDATE));
		maturitydateElement.sendKeys(inputMMData004.get(7));
		Thread.sleep(3000);

		WebElement capitalisationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.CAPITALISATION));
		capitalisationElement.click();
		
		
    	WebElement interestBasisElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTBASIS));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = '';", interestBasisElement);
        js.executeScript("arguments[0].dispatchEvent(new Event('change'))", interestBasisElement);
        
        WebElement negativeRateElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.NEGATIVE_RATE));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].value = 'NO';", negativeRateElement);
        js2.executeScript("arguments[0].dispatchEvent(new Event('change'))", negativeRateElement);
        
	
		WebElement descDeptElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.DESC_DEPT));
		descDeptElement.clear();
		
		WebElement noiLuuKyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.NOI_LUU_KY));
		noiLuuKyElement.sendKeys(inputMMData004.get(10));
			
		WebElement tongMenhGiaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TONG_MENH_GIA));
		tongMenhGiaElement.sendKeys(inputMMData004.get(11));
		
		WebElement interestTypeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INTERESTTYPE));
		interestTypeElement.click();
		
		WebElement paymentDetailTabElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.PAYMENTDETAILTAB));
		paymentDetailTabElement.click();
		WebElement creditAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.CREDITACCOUNT));
		creditAccountElement.sendKeys(inputMMData004.get(10));
		WebElement principalLiqacctElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.PRINCIPALLIQACCT));
		principalLiqacctElement.sendKeys(inputMMData004.get(11));
		WebElement interestLiqAccttElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.INT_LIQ_ACCT));
		interestLiqAccttElement.sendKeys(inputMMData004.get(12));
		WebElement securedFormElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.SECURED_FORM));
        Select securedForm = new Select(securedFormElement);
        securedForm.selectByValue(inputMMData004.get(13));
        WebElement typeOfTxnsElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TYPE_OF_TXNS));
        Select typeOfTxns = new Select(typeOfTxnsElement);
        typeOfTxns.selectByValue(inputMMData004.get(14));
        WebElement free1Element  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.FREE_1));
        free1Element.sendKeys(inputMMData004.get(15));
        WebElement freeExpandElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.FREE_EXPAND));
        freeExpandElement.click();
        WebElement free2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.FREE_2));
        free2Element.sendKeys(inputMMData004.get(16));
        WebElement commitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
        commitElement.click();
        
        WebElement overridesElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.OVERRIDES));
        overridesElement.click();
        WebElement commitSuccessfulElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COMMIT_SUCCESSFUL));
        commitSuccessfulElement.isDisplayed();
       
        
	}
	
	public void authoriseAndAuthMM004(String acccountAuth, String authoriseMMData) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		MMPage = new MMPage(driver);
		signInPage.signin(acccountAuth, "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.REVREPO");
		SwitchWindow.switchToWindowWithTitle(driver,"MONEY MARKET");
        WebElement transactionAuthMMMthkyIntElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TRANSACTION_ID_MM_TAKING));
        transactionAuthMMMthkyIntElement.isDisplayed();
        transactionAuthMMMthkyIntElement.sendKeys(authoriseMMData);
        WebElement performElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.performContract));
        performElement.click();
        WebElement authoriseDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.authoriseDeal));
        authoriseDealElement.click();
        
	}
	public String MM004Verify() {
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement commitSuccessfulMessElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mesBox));
		commitSuccessfulMessElement.isDisplayed();
		System.out.println(commitSuccessfulMessElement.getText().substring(14,27));
		return commitSuccessfulMessElement.getText().substring(14,27);
	       
	}
	
	
	
	
	public void authoriseAndAuthMM005(String acccountAuth, String authoriseMMData) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		MMPage = new MMPage(driver);
		signInPage.signin(acccountAuth, "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.PLACE.CALL");
		SwitchWindow.switchToWindowWithTitle(driver,"MONEY MARKET");
        WebElement transactionAuthMMMthkyIntElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MMPageUI.TRANSACTION_ID_MM_TAKING));
        transactionAuthMMMthkyIntElement.isDisplayed();
        transactionAuthMMMthkyIntElement.sendKeys(authoriseMMData);
        WebElement performElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.performContract));
        performElement.click();
        WebElement authoriseDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.authoriseDeal));
        authoriseDealElement.click();
        
	}
	
}