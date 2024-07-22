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
import Page.datePage;
import Page.ldLoansPage;
import Base.SwitchWindow;

public class ldLoansTest extends BaseSetup {
	private WebDriver driver;
	public SignInPage signInPage;
	public ldLoansPage ldLoansPage;
	public LimitPage LimitPage;
	public customerPageCorp customerPageCorp;
	public datePage DatePage;

    private String CIF_KHDN;
    private String sysDate;
    private String CurAcc;

	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
	}
	
	@Test(dependsOnMethods = ("customerKHDN"))
	public void openCurAcc() throws Exception{
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
        signInPage = new SignInPage(driver);
        ldLoansPage = new ldLoansPage(driver);
        signInPage.closeAfterMethod();
        driver.navigate().refresh();
        signInPage.signin("LINHDQ.1", "Abb$1234");
        signInPage.SwitchFrame1();
        signInPage.CMD("ACCOUNT,VMB.CA.OPEN I 10");
        
	}

	@Test
	public void customerKHDN() throws Exception{
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
	    List<String> inputCustomerCorpData = Arrays.asList("DATA TEST LD 014 015", "TC 014 015", "CO NHUE, HA NOI", "CO NHUE",
	            "CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomStringInt.genRandom(), "DK1", RanDomStringInt.genRandom(), "HA NOI",
	            "20201010", "20301010", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "20201010", "2020", "8009", "2102", "9614",
	            "999", "E093710", "MR LINH DOAN", RanDomStringInt.genRandom(), RanDomStringInt.genRandom(), "VN", "20221010");
	    customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
	    WebElement commitDealElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
	    commitDealElement.click();
	    WebElement getCifCorpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.getCifCorp));
	    getCifCorpElement.isDisplayed();
	    CIF_KHDN = getCifCorpElement.getText().substring(14, 22);
	    driver.close();
	    customerPageCorp.authoriseCustomerCorp("LINHDQ.2",CIF_KHDN);  
	    driver.close();
	}
	@Test
    public void dateTestgetToday() throws Exception {
	        DatePage  = new datePage(driver);
	        signInPage = new SignInPage(driver);
	        customerPageCorp = new customerPageCorp(driver);
	        signInPage.closeAfterMethod();
	        SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	        driver.navigate().refresh();
	        signInPage.signin("LINHDQ.1", "Abb$1234");
	        signInPage.SwitchFrame1();
	        signInPage.CMD("DATES");
	        String targetTitle = "DATES";
	        SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	        sysDate = DatePage.getSystemDate("VN0010001");
	        driver.close();
	    }
	@Test(dependsOnMethods = {"dateTestgetToday","customerKHDN"})
	public void ldLoanTest014() throws Exception {
	        SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	        signInPage = new SignInPage(driver);
	        ldLoansPage = new ldLoansPage(driver);
	        signInPage.closeAfterMethod();
	        driver.navigate().refresh();
	        signInPage.signin("LINHDQ.1", "Abb$1234");
	        signInPage.SwitchFrame1();
	        signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.COMMDR");
	        String targetTitle = "LOANS.AND.DEPOSITS";
	        SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	        List<String> inputLDData = Arrays.asList("12951378", "VND", "50M",sysDate,"12M", "20261010", "21050", "LD2414658561", "20.00", "M0101", "M0101", "NO", "NO", "12010.01", "E123123", "10260456.1.1", "VND 50000000", "Mua BDS de o", "Bwd", "Employee Id", "NGUOI PHE DUYET", "CU ANH TUAN");
	        ldLoansPage.inputLD(inputLDData);
	        String expectedMessage = "Loan Maturity Date FIN.MAT DATE AFTER COMMT END";
	        System.out.println(ldLoansPage.ldLoanTest014Verify());
	        Assert.assertEquals(ldLoansPage.ldLoanTest014Verify(), expectedMessage);
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