package MMTest;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Base.RanDomStringInt;
import Page.SignInPage;
import Page.accountPage;
import Page.accountUI;
import Page.customerPageCorp;
import Page.customerPageUI;
import Page.datePage;
import Page.customerPage;
import Base.SwitchWindow;

public class MMTest extends BaseSetup {
	private WebDriver driver;
	public SignInPage signInPage;
	public accountPage accountPage;
	public customerPage customerPage;
	public datePage DatePage;
	public customerPageCorp customerPageCorp;
	private String CIF_KHDN;
	private String sysDate;

	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
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
	    List<String> inputCustomerCorpData = Arrays.asList("DATA TEST MM", "TC MM", "CO NHUE, HA NOI", "CO NHUE",
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
	@Test(dependsOnMethods = ("customerKHDN"))
	public void openCurAcc() throws Exception{
		accountPage = new accountPage(driver);
		signInPage = new SignInPage(driver);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        signInPage.closeAfterMethod();
        SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
        driver.navigate().refresh();
        signInPage.signin("LINHDQ.1", "Abb$1234");
        signInPage.SwitchFrame1();
        signInPage.CMD("ACCOUNT,VMB.CA.OPEN I 10");
        SwitchWindow.switchToWindowWithTitle(driver, "ACCOUNT");
        List<String> inputCurAccountData = Arrays.asList(CIF_KHDN,"1001",RanDomStringInt.generateRandomString(6),"VND","Bhxh 1 lan");
        accountPage.inputCurAccount(inputCurAccountData);
		WebElement getCurAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(accountUI.MESSAGE));
        getCurAccountElement.isDisplayed();
        String CurAccountText = getCurAccountElement.getText().substring(14, 27);
        System.out.println(CurAccountText);
        driver.close();
        accountPage.authAccount("LINHDQ.2", CurAccountText);
        
	}
	@Test(dependsOnMethods = {"dateTestgetToday","customerKHDN","openCurAcc"})
	public void MMTest001() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		signInPage.closeAfterMethod();
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.PLACE");
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		
//		driver.close();
	}
}
	


	