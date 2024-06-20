
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

		WebElement validateDealCorp010Element = driver.findElement(customerPageUI.validateDeal);
		validateDealCorp010Element.click();
	}
	

	public void authoriseCustomerCorp(String authoriseCustomerData) throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin("LINHDQ.2", "Anbinh$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
		WebElement transactionIdCorpElement = driver.findElement(customerPageUI.transactionIdCorp);
		transactionIdCorpElement.isDisplayed();
		transactionIdCorpElement.sendKeys(authoriseCustomerData);
		WebElement performContractElement = driver.findElement(customerPageUI.performContract);
		performContractElement.isDisplayed();
		performContractElement.click();
		Thread.sleep(800);
		WebElement authoriseDealElement = driver.findElement(customerPageUI.authoriseDeal);
		authoriseDealElement.isDisplayed();
		authoriseDealElement.click();
		WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
		getCifCorpElement.isDisplayed();
	}
	
	//Verify Case 010
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
			WebElement transactionIdCorpAmendElement = driver.findElement(customerPageUI.transactionIdCorpAmend);
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest014DataTest);
			WebElement editTransactionCorpElement = driver.findElement(customerPageUI.editTransaction);
			editTransactionCorpElement.click();
			Thread.sleep(500);
			WebElement relCodeCorpAmendElement = driver.findElement(customerPageUI.relCodeCorpAmend);
			relCodeCorpAmendElement.isDisplayed();
			relCodeCorpAmendElement.clear();
			relCodeCorpAmendElement.sendKeys(relCodeData);	
			Thread.sleep(500);
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
			WebElement cusRalInputElement = driver.findElement(customerPageUI.cusRalInput);
			cusRalInputElement.isDisplayed();
			cusRalInputElement.clear();
			cusRalInputElement.sendKeys(customerDataTest015);
			WebElement cusRalFindElement = driver.findElement(customerPageUI.cusRalFind);
			cusRalFindElement.isDisplayed();
			cusRalFindElement.click();
			WebElement respondEnqElement = driver.findElement(customerPageUI.respondEnq);
			respondEnqElement.isDisplayed();
			WebElement enqDataElement = driver.findElement(customerPageUI.enqData);
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
			String cutMesBoxtElement = mesBoxtElement.getText();
			String afterCutMesBoxtElement = cutMesBoxtElement.substring(0,48);
			System.out.println(afterCutMesBoxtElement);
			return afterCutMesBoxtElement;
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
		
		public void customerTest018AndVerify(String customerTest018DataTest) throws Exception  {
			WebElement transactionIdCorpAmendElement = driver.findElement(customerPageUI.transactionIdCorpAmend);
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest018DataTest);
			WebElement editTransactionCorpElement = driver.findElement(customerPageUI.editTransaction);
			editTransactionCorpElement.click();
			Thread.sleep(500);
			WebElement relCodeCorpAmendElement = driver.findElement(customerPageUI.relCodeCorpAmend);
			relCodeCorpAmendElement.isDisplayed();
			relCodeCorpAmendElement.clear();
			relCodeCorpAmendElement.sendKeys(relCodeData);	
			Thread.sleep(500);
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
		

				
public void customerTest015AndVerifyIndep(String relCodeData, String relCustomerData, String emailAddData,
			String mobileNumberData, String customerTest014DataTest) throws Exception {
			WebElement transactionIdCorpAmendElement = driver.findElement(customerPageUI.transactionIdCorpAmend);
			transactionIdCorpAmendElement.isDisplayed();
			transactionIdCorpAmendElement.sendKeys(customerTest014DataTest);
			WebElement editTransactionCorpElement = driver.findElement(customerPageUI.editTransaction);
			editTransactionCorpElement.click();
			Thread.sleep(500);
			WebElement relCodeCorpAmendElement = driver.findElement(customerPageUI.relCodeCorpAmend);
			relCodeCorpAmendElement.isDisplayed();
			relCodeCorpAmendElement.clear();
			relCodeCorpAmendElement.sendKeys(relCodeData);
			Thread.sleep(500);
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
			Assert.assertEquals(relCustomerData, relCustomerAfterAmendElement.getText());
		}


	}