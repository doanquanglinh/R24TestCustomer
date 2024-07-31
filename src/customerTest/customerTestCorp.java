package customerTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Base.RanDomStringInt;
import Base.employeeID;
import Base.randomString;
import Page.SignInPage;
import Page.customerPageCorp;
import Page.customerPageUI;
import Base.SwitchWindow;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class customerTestCorp extends BaseSetup {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPageCorp customerPageCorp;
	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
	}	
	@Test
public void customerTest010() throws Exception{
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 010", "CONG TY DATA TEST CASE 010", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
				"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
				customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
		customerPageCorp.customerTest010Verify();
		driver.close();
	}
@Test
public void customerTest011() throws Exception{
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
	   	signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 011", "CONG TY DATA TEST CASE 011", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
				"20301010", "20311010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
				customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
		String expectedMessageCustomer011 = "Issued Date.1 Cannot be Greater than or Equal to Today";
		Assert.assertEquals(expectedMessageCustomer011,customerPageCorp.customerTest011Verify());
		driver.close();
	}
@Test
public void customerTest012() throws Exception{
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 012", "CONG TY DATA TEST CASE 012", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
				"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
				customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
				WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
				commitDealElement.click();
				WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
				getCifCorpElement.isDisplayed();
			    String cifText = getCifCorpElement.getText();
			    String afterCutCifCorpStringTC012 = cifText.substring(14, 22);
			    System.out.println(afterCutCifCorpStringTC012);
			    driver.close();		
			    signInPage.closeAfterMethod();
				SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
				signInPage.SwitchFrame1();
				signInPage.CMD("CUSTOMER,VMB.CORP.SMART D "+ afterCutCifCorpStringTC012);
				SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
				WebElement deleteDealElement = driver.findElement(customerPageUI.deleteDeal);
				deleteDealElement.isDisplayed();
				deleteDealElement.click();
				Alert alert = driver.switchTo().alert();
				alert.accept();
				driver.close();	
				SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
				signInPage.SwitchFrame1();
				signInPage.CMD("CUSTOMER,VMB.CORP.SMART D "+ afterCutCifCorpStringTC012);
				String expectedMessageCustomer012 = "UNAUTH. RECORD MISSING";
				SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
				customerPageCorp.customerTest012Verify(afterCutCifCorpStringTC012);
				Assert.assertEquals(expectedMessageCustomer012,customerPageCorp.customerTest012Verify(afterCutCifCorpStringTC012));
				driver.close();
}	
@Test
public void customerTest013() throws Exception{
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY TEST CASE 013", "TEST CASE 013", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
				"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
				customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
				WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
				commitDealElement.click();
				WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
				getCifCorpElement.isDisplayed();
			    String cifText = getCifCorpElement.getText();
			    String afterCutCifCorpString = cifText.substring(14, 22);
				System.out.println(afterCutCifCorpString);
				driver.close();
				SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
				signInPage.SwitchFrame1();
				signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
				SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
				customerPageCorp.customerTest013AndVerify("PEAK VIEW, 36 HOANG CAU","linhdq@abbank.vn",RanDomStringInt.genRandom(),afterCutCifCorpString);
				driver.close();
	}	
@Test
public void customerTest014() throws Exception{
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
    driver.navigate().refresh();
    signInPage = new SignInPage(driver);
    customerPageCorp = new customerPageCorp(driver);
    signInPage.signin("LINHDQ.1", "Abb$1234");
    signInPage.SwitchFrame1();
    signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
    SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
    List<String> inputCustomerCorpData = Arrays.asList("DATA TEST CASE 014", "TC 014", "CO NHUE, HA NOI", "CO NHUE",
            "CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
            "20201010", "20301010", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
            "999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
    customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
    WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
    commitDealElement.click();
    WebElement getCifCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
    getCifCorpElement.isDisplayed();
    String cifText = getCifCorpElement.getText().substring(14, 22);
    System.out.println(cifText);
    driver.close();
    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
    driver.close();
    signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
	List<String> inputCustomerCorpData2 = Arrays.asList("CONG TY TEST CASE 014", "TEST CASE 014", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData2);
			WebElement commitDealElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement2.click();
			WebElement getCifCorpElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement2.isDisplayed();
		    String cifText2 = getCifCorpElement2.getText().substring(14, 22);
			driver.close();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
			signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			System.out.println(cifText2);
			customerPageCorp.customerTest014AndVerify("9",cifText,"linhdq@abbank.vn",RanDomStringInt.genRandom(),cifText2);		
			driver.close();
}	
@Test
public void customerTest015() throws Exception{
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
    signInPage = new SignInPage(driver);
    customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
    signInPage.signin("LINHDQ.1", "Abb$1234");
    signInPage.SwitchFrame1();
    signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
    SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
    List<String> inputCustomerCorpData = Arrays.asList("DATA TEST CASE 015", "TC 015", "CO NHUE, HA NOI", "CO NHUE",
            "CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
            "20201010", "20301010", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
            "999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
    customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
    WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
    commitDealElement.click();
    WebElement getCifCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
    getCifCorpElement.isDisplayed();
    String cifText = getCifCorpElement.getText().substring(14, 22);
    System.out.println(cifText);
    driver.close();
    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
    driver.close();
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
	List<String> inputCustomerCorpData2 = Arrays.asList("CONG TY TEST CASE 015", "TEST CASE 015", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData2);
			WebElement commitDealElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement2.click();
			WebElement getCifCorpElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement2.isDisplayed();
		    String cifText2 = getCifCorpElement2.getText().substring(14, 22);
			driver.close();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
			signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			System.out.println(cifText2);
			customerPageCorp.customerTest014AndVerify("9",cifText,"linhdq@abbank.vn",RanDomStringInt.genRandom(),cifText2);	
			driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText2); 
		    driver.close();
			signInPage.closeAfterMethod();
		    SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("ENQ VMB.CUS.RELATION");
	String targetTitle = "Customer Ralationship";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	customerPageCorp.customerTest015Verify(cifText2);
	String expectedMessageCustomer015 = cifText2 +" TEST CASE 015 9 CHU SO HUU "+cifText+" TC 015 99 DONG CHU SO HUU";
	Assert.assertEquals(expectedMessageCustomer015,customerPageCorp.customerTest015Verify(cifText2));
	driver.close();
}
@Test
public void customerTest016() throws Exception{
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.INDIV.SF");
	SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
	String expectedMessageCustomer016 = "Vui long thuc hien chuc nang nay tren SmartForm.";
	customerPageCorp.customerTest016Verify();
	Assert.assertEquals(expectedMessageCustomer016,customerPageCorp.customerTest016Verify());
	driver.close();
}
@Test
public void customerTest017() throws Exception{
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.INDIV.AMEND.SF");
	SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
	String expectedMessageCustomer017 = "Vui long thuc hien chuc nang nay tren SmartForm.12345678";
	customerPageCorp.customerTest017Verify("12345678");
	Assert.assertEquals(expectedMessageCustomer017,customerPageCorp.customerTest017Verify("12345678"));
	driver.close();
}
@Test
public void customerTest018() throws Exception{
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 018", "TEST CASE 018", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
			commitDealElement.click();
			WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
			signInPage.closeAfterMethod();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
		    driver.close();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			String gbFullNameAfterAmned = "CONG TY DATA TEST CASE 018 AFTER AMEND";
			String gbShortNameAfterAmned = "TEST CASE 018 AFTER AMEND";
			customerPageCorp.customerTest018AndVerify(cifText,gbFullNameAfterAmned,gbShortNameAfterAmned,"linhdq@abbank.vn",RanDomStringInt.genRandom());
			driver.close();
			customerPageCorp.authoriseCustomerCorp("LINHDQ.1",cifText);
			WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorp));
			transactionIdCorpElement.sendKeys(cifText);
			WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
			viewTransactionElement.click();
			WebElement viewgbFullNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.gbFullNameAmend));
			WebElement viewgbShortNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.gbShortNameAmend));
			System.out.println(viewgbFullNameElement.getText());
			System.out.println(viewgbShortNameElement.getText());
			Assert.assertEquals(gbFullNameAfterAmned,viewgbFullNameElement.getText());
			Assert.assertEquals(gbShortNameAfterAmned,viewgbShortNameElement.getText());
			driver.close();
}
@Test
public void customerTest019() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 019", "TEST CASE 019", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText();
		    String afterCutCifCorpString = cifText.substring(14, 22);
		    System.out.println(afterCutCifCorpString);
		    driver.close();
			signInPage.closeAfterMethod();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",afterCutCifCorpString);  
		    driver.close();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest019AndVerify(afterCutCifCorpString,"MR LINH DOAN 2",RanDomStringInt.genRandom(),RanDomStringInt.genRandom(),"linhdq@abbank.vn",RanDomStringInt.genRandom());
			driver.close();
			customerPageCorp.authoriseCustomerCorp("LINHDQ.1",afterCutCifCorpString);
			WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorp));
			transactionIdCorpElement.sendKeys(afterCutCifCorpString);
			WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
			viewTransactionElement.click();
			WebElement viewContactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewContactName2));
			WebElement viewRelatedPerson2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewRelatedPerson2));
			String dataContactName2 = "MR LINH DOAN 2";
			String dataRelatedPerson2 = "Director";
			Assert.assertEquals(dataContactName2, viewContactName2Element.getText());
			Assert.assertEquals(dataRelatedPerson2, viewRelatedPerson2Element.getText());
			driver.close();
			//TRONG TEST CASE: VERSION INPUT LÀ SỬA KHCN NHƯNG MÀN HÌNH NHẬP LẠI LÀ KHDN ???
}
@Test
public void customerTest020() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 020", "TEST CASE 020", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();	
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");	
			customerPageCorp.customerTest020AndVerify(cifText,"MR LINH DOAN CA",RanDomStringInt.genRandom(),RanDomStringInt.genRandom(),"linhdq@abbank.vn",RanDomStringInt.genRandom());
			driver.close();
}
@Test
public void customerTest021() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 021", "TEST CASE 021", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest021AndVerify(cifText,"MR LINH DOAN AMEND","linhdq@abbank.vn",RanDomStringInt.genRandom());
			WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpElement.sendKeys(cifText);
			WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
			viewTransactionElement.click();
			WebElement viewContactNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewContactName2TC021));
			viewContactNameElement.isDisplayed();
			Assert.assertEquals("MR LINH DOAN AMEND", viewContactNameElement.getText());	
			driver.close();
}
@Test
public void customerTest022() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 022", "TEST CASE 022", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest022AndVerify(cifText,"MR LINH DOAN CA",RanDomStringInt.genRandom(),RanDomStringInt.genRandom(),"linhdq@abbank.vn",RanDomStringInt.genRandom());  		 
			WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpElement.sendKeys(cifText);
			WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
			viewTransactionElement.click();
			WebElement viewContactNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewContactName2TC022));
			viewContactNameElement.isDisplayed();
			Assert.assertEquals("MR LINH DOAN CA", viewContactNameElement.getText());	
}
@Test 
public void customerTest023() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 023", "TEST CASE 023", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText();
		    String afterCutCifCorpString = cifText.substring(14, 22);
		    System.out.println(afterCutCifCorpString);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",afterCutCifCorpString);  
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest023AndVerify(afterCutCifCorpString,"MR LINH DOAN CA",RanDomStringInt.genRandom(),RanDomStringInt.genRandom(),"linhdq@abbank.vn",RanDomStringInt.genRandom());
			driver.close();
			Thread.sleep(1500);
			customerPageCorp.authoriseCustomerCorp("LINHDQ.1",afterCutCifCorpString);
			WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorp));
			transactionIdCorpElement.sendKeys(afterCutCifCorpString);
			WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
			viewTransactionElement.click();
			WebElement viewContactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewContactName2TC023));
			WebElement viewRelatedPerson2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewRelatedPerson2TC023));
			String dataContactName2 = "MR LINH DOAN CA";
			String dataRelatedPerson2 = "Chief Accountant";
			Assert.assertEquals(dataContactName2, viewContactName2Element.getText());
			Assert.assertEquals(dataRelatedPerson2, viewRelatedPerson2Element.getText());
			driver.close();		  		 
}
@Test
public void customerTest024() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 024", "TEST CASE 024", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest024AndVerify(cifText,"MR LINH DOAN LR",RanDomStringInt.genRandom(),RanDomStringInt.genRandom(),"linhdq@abbank.vn",RanDomStringInt.genRandom());  		 
			WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpElement.sendKeys(cifText);
			WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
			viewTransactionElement.click();
			WebElement viewContactName2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewContactName2TC024));
			WebElement viewRelatedPerson2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewRelatedPerson2TC024));
			String dataContactName2 = "MR LINH DOAN LR";
			String dataRelatedPerson2 = "Legal Reprensentative";
			Assert.assertEquals(dataContactName2, viewContactName2Element.getText());
			Assert.assertEquals(dataRelatedPerson2, viewRelatedPerson2Element.getText());
			driver.close();	
}
@Test
public void customerTest025() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 025", "TEST CASE 025", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN LA BEFORE UPDATE", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
		    WebElement dropDownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.relatedPerson1));
		    Select dropDown = new Select(dropDownElement);
		    dropDown.selectByVisibleText("Legal Reprensentative");
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
		    driver.close();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest025AndVerify(cifText,"MR LINH DOAN LA AFTER UPDATE","linhdq@abbank.vn",RanDomStringInt.genRandom());
			driver.close();
			customerPageCorp.authoriseCustomerCorpAmendVersion("LINHDQ.1",cifText);  
			WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorpAmend));
			transactionIdCorpElement.sendKeys(cifText);
			WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
			viewTransactionElement.click();
			WebElement viewContactNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewContactName2TC021));
			viewContactNameElement.isDisplayed();
			String dataRelatedPerson = "Legal Reprensentative";
			WebElement viewRelatedPersonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewRelatedPerson2TC025));
			System.out.println(viewRelatedPersonElement.getText());
			Assert.assertEquals(dataRelatedPerson, viewRelatedPersonElement.getText());
			Assert.assertEquals("MR LINH DOAN LA AFTER UPDATE", viewContactNameElement.getText());	
			driver.close();
}

@Test
public void customerTest026() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 026", "TEST CASE 026", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN DIRECTOR", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
		    driver.close();   
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
		    signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest026AndVerify(cifText, "linhdq@abbank.vn","anhch@abbank.vn","thuannt@abbank.vn","thuyntt@abbank.vn", RanDomStringInt.genRandom(),"MS HUONG ANH","MS THUAN NGUYEN","MS THU THUY");
			WebElement viewContactNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewContactName4TC026));
			viewContactNameElement.isDisplayed();
			WebElement viewRelatedPersonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewRelatedPerson4TC026));
			
			System.out.println(viewContactNameElement.getText());
			System.out.println(viewRelatedPersonElement.getText());
			Assert.assertEquals("Contact Person", viewRelatedPersonElement.getText());
			Assert.assertEquals("MS THU THUY", viewContactNameElement.getText());	
			driver.close();
}
@Test
public void customerTest027() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 027", "TEST CASE 027", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN DIRECTOR", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);  
		    driver.close();   
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
		    signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest027AndVerify(cifText, "linhdq@abbank.vn","anhch@abbank.vn","thuannt@abbank.vn","thuyntt@abbank.vn", RanDomStringInt.genRandom(),"MS HUONG ANH","MS THUAN NGUYEN","MS THU THUY");
			driver.close();
}

@Test
public void customerTest028() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 028", "TEST CASE 028", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest028AndVerify(cifText,"2401","linhdq@abbank.vn",RanDomStringInt.genRandom());
			driver.close();
			customerPageCorp.authoriseCustomerCorp("LINHDQ.1",cifText);
			WebElement transactionIdCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.transactionIdCorp));
			transactionIdCorpElement.sendKeys(cifText);
			WebElement viewTransactionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
			viewTransactionElement.click();
			WebElement viewSectorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewSector));
			System.out.println(viewSectorElement.getText());
			Assert.assertEquals("2401",viewSectorElement.getText());
			driver.close();
}
@Test
public void customerTest029() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	String SHORTNAME = randomString.randomStringChar(10);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA LINHDQ TEST CASE 029",SHORTNAME, "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			System.out.println(SHORTNAME);
		    driver.close();
			signInPage.closeAfterMethod();
			customerPageCorp.customerTest029AndVerify(SHORTNAME,"VN-001-0001	");

}


@Test
public void customerTest031() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 031", "TEST CASE 031", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.AMEND.REL.PRIOCUS");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest031AndVerify(cifText,"VN0010002.PRI1","VN0010002","LINHDQ.1");
			driver.close();
}
@Test
public void customerTest032() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 032", "TEST CASE 032", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
			"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "1499", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
			commitDealElement.click();
			WebElement getCifCorpElement= wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText().substring(14, 22);
		    System.out.println(cifText);
		    driver.close();
		    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",cifText);
		    driver.close();
			signInPage.closeAfterMethod();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		    signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.AMEND.TARGET");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest032AndVerify(cifText,"VN0010002.PRI1","LINHDQ.1");
			driver.close();
}
@Test
public void customerTest033() throws Exception{
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.closeAfterMethod();
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Abb$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("ABB.CUSTOMER.UUTIEN,INPUT");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	String employeeIDTest = employeeID.generateRandomEmployeeID();
	customerPageCorp.customerTest033AndVerify(employeeIDTest,"LINHDQ01",employeeIDTest);
	driver.close();
	}
}
