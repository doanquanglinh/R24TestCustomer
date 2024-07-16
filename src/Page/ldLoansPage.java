package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import java.util.NoSuchElementException;

public class ldLoansPage {
	private WebDriver driver;
	public ldLoansPage(WebDriver driver) {
		this.driver = driver;
	}
	public void  inputLD(List<String> inputLDData) {
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
		WebElement baseDateKeyElement = driver.findElement(ldLoansPageUI.BASE_DATE_KEY);
		WebElement lsThaNoiElement = driver.findElement(ldLoansPageUI.LS_THA_NOI);
		WebElement ngayThayLSElement = driver.findElement(ldLoansPageUI.NGAY_THAY_LS);
		WebElement autoScheudlesElement = driver.findElement(ldLoansPageUI.AUTO_SCHEUDLES);
		WebElement defineScheudlesElement = driver.findElement(ldLoansPageUI.DEFINE_SCHEUDLES);
		WebElement payMethodElement = driver.findElement(ldLoansPageUI.PAY_METHOD);
		WebElement limitReferenceElement = driver.findElement(ldLoansPageUI.LIMIT_REFERENCE);
		WebElement additionalInfor1Element = driver.findElement(ldLoansPageUI.ADDITIONAL_INFO_1);
		WebElement description1Element = driver.findElement(ldLoansPageUI.DESCRIPTION_1);
		WebElement collateralIDElement = driver.findElement(ldLoansPageUI.COLLATERAL_ID);
		WebElement soTienElement = driver.findElement(ldLoansPageUI.SO_TIEN);
		WebElement ngoaiLeElement = driver.findElement(ldLoansPageUI.NGOAI_LE);
		
		customerIDElement.isDisplayed();
		
		customerIDElement.sendKeys(inputLDData.get(0));
		currencyElement.sendKeys(inputLDData.get(1));
		loanAmountElement.sendKeys(inputLDData.get(2));
		loanStartDateElement.sendKeys(inputLDData.get(3));
		termElement.sendKeys(inputLDData.get(4));
		loanMaturityDateElement.sendKeys(inputLDData.get(5));
		loanProductElement.sendKeys(inputLDData.get(6));
		commitmentRefElement.sendKeys(inputLDData.get(7));
		interestRateElement.sendKeys(inputLDData.get(8));
		baseDateKeyElement.sendKeys(inputLDData.get(9));
		lsThaNoiElement.sendKeys(inputLDData.get(10));
		ngayThayLSElement.sendKeys(inputLDData.get(11));
		autoScheudlesElement.sendKeys(inputLDData.get(12));
		defineScheudlesElement.sendKeys(inputLDData.get(13));
		payMethodElement.sendKeys(inputLDData.get(14));
		limitReferenceElement.sendKeys(inputLDData.get(15));
		additionalInfor1Element.sendKeys(inputLDData.get(16));
		description1Element.sendKeys(inputLDData.get(17));
		collateralIDElement.sendKeys(inputLDData.get(18));
		soTienElement.sendKeys(inputLDData.get(19));
		collateralIDElement.sendKeys(inputLDData.get(20));
		ngoaiLeElement.sendKeys(inputLDData.get(21));
		
	}
}