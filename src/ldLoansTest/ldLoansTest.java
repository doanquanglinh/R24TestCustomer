package ldLoansTest;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Base.Date;
import Base.RanDomStringInt;
import Page.LimitPage;
import Page.SignInPage;
import Page.customerPageCorp;
import Page.customerPageUI;
import Page.ldLoansPage;
import Base.SwitchWindow;


public class ldLoansTest extends BaseSetup {

	private WebDriver driver;
	public SignInPage signInPage;
	public ldLoansPage ldLoansPage;
	public LimitPage LimitPage;
	public customerPageCorp customerPageCorp;

	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
	}
	@Test(priority = 1)
	public String preDataTestLD014_015() throws Exception {
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
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE LD", "DATA TEST LD", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
				"20201010", "20301010",RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
				customerPageCorp customerPageCorp = new customerPageCorp(null);
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
		signInPage = new SignInPage(driver);
		ldLoansPage = new ldLoansPage(driver);
		signInPage.closeAfterMethod();
//		Date date = new Date();
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LIMIT");
		SwitchWindow.switchToWindowWithTitle(driver, "LIMIT");
		List<String> inputLimitData = Arrays.asList("");
		LimitPage.inputLimit(inputLimitData);
		driver.close();
		return afterCutCifCorpString;
	}
	
	@Test
	public void ldLoanTest014() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		ldLoansPage = new ldLoansPage(driver);
		signInPage.closeAfterMethod();
		Date date = new Date();
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.COMMDR");
		String targetTitle = "LOANS.AND.DEPOSITS";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputLDData = Arrays.asList("12951378","VND","50M",date.SystemDate(),"12M","20261010","21050","LD2414658561","20.00","M0101","M0101","NO","NO","12010.01","E123123","10260456.1.1","VND 50000000","Mua BDS de o","Bwd","Employee Id","NGUOI PHE DUYET","CU ANH TUAN");
		ldLoansPage.inputLD(inputLDData);
		String expectedMessage = "Loan Maturity Date FIN.MAT DATE AFTER COMMT END";
		System.out.println(ldLoansPage.ldLoanTest014Verify());
		Assert.assertEquals(expectedMessage, ldLoansPage.ldLoanTest014Verify());
		driver.close();
	}
	@Test
	public void ldLoanTest015() throws Exception {
		signInPage = new SignInPage(driver);
		ldLoansPage = new ldLoansPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		Date date = new Date();
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.COMMDR");
		String targetTitle = "LOANS.AND.DEPOSITS";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputLDData = Arrays.asList("12951378","VND","51M",date.SystemDate(),"12M","20241010","21050","LD2414658561","20.00","M0101","M0101","NO","NO","12010.01","E123123","10260456.1.1","VND 51000000","Mua BDS de o","Bwd","Employee Id","NGUOI PHE DUYET","CU ANH TUAN");
		ldLoansPage.inputLD(inputLDData);
		String expectedMessage = "Loan Amount.1 AMOUNT NOT AVAILABLE ON COMMITMENT";
		System.out.println(ldLoansPage.ldLoanTest015Verify());
		Assert.assertEquals(expectedMessage, ldLoansPage.ldLoanTest015Verify());
		driver.close();
	}
	@Test
	public void ldLoanTest025() throws Exception {
		signInPage = new SignInPage(driver);
		ldLoansPage = new ldLoansPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.LOAN.AMEND LD2418337090");
		String targetTitle = "LOANS.AND.DEPOSITS";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		String expectedMessage = "Effective Date Khong cho phep Nhap ngay khac ngay hien tai cua he thong";
		Assert.assertEquals(expectedMessage, ldLoansPage.ldLoanTest025Verify("-1000000","20250629")); 
		driver.close();
	}
	@Test
	public void ldLoanTest026() throws Exception {
		signInPage = new SignInPage(driver);
		ldLoansPage = new ldLoansPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.LOAN.AMEND LD2418337090");
		String targetTitle = "LOANS.AND.DEPOSITS";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		String expectedMessage = "Effective Date Khong cho phep Nhap ngay khac ngay hien tai cua he thong";
		Assert.assertEquals(expectedMessage, ldLoansPage.ldLoanTest026Verify("-1000000","20240629")); 
		driver.close();
	}
	
	@Test
	public void ldLoanTest029() throws Exception {
		signInPage = new SignInPage(driver);
		ldLoansPage = new ldLoansPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.LOAN.AMEND LD2418337090");
		String targetTitle = "LOANS.AND.DEPOSITS";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		String expectedMessage = "Effective Date Khong cho phep Nhap ngay khac ngay hien tai cua he thong";
		Assert.assertEquals(expectedMessage, ldLoansPage.ldLoanTest026Verify("-1000000","20240629")); 
		driver.close();
	}
	
}