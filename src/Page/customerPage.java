package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.SwitchWindow;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class customerPage {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPage customerPage;

	public customerPage(WebDriver driver) {
		this.driver = driver;
	}
	public void  inputCustomer(List<String> inputCustomerData) {
		WebElement newDealElement = driver.findElement(customerPageUI.newDeal);
		newDealElement.isDisplayed();
		newDealElement.click();
		WebElement firstNameElement = driver.findElement(customerPageUI.firstName);
		WebElement lastNameElement = driver.findElement(customerPageUI.lastName);
		WebElement middleNameElement = driver.findElement(customerPageUI.middleName);
		WebElement gbFullNameElement = driver.findElement(customerPageUI.gbFullName);
		WebElement gbShortNameElement = driver.findElement(customerPageUI.gbShortName);
		WebElement gbStreetElement = driver.findElement(customerPageUI.gbStreet);
		WebElement gbTownElement = driver.findElement(customerPageUI.gbTown);
		WebElement cityProvinceElement = driver.findElement(customerPageUI.cityProvince);
		WebElement dobElement = driver.findElement(customerPageUI.dob);
		WebElement nationalityElement = driver.findElement(customerPageUI.nationality);
		WebElement idTypeElement = driver.findElement(customerPageUI.idType);
		WebElement idNumberElement = driver.findElement(customerPageUI.idNumber);
		WebElement issuedPlaceElement = driver.findElement(customerPageUI.issuedPlace);
		WebElement issuedDateElement = driver.findElement(customerPageUI.issuedDate);
		WebElement cusClassElement = driver.findElement(customerPageUI.cusClass);
		WebElement sectorElement = driver.findElement(customerPageUI.sector);
		WebElement industryElement = driver.findElement(customerPageUI.industry);
		WebElement classificationElement = driver.findElement(customerPageUI.classification);
		WebElement customerStatusElement = driver.findElement(customerPageUI.customerStatus);
		WebElement genderElement = driver.findElement(customerPageUI.genDer);
		WebElement expiryDateElement = driver.findElement(customerPageUI.expiryDate);

		WebElement staffIDElement = driver.findElement(customerPageUI.staffID);
		WebElement accountOfficerElement = driver.findElement(customerPageUI.accountOfficer);
		WebElement homeTelElement = driver.findElement(customerPageUI.homeTel);
		WebElement emailAddElement = driver.findElement(customerPageUI.emailAdd);
		WebElement mobileNoElement = driver.findElement(customerPageUI.mobileNo);
		WebElement validateDealElement = driver.findElement(customerPageUI.validateDeal);

		firstNameElement.isDisplayed();
		lastNameElement.isDisplayed();

		firstNameElement.sendKeys(inputCustomerData.get(0));
		lastNameElement.sendKeys(inputCustomerData.get(1));
		middleNameElement.sendKeys(inputCustomerData.get(2));
		gbFullNameElement.sendKeys(inputCustomerData.get(3));
		gbShortNameElement.sendKeys(inputCustomerData.get(4));
		gbStreetElement.sendKeys(inputCustomerData.get(5));
		gbTownElement.sendKeys(inputCustomerData.get(6));
		cityProvinceElement.sendKeys(inputCustomerData.get(7));
		dobElement.sendKeys(inputCustomerData.get(8));
		nationalityElement.sendKeys(inputCustomerData.get(9));
		idTypeElement.sendKeys(inputCustomerData.get(10));
		idNumberElement.sendKeys(inputCustomerData.get(11));
		issuedPlaceElement.sendKeys(inputCustomerData.get(12));
		issuedDateElement.sendKeys(inputCustomerData.get(13));
		cusClassElement.click();
		genderElement.click();
		sectorElement.clear();
		sectorElement.sendKeys(inputCustomerData.get(14));
		industryElement.sendKeys(inputCustomerData.get(15));
		classificationElement.sendKeys(inputCustomerData.get(16));
		customerStatusElement.sendKeys(inputCustomerData.get(17));
		staffIDElement.sendKeys(inputCustomerData.get(18));
		accountOfficerElement.sendKeys(inputCustomerData.get(19));
		homeTelElement.sendKeys(inputCustomerData.get(20));
		emailAddElement.sendKeys(inputCustomerData.get(21));
		mobileNoElement.sendKeys(inputCustomerData.get(22));
		expiryDateElement.sendKeys(inputCustomerData.get(23));
		validateDealElement.click();
	}
//	public void authoriseCustomer(String acccountAuth, String authoriseCustomerData) throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
//		driver.navigate().refresh();
//		signInPage = new SignInPage(driver);
//		customerPage = new customerPage(driver);
//		signInPage.signin(acccountAuth, "Abb$1234");
//		signInPage.SwitchFrame1();
//		signInPage.CMD("CUS,VMB.INDIV.SMART");
//		SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
//		WebElement transactionIdElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionId));
//		transactionIdElement.isDisplayed();
//		transactionIdElement.sendKeys(authoriseCustomerData);
//		WebElement performContractElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.performContract));
//		performContractElement.isDisplayed();
//		performContractElement.click();
//		Thread.sleep(1000);
//		WebElement authoriseDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.authoriseDeal));
//		authoriseDealElement.isDisplayed();
//		authoriseDealElement.click();
//		WebElement getCifCorpElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
//		getCifCorpElement.isDisplayed();
//	}
	//Verify Case 001
	public void customerTest001Verify() {
		try {
			WebElement errorBoxElement = driver.findElement(customerPageUI.errorMesBox);
			if (errorBoxElement.isDisplayed()) {
				Assert.fail("Error message box is displayed.");
			}
		} catch (NoSuchElementException e) {
		}
	}
	//Verify Case 002
	public String customerTest002VerifyStreet() {
		WebElement streetErrorElement = driver.findElement(customerPageUI.streetError);
		streetErrorElement.isDisplayed();
		return streetErrorElement.getText();
	}
	public String customerTest002VerifyIdNumber() {
		WebElement idNumberErrorElement = driver.findElement(customerPageUI.idNumberError);
		idNumberErrorElement.isDisplayed();
		return idNumberErrorElement.getText();
	}
	//Verify Case 003
	public String customerTest003Verify() { 
		WebElement errorBoxElement = driver.findElement(customerPageUI.errorMesBox);
		errorBoxElement.isDisplayed();
		System.out.println(errorBoxElement.getText());
		return errorBoxElement.getText();
	}
	//Verify Case 004
	public void customerTest004Verify() {
		WebElement errorBoxElement = driver.findElement(customerPageUI.errorMesBox);	
		Assert.assertEquals(errorBoxElement.getText(),"Issued Date.1 Cannot be Greater than or Equal to Today");
	     System.out.println(errorBoxElement.getText());
	        }
	//Verify Case 005
	public String customerTest005Verify() {
		WebElement errorBoxElement = driver.findElement(customerPageUI.errorMesBox);
		errorBoxElement.isDisplayed();
		return errorBoxElement.getText();
	}
	//Verify Case 006
	public String customerTest006Verify() {
		WebElement errorBoxElement = driver.findElement(customerPageUI.errorMesBox);
		errorBoxElement.isDisplayed();
		System.out.println(errorBoxElement.getText());
		return errorBoxElement.getText();	
	}
	//Test and verify case 007
	public String customerTest007AndVerify(String transactionIdDataTest) throws InterruptedException {
		WebElement transactionIdElement = driver.findElement(customerPageUI.transactionId);
		Assert.assertTrue(transactionIdElement.isDisplayed());
		transactionIdElement.sendKeys(transactionIdDataTest);
		WebElement viewTransactionElement = driver.findElement(customerPageUI.viewTransaction);
		viewTransactionElement.click();
		Thread.sleep(2000);
		WebElement mesBoxElement = driver.findElement(customerPageUI.mesBox);
		mesBoxElement.isDisplayed();
		System.out.println(mesBoxElement.getText());
		return mesBoxElement.getText();
	}
	//Test and verify case 008
	public String customerTest008AndVerify() throws InterruptedException {
		Thread.sleep(500);
		WebElement mesBoxElement = driver.findElement(customerPageUI.mesBox);
		mesBoxElement.isDisplayed();
		System.out.println(mesBoxElement.getText());
		return mesBoxElement.getText();
	}
	//Test and verify case 009
	public void customerTest009AndVerify(String dobAmendData, String customerTest009DataTest  ) throws Exception  {
		WebElement transactionIdAmendElement = driver.findElement(customerPageUI.transactionIdAmend);
		transactionIdAmendElement.isDisplayed();
		transactionIdAmendElement.sendKeys(customerTest009DataTest);
		WebElement editTransactionElement = driver.findElement(customerPageUI.editTransaction);
		editTransactionElement.click();
		WebElement dobElement = driver.findElement(customerPageUI.dob);
		Assert.assertTrue(dobElement.isDisplayed());
		dobElement.clear();
		dobElement.sendKeys(dobAmendData);	
		WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
		commitDealElement.click();
		Thread.sleep(5000);
		WebElement transactionIdAmendElement2 = driver.findElement(customerPageUI.transactionIdAmend);
		transactionIdAmendElement2.isDisplayed();
		transactionIdAmendElement2.sendKeys(customerTest009DataTest);
		WebElement viewTransactionElement = driver.findElement(customerPageUI.viewTransaction);
		Assert.assertTrue(viewTransactionElement.isDisplayed());
		viewTransactionElement.click();	
		WebElement dobAfterAmendElement = driver.findElement(customerPageUI.dobAfterAmend);
		Assert.assertTrue(dobAfterAmendElement.isDisplayed());
		System.out.println(dobAfterAmendElement.getText());
		Assert.assertEquals(dobAmendData,dobAfterAmendElement.getText());
	}
public void customerTest029(String enqShortNameData,String enqCoCodeData) throws Exception  {
	signInPage = new SignInPage(driver);
	customerPage = new customerPage(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("ENQ VMB.CUST.SEARCH.MENU");
	SwitchWindow.switchToWindowWithTitle(driver, "Customer Individual List");
	WebElement enqShortNameElement = driver.findElement(customerPageUI.enqShortName);
	enqShortNameElement.clear();
	WebElement enqCoCodeElement = driver.findElement(customerPageUI.enqCoCode);
	enqCoCodeElement.clear();
	enqShortNameElement.sendKeys(enqShortNameData);
	enqCoCodeElement.sendKeys(enqCoCodeData	);
	WebElement enqFindButtonElement = driver.findElement(customerPageUI.enqFindButton);
	enqFindButtonElement.click();
	WebElement enqviewDetailButtonElement = driver.findElement(customerPageUI.enqviewDetailButton);
	enqviewDetailButtonElement.click();
	SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");

}
}

