package ldLoansTest;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Base.Date;
import Page.SignInPage;
import Page.ldLoansPage;
import Base.SwitchWindow;


public class ldLoansTest extends BaseSetup {

	private WebDriver driver;
	public SignInPage signInPage;
	public ldLoansPage ldLoansPage;

	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
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
		
	}
		
}
