package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ldLoansPage {
	private WebDriver driver;
	public ldLoansPage(WebDriver driver) {
		this.driver = driver;
	}
	public void  inputLD(List<String> inputLDData) throws InterruptedException {
		WebElement newDealElement = driver.findElement(ldLoansPageUI.NEWDEAL);
		newDealElement.isDisplayed();
		newDealElement.click();
		WebElement customerIDElement = driver.findElement(ldLoansPageUI.CUSTOMERID);
		customerIDElement.isDisplayed();
		WebElement currencyElement = driver.findElement(ldLoansPageUI.CURRENCY);
		WebElement loanAmountElement = driver.findElement(ldLoansPageUI.LOAN_AMOUNT1);
		WebElement loanStartDateElement = driver.findElement(ldLoansPageUI.lOAN_START_DATE);
		WebElement termElement = driver.findElement(ldLoansPageUI.TERM);
		WebElement loanMaturityDateElement = driver.findElement(ldLoansPageUI.LOAN_MATURITY_DATE);
		WebElement loanProductElement = driver.findElement(ldLoansPageUI.LOAN_PRODUCT);
		WebElement commitmentRefElement = driver.findElement(ldLoansPageUI.COMMITMENT_REF);
		WebElement interestRateElement = driver.findElement(ldLoansPageUI.INTEREST_RATE);
		WebElement interestDueDateElement = driver.findElement(ldLoansPageUI.INTEREST_DUE_DATE);
//		WebElement baseDateKeyElement = driver.findElement(ldLoansPageUI.BASE_DATE_KEY);
		WebElement lsThaNoiElement = driver.findElement(ldLoansPageUI.LS_THA_NOI);
		WebElement ngayThayLSElement = driver.findElement(ldLoansPageUI.NGAY_THAY_LS);
		WebElement autoScheudlesElement = driver.findElement(ldLoansPageUI.AUTO_SCHEUDLES);
		WebElement defineScheudlesElement = driver.findElement(ldLoansPageUI.DEFINE_SCHEUDLES);
//		WebElement payMethodElement = driver.findElement(ldLoansPageUI.PAY_METHOD);
		WebElement limitReferenceElement = driver.findElement(ldLoansPageUI.LIMIT_REFERENCE);
		WebElement additionalInfor1Element = driver.findElement(ldLoansPageUI.ADDITIONAL_INFO_1);
		WebElement expandAdditionalInfor = driver.findElement(ldLoansPageUI.EXPAND_ADDITIONAL_INFO);
		expandAdditionalInfor.click();
		WebElement additionalInfor2Element = driver.findElement(ldLoansPageUI.ADDITIONAL_INFO_2);
		WebElement description1Element = driver.findElement(ldLoansPageUI.DESCRIPTION_1);
		WebElement description2Element = driver.findElement(ldLoansPageUI.DESCRIPTION_2);
		WebElement collateralIDElement = driver.findElement(ldLoansPageUI.COLLATERAL_ID);
		WebElement soTienElement = driver.findElement(ldLoansPageUI.SO_TIEN);
		WebElement ngoaiLeElement = driver.findElement(ldLoansPageUI.NGOAI_LE);
		WebElement purposeOfLoanElement = driver.findElement(ldLoansPageUI.PURPOSE_OF_LOAN);
		WebElement fwdBackKey = driver.findElement(ldLoansPageUI.FORWARD_BACK_KEY);

		
		customerIDElement.isDisplayed();
		
		customerIDElement.sendKeys(inputLDData.get(0));
		currencyElement.sendKeys(inputLDData.get(1));
		loanAmountElement.sendKeys(inputLDData.get(2));
		loanStartDateElement.sendKeys(inputLDData.get(3));
		Thread.sleep(5000);
		termElement.sendKeys(inputLDData.get(4));
		loanMaturityDateElement.sendKeys(inputLDData.get(5));
		loanProductElement.sendKeys(inputLDData.get(6));
		commitmentRefElement.sendKeys(inputLDData.get(7));
		interestRateElement.sendKeys(inputLDData.get(8));
		interestDueDateElement.sendKeys(inputLDData.get(9));
		lsThaNoiElement.click();
		ngayThayLSElement.sendKeys(inputLDData.get(10));
		autoScheudlesElement.sendKeys(inputLDData.get(11));
		defineScheudlesElement.sendKeys(inputLDData.get(12));
		limitReferenceElement.sendKeys(inputLDData.get(13));
		description1Element.sendKeys(inputLDData.get(14));
		collateralIDElement.sendKeys(inputLDData.get(15));
		soTienElement.sendKeys(inputLDData.get(16));
		ngoaiLeElement.click();
		purposeOfLoanElement.sendKeys(inputLDData.get(17));
		fwdBackKey.sendKeys(inputLDData.get(18));
		additionalInfor1Element.sendKeys(inputLDData.get(19));
		additionalInfor2Element.isDisplayed();
		additionalInfor2Element.sendKeys(inputLDData.get(20));
		description2Element.sendKeys(inputLDData.get(21));
		WebElement validateDealElement = driver.findElement(customerPageUI.validateDeal);
		validateDealElement.click();

	}
	
	//LD.LOANS.AND.DEPOSITS,VMB.COMMIT 
	public void  inputParentLD(List<String> inputParentLDData) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement newDealElement= wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.NEWDEAL));
		WebElement customerIDElement= wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.CUSTOMERID));
		customerIDElement.isDisplayed();
		WebElement currencyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.CURRENCY));
		WebElement commitmentAmountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.LOAN_AMOUNT1));
		WebElement commitmentStartDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.lOAN_START_DATE));
		WebElement termElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.TERM));
		WebElement commitmentEndDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.LOAN_MATURITY_DATE));
		WebElement ngoaiLeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.NGOAI_LE));
		
		newDealElement.isDisplayed();
		newDealElement.click();
		
		newDealElement
		
		
		
		
		
		
		WebElement validateDealElement = driver.findElement(customerPageUI.validateDeal);
		validateDealElement.click();

	}
	
	//Verify Case 014//
public String ldLoanTest014Verify() {
	WebElement ErrorElement = driver.findElement(ldLoansPageUI.ERROR_MES_BOX);
	ErrorElement.isDisplayed();
	return ErrorElement.getText();
	}

//Verify Case 015//
public String ldLoanTest015Verify() {
WebElement ErrorElement = driver.findElement(ldLoansPageUI.ERROR_MES_BOX);
ErrorElement.isDisplayed();
return ErrorElement.getText();
}

public String ldLoanTest025Verify(String amtIncDecData, String effDateData) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement amtIncDec= wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.AMT_INCREASE_DECREASE));
	amtIncDec.sendKeys(amtIncDecData);
	WebElement effDate= wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.EFFECTIVE_DATE));
	effDate.sendKeys(effDateData);
	WebElement validateDeal= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.validateDeal));
	validateDeal.click();
	WebElement ErrorElement = driver.findElement(ldLoansPageUI.ERROR_MES_BOX);
	ErrorElement.isDisplayed();
	System.out.println(ErrorElement.getText());
	return ErrorElement.getText();
}

public String ldLoanTest026Verify(String amtIncDecData, String effDateData) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement amtIncDec= wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.AMT_INCREASE_DECREASE));
	amtIncDec.sendKeys(amtIncDecData);
	WebElement effDate= wait.until(ExpectedConditions.visibilityOfElementLocated(ldLoansPageUI.EFFECTIVE_DATE));
	effDate.sendKeys(effDateData);
	WebElement validateDeal= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.validateDeal));
	validateDeal.click();
	WebElement ErrorElement = driver.findElement(ldLoansPageUI.ERROR_MES_BOX);
	ErrorElement.isDisplayed();
	System.out.println(ErrorElement.getText());
	return ErrorElement.getText();
}


}