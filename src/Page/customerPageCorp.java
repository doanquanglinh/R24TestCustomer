package Page;

import Page.customerPageCorp;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Page.customerPageCorp;
import Base.SwitchWindow;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class customerPageCorp {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPageCorp customerPageCorp;

	public customerPageCorp(WebDriver driver) {
		this.driver = driver;
	}

	public void inputCustomerCorp(List<String> inputCustomerCorpData) throws InterruptedException {
		WebElement newDealElementCorp = driver.findElement(customerPageUI.newDeal);
		newDealElementCorp.isDisplayed();
		newDealElementCorp.click();
		WebElement gbFullNameCorpElement = driver.findElement(customerPageUI.gbFullName);
		WebElement gbShortNameCorpElement = driver.findElement(customerPageUI.gbShortName);
		WebElement registeredAddressElement = driver.findElement(customerPageUI.gbStreet);
		WebElement hoAdressElement = driver.findElement(customerPageUI.hoAdress);
		WebElement currAdressElement = driver.findElement(customerPageUI.currAdress);
		WebElement inCorpDateElement = driver.findElement(customerPageUI.dob);
		WebElement otherAdressElement = driver.findElement(customerPageUI.otherAdress);
		WebElement gbTownDistrictElement = driver.findElement(customerPageUI.gbTown);
		WebElement cityProvinceElement = driver.findElement(customerPageUI.cityProvince);
		WebElement taxCodeElement = driver.findElement(customerPageUI.taxCode);
		WebElement idTypeCorpElement = driver.findElement(customerPageUI.idType);
		WebElement idNumberElement = driver.findElement(customerPageUI.idNumber);
		WebElement issuedPlaceCorpElement = driver.findElement(customerPageUI.issuedPlace);
		WebElement issuedDateCorpElement = driver.findElement(customerPageUI.issuedDate);
		WebElement expiryDateCorpElement = driver.findElement(customerPageUI.expiryDate);
		WebElement officeTelElement = driver.findElement(customerPageUI.officeTel);
		WebElement faxNoElement = driver.findElement(customerPageUI.faxNo);
		WebElement establishDateElement = driver.findElement(customerPageUI.establishDate);
		/*************************/
		WebElement doanhThuClickElement = driver.findElement(customerPageUI.doanhThuClick);
		WebElement hanMucTDElement = driver.findElement(customerPageUI.hanMucTD);
		hanMucTDElement.click();
		WebElement cusAccepElement = driver.findElement(customerPageUI.cusAccep);
		cusAccepElement.click();
		WebElement cusClassCorpElement = driver.findElement(customerPageUI.cusClass);
		cusClassCorpElement.click();
		/*************************/
		WebElement yomIndustryElement = driver.findElement(customerPageUI.yomIndustry);
		WebElement sectorMainCorpElement = driver.findElement(customerPageUI.sectorMain);
		WebElement sectorCorpElement = driver.findElement(customerPageUI.sector);
		WebElement industryCorpElement = driver.findElement(customerPageUI.industry);
		WebElement customerStatusCorpElement = driver.findElement(customerPageUI.customerStatus);
		WebElement staffIDCorpElement = driver.findElement(customerPageUI.staffID);
		WebElement contactNameCorpElement = driver.findElement(customerPageUI.contactName);
		WebElement officeNumberCorpElement = driver.findElement(customerPageUI.officeNumber);
		WebElement idNumberCorpElement = driver.findElement(customerPageUI.idNumberCorp);
		WebElement contactNationalityElement = driver.findElement(customerPageUI.contactNationality);
		WebElement contactDOBElement = driver.findElement(customerPageUI.contactDOB);

		/*************************/
		gbFullNameCorpElement.isDisplayed();
		gbShortNameCorpElement.isDisplayed();
		registeredAddressElement.isDisplayed();
		hoAdressElement.isDisplayed();
		/*************************/

		gbFullNameCorpElement.sendKeys(inputCustomerCorpData.get(0));
		gbShortNameCorpElement.sendKeys(inputCustomerCorpData.get(1));
		registeredAddressElement.sendKeys(inputCustomerCorpData.get(2));
		hoAdressElement.sendKeys(inputCustomerCorpData.get(3));
		currAdressElement.sendKeys(inputCustomerCorpData.get(4));
		inCorpDateElement.sendKeys(inputCustomerCorpData.get(5));
		otherAdressElement.sendKeys(inputCustomerCorpData.get(6));
		gbTownDistrictElement.sendKeys(inputCustomerCorpData.get(7));
		cityProvinceElement.sendKeys(inputCustomerCorpData.get(8));
		taxCodeElement.sendKeys(inputCustomerCorpData.get(9));
		idTypeCorpElement.sendKeys(inputCustomerCorpData.get(10));
		idNumberElement.sendKeys(inputCustomerCorpData.get(11));
		issuedPlaceCorpElement.sendKeys(inputCustomerCorpData.get(12));
		issuedDateCorpElement.sendKeys(inputCustomerCorpData.get(13));
		expiryDateCorpElement.sendKeys(inputCustomerCorpData.get(14));
		officeTelElement.sendKeys(inputCustomerCorpData.get(15));
		faxNoElement.sendKeys(inputCustomerCorpData.get(16));
		establishDateElement.sendKeys(inputCustomerCorpData.get(17));

		/*************************/
		doanhThuClickElement.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.doanhThu));
		wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.doanhThuTable));
		WebElement doanhThuTableElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.doanhThuText));
		doanhThuTableElement.click();
		
		/*************************/

		yomIndustryElement.sendKeys(inputCustomerCorpData.get(18));
		sectorMainCorpElement.sendKeys(inputCustomerCorpData.get(19));
		sectorCorpElement.isDisplayed();
		sectorCorpElement.clear();
		sectorCorpElement.sendKeys(inputCustomerCorpData.get(20));
		industryCorpElement.sendKeys(inputCustomerCorpData.get(21));
		customerStatusCorpElement.sendKeys(inputCustomerCorpData.get(22));
		staffIDCorpElement.sendKeys(inputCustomerCorpData.get(23));
		contactNameCorpElement.sendKeys(inputCustomerCorpData.get(24));
		officeNumberCorpElement.isDisplayed();
		officeNumberCorpElement.sendKeys(inputCustomerCorpData.get(25));
		idNumberCorpElement.sendKeys(inputCustomerCorpData.get(26));
		contactNationalityElement.sendKeys(inputCustomerCorpData.get(27));
		contactDOBElement.sendKeys(inputCustomerCorpData.get(28));
		Thread.sleep(1000);
		WebElement validateDealCorp010Element = driver.findElement(customerPageUI.validateDeal);
		validateDealCorp010Element.click();
	}
	
	public void authoriseCustomerCorp(String acccountAuth, String authoriseCustomerData) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin(acccountAuth, "Anbinh$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
		WebElement transactionIdCorpElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorp));
		transactionIdCorpElement.isDisplayed();
		transactionIdCorpElement.sendKeys(authoriseCustomerData);
		WebElement performContractElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.performContract));
		performContractElement.isDisplayed();
		performContractElement.click();
		Thread.sleep(1000);
		WebElement authoriseDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.authoriseDeal));
		authoriseDealElement.isDisplayed();
		authoriseDealElement.click();
		WebElement getCifCorpElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
		getCifCorpElement.isDisplayed();
	}
	public void authoriseCustomerCorpAmendVersion(String acccountAuth, String authoriseCustomerData) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin(acccountAuth, "Anbinh$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
		SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
		WebElement transactionIdCorpElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
		transactionIdCorpElement.isDisplayed();
		transactionIdCorpElement.sendKeys(authoriseCustomerData);
		WebElement performContractElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.performContract));
		performContractElement.isDisplayed();
		performContractElement.click();
		Thread.sleep(1000);
		WebElement authoriseDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.authoriseDeal));
		authoriseDealElement.isDisplayed();
		authoriseDealElement.click();
		WebElement getCifCorpElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
		getCifCorpElement.isDisplayed();
	}
	
	
	//Verify Case 010///
public void customerTest010Verify() {
		try {
			WebElement errorBoxElement = driver.findElement(customerPageUI.errorMesBox);
			if (errorBoxElement.isDisplayed()) {
				Assert.fail("Error message box is displayed.");
			}
		} catch (NoSuchElementException e) {
		}
	}
	//Verify Case 011
public String customerTest011Verify() {
		WebElement errorBoxElement = driver.findElement(customerPageUI.errorMesBox);
		errorBoxElement.isDisplayed();
		System.out.println(errorBoxElement.getText());
		return errorBoxElement.getText();	
	}
	//Verify Case 012
public String customerTest012Verify(String transactionIdCorpDataTest){
			WebElement mesBoxElement = driver.findElement(customerPageUI.mesBox);
			mesBoxElement.isDisplayed();
			System.out.println(mesBoxElement.getText());
			return mesBoxElement.getText();
		}
	//Verify Case 013
public void customerTest013AndVerify(String AmendData,String emailAddData,String mobileNumberData, String customerTest013DataTest  ) throws Exception  {
			WebElement transactionIdCorpAmendElement = driver.findElement(customerPageUI.transactionIdCorpAmend);
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest013DataTest);
			WebElement editTransactionCorpElement = driver.findElement(customerPageUI.editTransaction);
			editTransactionCorpElement.click();
			WebElement gbStreetElement = driver.findElement(customerPageUI.gbStreet);
			gbStreetElement.isDisplayed();
			gbStreetElement.clear();
			gbStreetElement.sendKeys(AmendData);	
			WebElement emailAddCorpElement = driver.findElement(customerPageUI.emailAddCorp);
			WebElement mobileNumberCorpElement = driver.findElement(customerPageUI.mobileNumberCorp);
			emailAddCorpElement.isDisplayed();
			emailAddCorpElement.sendKeys(emailAddData);
			mobileNumberCorpElement.sendKeys(mobileNumberData);
			Thread.sleep(500);
			WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
			commitDealElement.click();
			Thread.sleep(500);
			WebElement transactionIdCorpAmendElement2 = driver.findElement(customerPageUI.transactionIdCorpAmend);
			transactionIdCorpAmendElement2.isDisplayed();
			transactionIdCorpAmendElement2.sendKeys(customerTest013DataTest);
			WebElement viewTransactionElement = driver.findElement(customerPageUI.viewTransaction);
			viewTransactionElement.isDisplayed();
			viewTransactionElement.click();	
			WebElement gbStreetAfterAmendElement = driver.findElement(customerPageUI.gbStreetAfterAmend);
			gbStreetAfterAmendElement.isDisplayed();
			System.out.println(gbStreetAfterAmendElement.getText());
			Assert.assertEquals(AmendData,gbStreetAfterAmendElement.getText());
		}	
public void customerTest014AndVerify(String relCodeData, String relCustomerData,String emailAddData,String mobileNumberData, String customerTest014DataTest) throws Exception  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest014DataTest);
			WebElement editTransactionCorpElement = driver.findElement(customerPageUI.editTransaction);
			editTransactionCorpElement.click();
			Thread.sleep(500);
			WebElement relCodeCorpAmendElement = driver.findElement(customerPageUI.relCodeCorpAmend);
			relCodeCorpAmendElement.isDisplayed();
			relCodeCorpAmendElement.clear();
			relCodeCorpAmendElement.sendKeys(relCodeData);	
			Thread.sleep(1500);
			WebElement relCustomerCorpAmendElement = driver.findElement(customerPageUI.relCustomerCorpAmend);
			relCustomerCorpAmendElement.isDisplayed();
			relCustomerCorpAmendElement.clear();
			relCustomerCorpAmendElement.sendKeys(relCustomerData);	
			WebElement emailAddCorpElement = driver.findElement(customerPageUI.emailAddCorp);
			WebElement mobileNumberCorpElement = driver.findElement(customerPageUI.mobileNumberCorp);
			emailAddCorpElement.isDisplayed();
			emailAddCorpElement.sendKeys(emailAddData);
			mobileNumberCorpElement.sendKeys(mobileNumberData);	
			Thread.sleep(500);
			WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
			commitDealElement.click();
			Thread.sleep(500);
			WebElement transactionIdCorpAmendElement2 = driver.findElement(customerPageUI.transactionIdCorpAmend);
			transactionIdCorpAmendElement2.isDisplayed();
			transactionIdCorpAmendElement2.sendKeys(customerTest014DataTest);
			WebElement viewTransactionElement = driver.findElement(customerPageUI.viewTransaction);
			viewTransactionElement.isDisplayed();
			viewTransactionElement.click();			
			WebElement relCustomerAfterAmendElement = driver.findElement(customerPageUI.relCustomerAfterAmend);
			relCustomerAfterAmendElement.isDisplayed();
			Assert.assertEquals(relCustomerData,relCustomerAfterAmendElement.getText());
		}
		
public String customerTest015Verify(String customerDataTest015) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement cusRalInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.cusRalInput));
			cusRalInputElement.isDisplayed();
			cusRalInputElement.clear();
			cusRalInputElement.sendKeys(customerDataTest015);
			WebElement cusRalFindElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.cusRalFind));
			cusRalFindElement.isDisplayed();
			cusRalFindElement.click();
			WebElement enqDataElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.enqData));
			enqDataElement.isDisplayed();
			System.out.println(enqDataElement.getText());
			return enqDataElement.getText();
		}
		public String customerTest016Verify() {
			WebElement newDealElement = driver.findElement(customerPageUI.newDeal);
			newDealElement.isDisplayed();
			newDealElement.click();
			WebElement mesBoxtElement = driver.findElement(customerPageUI.mesBox);
			mesBoxtElement.isDisplayed();
			String cutMesBoxtElement = mesBoxtElement.getText().substring(0,48);
			return cutMesBoxtElement;
		}

		public String customerTest017Verify(String customerTest017DataTest) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement editTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));		
			WebElement transactionIDElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdAmendSF));		
			transactionIDElement.isDisplayed();
			transactionIDElement.sendKeys(customerTest017DataTest);
			editTransactionElement.isDisplayed();
		    editTransactionElement.click();
			WebElement mesBoxtElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mesBox));
			mesBoxtElement.isDisplayed();
			return mesBoxtElement.getText();
		}
		
		public void customerTest018AndVerify(String customerTest018DataTest, String gbFullNameDataTest, String gbShortNameDataTest,String emailAddData,String mobileNumberData) throws Exception  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest018DataTest);
			WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
			editTransactionCorpElement.click();
			Thread.sleep(500);
			WebElement gbFullNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.gbFullName));
			gbFullNameElement.isDisplayed();
			gbFullNameElement.clear();
			gbFullNameElement.sendKeys(gbFullNameDataTest);
			WebElement gbShortNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.gbShortName));
			gbShortNameElement.isDisplayed();
			gbShortNameElement.clear();
			gbShortNameElement.sendKeys(gbShortNameDataTest);
			WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
			WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
			emailAddCorpElement.isDisplayed();
			emailAddCorpElement.sendKeys(emailAddData);
			mobileNumberCorpElement.sendKeys(mobileNumberData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			Thread.sleep(1000);
		}
		
		public void customerTest019AndVerify(String customerTest019DataTest,String contactName2Data, String officeNumber2Data, String mobileNumberCorp2Data, String emailAddData,String mobileNumberData) throws Exception  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest019DataTest);
			WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
			editTransactionCorpElement.click();
			Thread.sleep(500);
			WebElement contactNameExpandElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactNameExpand));
			contactNameExpandElement.isDisplayed();
			contactNameExpandElement.click();
			WebElement contactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName2));
			contactNameExpandElement.isDisplayed();
			contactName2Element.sendKeys(contactName2Data);
            WebElement dropDownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson2));
            Select dropDown = new Select(dropDownElement);
            dropDown.selectByVisibleText("Director");
            WebElement officeNumber2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.officeNumber2));
            officeNumber2Element.isDisplayed();
            officeNumber2Element.sendKeys(officeNumber2Data);
            WebElement mobileNumberCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp2));
            mobileNumberCorp2Element.isDisplayed();
            mobileNumberCorp2Element.sendKeys(mobileNumberCorp2Data);
            WebElement emailAddCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp2));
            emailAddCorp2Element.isDisplayed();
            emailAddCorp2Element.sendKeys(mobileNumberCorp2Data);
            			
			WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
			WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
			emailAddCorpElement.isDisplayed();
			emailAddCorpElement.sendKeys(emailAddData);
			mobileNumberCorpElement.sendKeys(mobileNumberData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			Thread.sleep(1000);
			
		}	
		
public void customerTest020AndVerify(String customerTest020DataTest,String contactName2Data, String officeNumber2Data, String mobileNumberCorp2Data, String emailAddData,String mobileNumberData) throws Exception  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest020DataTest);
			WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
			editTransactionCorpElement.click();
			Thread.sleep(500);         			
			WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
			WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
			emailAddCorpElement.isDisplayed();
			emailAddCorpElement.sendKeys(emailAddData);
			mobileNumberCorpElement.sendKeys(mobileNumberData);
			WebElement contactNameCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName));
			contactNameCorpElement.clear();
			mobileNumberCorpElement.sendKeys(mobileNumberData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			Thread.sleep(1000);	
			WebElement errorMesBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.errorMesBox));
			System.out.println(errorMesBoxElement.getText());
			String dataContactName = "Contact Name.1 INPUT MISSING";
			Assert.assertEquals(dataContactName,errorMesBoxElement.getText());
		}
		
public void customerTest021AndVerify(String customerTest021DataTest,String contactNameAmend, String emailAddData,String mobileNumberData) throws Exception  {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
	transactionIdCorpAmendElement.isDisplayed();
	transactionIdCorpAmendElement.sendKeys(customerTest021DataTest);
	WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
	editTransactionCorpElement.click();
	Thread.sleep(500);
	WebElement editcontactNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName));
	editcontactNameElement.isDisplayed();
	editcontactNameElement.clear();
	editcontactNameElement.sendKeys(contactNameAmend);
	WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
	WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
	emailAddCorpElement.isDisplayed();
	emailAddCorpElement.sendKeys(emailAddData);
	mobileNumberCorpElement.sendKeys(mobileNumberData);
	WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	commitDealElement.click();
	Thread.sleep(500);
}	
public void customerTest023AndVerify(String customerTest023DataTest,String contactName2Data, String officeNumber2Data, String mobileNumberCorp2Data, String emailAddData,String mobileNumberData) throws Exception  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest023DataTest);
			WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
			editTransactionCorpElement.click();
			Thread.sleep(500);
			WebElement contactNameExpandElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactNameExpand));
			contactNameExpandElement.isDisplayed();
			contactNameExpandElement.click();
			WebElement contactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName2));
			contactNameExpandElement.isDisplayed();
			contactName2Element.sendKeys(contactName2Data);
            WebElement dropDownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson2));
            Select dropDown = new Select(dropDownElement);
            dropDown.selectByVisibleText("Chief Accountant");
            WebElement officeNumber2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.officeNumber2));
            officeNumber2Element.isDisplayed();
            officeNumber2Element.sendKeys(officeNumber2Data);
            WebElement mobileNumberCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp2));
            mobileNumberCorp2Element.isDisplayed();
            mobileNumberCorp2Element.sendKeys(mobileNumberCorp2Data);
            WebElement emailAddCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp2));
            emailAddCorp2Element.isDisplayed();
            emailAddCorp2Element.sendKeys(mobileNumberCorp2Data);           			
			WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
			WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
			emailAddCorpElement.isDisplayed();
			emailAddCorpElement.sendKeys(emailAddData);
			mobileNumberCorpElement.sendKeys(mobileNumberData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			Thread.sleep(1000);			
		}

public void customerTest022AndVerify(String customerTest022DataTest,String contactName2Data, String officeNumber2Data, String mobileNumberCorp2Data, String emailAddData,String mobileNumberData) throws Exception  {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
	transactionIdCorpAmendElement.isDisplayed();
	transactionIdCorpAmendElement.sendKeys(customerTest022DataTest);
	WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
	editTransactionCorpElement.click();
	Thread.sleep(500);
	WebElement contactNameExpandElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactNameExpand));
	contactNameExpandElement.isDisplayed();
	contactNameExpandElement.click();
	WebElement contactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName2));
	contactNameExpandElement.isDisplayed();
	contactName2Element.sendKeys(contactName2Data);
    WebElement dropDownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson2));
    Select dropDown = new Select(dropDownElement);
    dropDown.selectByVisibleText("Chief Accountant");
    WebElement officeNumber2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.officeNumber2));
    officeNumber2Element.isDisplayed();
    officeNumber2Element.sendKeys(officeNumber2Data);
    WebElement mobileNumberCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp2));
    mobileNumberCorp2Element.isDisplayed();
    mobileNumberCorp2Element.sendKeys(mobileNumberCorp2Data);
    WebElement emailAddCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp2));
    emailAddCorp2Element.isDisplayed();
    emailAddCorp2Element.sendKeys(mobileNumberCorp2Data);           			
	WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
	WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
	emailAddCorpElement.isDisplayed();
	emailAddCorpElement.sendKeys(emailAddData);
	mobileNumberCorpElement.sendKeys(mobileNumberData);
	WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	commitDealElement.click();
	Thread.sleep(1000);			
}	
		
public void customerTest024AndVerify(String customerTest024DataTest,String contactName2Data, String officeNumber2Data, String mobileNumberCorp2Data, String emailAddData,String mobileNumberData) throws Exception  {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
	transactionIdCorpAmendElement.isDisplayed();
	transactionIdCorpAmendElement.sendKeys(customerTest024DataTest);
	WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
	editTransactionCorpElement.click();
	Thread.sleep(500);
	WebElement contactNameExpandElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactNameExpand));
	contactNameExpandElement.isDisplayed();
	contactNameExpandElement.click();
	WebElement contactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName2));
	contactNameExpandElement.isDisplayed();
	contactName2Element.sendKeys(contactName2Data);
    WebElement dropDownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson2));
    Select dropDown = new Select(dropDownElement);
    dropDown.selectByVisibleText("Legal Reprensentative");
    WebElement officeNumber2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.officeNumber2));
    officeNumber2Element.isDisplayed();
    officeNumber2Element.sendKeys(officeNumber2Data);
    WebElement mobileNumberCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp2));
    mobileNumberCorp2Element.isDisplayed();
    mobileNumberCorp2Element.sendKeys(mobileNumberCorp2Data);
    WebElement emailAddCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp2));
    emailAddCorp2Element.isDisplayed();
    emailAddCorp2Element.sendKeys(mobileNumberCorp2Data);           			
	WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
	WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
	emailAddCorpElement.isDisplayed();
	emailAddCorpElement.sendKeys(emailAddData);
	mobileNumberCorpElement.sendKeys(mobileNumberData);
	WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	commitDealElement.click();
	Thread.sleep(1000);			
}	
public void customerTest025AndVerify(String customerTest025DataTest,String contactNameAmend, String emailAddData,String mobileNumberData) throws Exception  {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
	transactionIdCorpAmendElement.isDisplayed();
	transactionIdCorpAmendElement.sendKeys(customerTest025DataTest);
	WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
	editTransactionCorpElement.click();
	Thread.sleep(500);
	WebElement editcontactNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName));
	editcontactNameElement.isDisplayed();
	editcontactNameElement.clear();
	editcontactNameElement.sendKeys(contactNameAmend);
	WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
	WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
	emailAddCorpElement.isDisplayed();
	emailAddCorpElement.sendKeys(emailAddData);
	mobileNumberCorpElement.sendKeys(mobileNumberData);
	WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	commitDealElement.click();
	Thread.sleep(500);
}	

public void customerTest026AndVerify(String customerTest026DataTest,String emailAddData1,String emailAddData2,String emailAddData3,String emailAddData4,String NumberData,String contactName2Data
		,String contactName3Data,String contactName4Data) throws Exception  {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
	transactionIdCorpAmendElement.isDisplayed();
	transactionIdCorpAmendElement.sendKeys(customerTest026DataTest);
	WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
	editTransactionCorpElement.click();
	Thread.sleep(500);
	
	WebElement expandContactName1Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactNameExpand));
	expandContactName1Element.isDisplayed();
	expandContactName1Element.click();
	WebElement expandContactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactNameExpand2));
	expandContactName2Element.isDisplayed();
	expandContactName2Element.click();
	WebElement expandContactName3Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactNameExpand3));
	expandContactName3Element.isDisplayed();
	expandContactName3Element.click();
	
	WebElement contactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName2));
	contactName2Element.sendKeys(contactName2Data);
	WebElement contactName3Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName3));
	contactName3Element.isDisplayed();
	contactName3Element.sendKeys(contactName3Data);
	WebElement contactName4Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.contactName4));
	contactName4Element.isDisplayed();
	contactName4Element.sendKeys(contactName4Data);
	
	WebElement officeNumber2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.officeNumber2));
	officeNumber2Element.sendKeys(NumberData);
	WebElement officeNumber3Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.officeNumber3));
	officeNumber3Element.sendKeys(NumberData);
	WebElement officeNumber4Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.officeNumber4));
	officeNumber4Element.sendKeys(NumberData);
	
	WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
	mobileNumberCorpElement.sendKeys(NumberData);
	WebElement mobileNumber2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp2));
	mobileNumber2Element.sendKeys(NumberData);
	WebElement mobileNumber3Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp3));
	mobileNumber3Element.sendKeys(NumberData);
	WebElement mobileNumber4Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp4));
	mobileNumber4Element.sendKeys(NumberData);
	
	WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
	emailAddCorpElement.sendKeys(emailAddData1);
	WebElement emailAddCorp2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp2));
	emailAddCorp2Element.sendKeys(emailAddData2);
	WebElement emailAddCorp3Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp3));
	emailAddCorp3Element.sendKeys(emailAddData3);
	WebElement emailAddCorp4Element = wait
			.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp4));
	emailAddCorp4Element.sendKeys(emailAddData4);

	WebElement dropDown1Element = wait
			.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson1));
	Select dropDown1 = new Select(dropDown1Element);
	dropDown1.selectByVisibleText("Director");

	WebElement dropDown2Element = wait
			.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson2));
	Select dropDown2 = new Select(dropDown2Element);
	dropDown2.selectByVisibleText("Director");

	WebElement dropDown3Element = wait
			.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson3));
	Select dropDown3 = new Select(dropDown3Element);
	dropDown3.selectByVisibleText("Chief Accountant");

	WebElement dropDown4Element = wait
			.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson4));
	Select dropDown4 = new Select(dropDown4Element);
	dropDown4.selectByVisibleText("Contact Person");

	WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	commitDealElement.click();
	Thread.sleep(500);
	
	WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
	transactionIdCorpElement.isDisplayed();
	transactionIdCorpElement.sendKeys(customerTest026DataTest);
	WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
	viewTransactionElement.click();
	Thread.sleep(999);

}	

public void customerTest028AndVerify(String customerTest028DataTest,String sectorAmend, String emailAddData,String mobileNumberData) throws Exception  {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement transactionIdCorpAmendElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
	transactionIdCorpAmendElement.isDisplayed();
	transactionIdCorpAmendElement.sendKeys(customerTest028DataTest);
	WebElement editTransactionCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.editTransaction));
	editTransactionCorpElement.click();
	Thread.sleep(500);
	WebElement editSectorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.sector));
	editSectorElement.clear();
	editSectorElement.sendKeys(sectorAmend);
	WebElement emailAddCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.emailAddCorp));
	WebElement mobileNumberCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.mobileNumberCorp));
	emailAddCorpElement.isDisplayed();
	emailAddCorpElement.sendKeys(emailAddData);
	mobileNumberCorpElement.sendKeys(mobileNumberData);
	WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	commitDealElement.click();
	Thread.sleep(1000);
	}	
}