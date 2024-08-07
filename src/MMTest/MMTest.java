package MMTest;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Base.RanDomStringInt;
import Page.MMPage;
import Page.MMPageUI;
import Page.SignInPage;
import Page.accountPage;
import Page.accountUI;
import Page.customerPageCorp;
import Page.customerPageUI;
import Page.datePage;
import Page.customerPage;
import Base.SwitchWindow;
import org.openqa.selenium.By;



public class MMTest extends BaseSetup {
	private WebDriver driver;
	public SignInPage signInPage;
	public accountPage accountPage;
	public customerPage customerPage;
	private MMPage MMPage;
	public datePage DatePage;
	public customerPageCorp customerPageCorp;
	private String CIF_KHDN;
	private String sysDate;
	private String curAcc;
	

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
	    System.out.println(CIF_KHDN);
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
        curAcc = CurAccountText;
        System.out.println(CurAccountText);
        driver.close();
        accountPage.authAccount("LINHDQ.2", CurAccountText);
        
	}
	@Test(dependsOnMethods = {"dateTestgetToday","customerKHDN","openCurAcc"})
//	@Test
	public void MMTest002() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		signInPage.closeAfterMethod();
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		MMPage = new MMPage(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.PLACE.OVN");
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		List<String> inputMMData = Arrays.asList(sysDate,"10",CIF_KHDN,"VND","50M",sysDate,"24M","20261010","20","NO",curAcc,curAcc,curAcc,"SECURED","TRADING","MM TEST 002 FREE 1","MM TEST 002 FREE 2");
		MMPage.inputMM(inputMMData);
		WebElement commitSuccessfulElement = wait.until	(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COMMIT_SUCCESSFUL));
	       commitSuccessfulElement.isDisplayed();
	     String mmID = commitSuccessfulElement.getText().substring(14,27);
	     System.out.println(mmID);
	       MMPage.MM002Verify();
		SwitchWindow.switchToWindowWithTitle(driver, "Limit Summary/Customer Liability");
		driver.close();
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		driver.close();
		MMPage.authoriseMM("LINHDQ.2",mmID);
		MMPage.MM002Verify();
		signInPage.closeAfterMethod();
		driver.close();
	}
	@Test(dependsOnMethods = {"dateTestgetToday","customerKHDN","openCurAcc"})
	public void MMTest003() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		signInPage.closeAfterMethod();
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		MMPage = new MMPage(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.PLACE.MTHLY.INT");
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		List<String> inputMMData = Arrays.asList(sysDate,"10",CIF_KHDN,"VND","10M",sysDate,"24M","20261010","20","NO",curAcc,curAcc,curAcc,"SECURED","TRADING","MM TEST 003 FREE 1","MM TEST 003 FREE 2");
		MMPage.inputMM(inputMMData);
		WebElement commitSuccessfulElement = wait.until	(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COMMIT_SUCCESSFUL));
	       commitSuccessfulElement.isDisplayed();
	    String mmID = commitSuccessfulElement.getText().substring(14,27);
	    MMPage.MM003Verify();
		SwitchWindow.switchToWindowWithTitle(driver, "Limit Summary/Customer Liability");
		driver.close();
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		driver.close();
		MMPage.authoriseAndAuthMM003("LINHDQ.2",mmID);
		MMPage.MM003Verify();
		signInPage.closeAfterMethod();
		driver.close();
	}
	
	@Test(dependsOnMethods = {"dateTestgetToday","customerKHDN","openCurAcc"})
//	@Test
	public void MMTest004() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		signInPage.closeAfterMethod();
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		MMPage = new MMPage(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.REVREPO");
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		List<String> inputMMData004 = Arrays.asList(sysDate,"10",CIF_KHDN,"VND","10M",sysDate,"24M","20261010","2.20","VSD","10000000",curAcc,curAcc,curAcc,"SECURED","TRADING","MM TEST 004 FREE 1","MM TEST 004 FREE 2");
		MMPage.inputMM004(inputMMData004);
		WebElement commitSuccessfulElement = wait.until	(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COMMIT_SUCCESSFUL));
	       commitSuccessfulElement.isDisplayed();
	    String mmID = commitSuccessfulElement.getText().substring(14,27);
	    MMPage.MM004Verify();
		SwitchWindow.switchToWindowWithTitle(driver, "Limit Summary/Customer Liability");
		driver.close();
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		driver.close();
		MMPage.authoriseAndAuthMM004("LINHDQ.2",mmID);
		MMPage.MM004Verify();
		signInPage.closeAfterMethod();
		driver.close();
	}
	
	@Test(dependsOnMethods = {"dateTestgetToday","customerKHDN","openCurAcc"})
//@Test
	public void MMTest006() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		signInPage.closeAfterMethod();
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		MMPage = new MMPage(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("MM.MONEY.MARKET,VMB.TAKING.OVN");
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
		List<String> inputMMData006 = Arrays.asList(sysDate,"10",CIF_KHDN,"VND","10M",sysDate,"1D","10",curAcc,curAcc,curAcc,"UNSECURED","NORMAL","MM TEST 006 FREE 1","MM TEST 006 FREE 2");
		MMPage.inputMM006(inputMMData006);
		WebElement commitSuccessfulElement = wait.until	(ExpectedConditions.visibilityOfElementLocated(MMPageUI.COMMIT_SUCCESSFUL));
	       commitSuccessfulElement.isDisplayed();
	    String mmID = commitSuccessfulElement.getText().substring(14,27);
	    MMPage.MM006Verify();
		SwitchWindow.switchToWindowWithTitle(driver, "Limit Summary/Customer Liability");
//		driver.close();
		SwitchWindow.switchToWindowWithTitle(driver, "MONEY MARKET");
//		driver.close();
		MMPage.authoriseMM006("LINHDQ.2",mmID);
		MMPage.MM006Verify();
		signInPage.closeAfterMethod();
		driver.close();
	}
	
	 @Test
	    public void MMTest005HAHA() throws Exception {
	        for (int i = 0; i < 30; i++) {
	            System.out.println("Running iteration: " + (i + 1));
	            runTest();
	      
	        }
	    }
	    public void runTest() throws Exception {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        Thread.sleep(2000);
	        WebElement banhMyChamSuaElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/ul/li[3]/a/img"));
	        banhMyChamSuaElement.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement colorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("color")));
	        Select dropdownColor = new Select(colorElement);
	        dropdownColor.selectByValue("Kem");
	        
	        WebElement sizeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("size")));
	        Select dropdownSize = new Select(sizeElement);
	        dropdownSize.selectByValue("L");
	        Thread.sleep(1000);

	        WebElement addElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/main/div[3]/div[2]/form/div/div[2]/button")));
	        addElement.click();
	        
	        Thread.sleep(1000);

	        WebElement viewCartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/main/div[1]/div/a")));
	        viewCartElement.click();
	        Thread.sleep(2000);
	        WebElement paymentElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div/div/div[2]/div/div/div/a")));
	        paymentElement.click();
	        
	        WebElement nameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("billing_first_name")));
	        nameElement.clear();
	        nameElement.sendKeys("LINH");

	        
	        WebElement lastNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("billing_last_name")));
	        lastNameElement.clear();
	        lastNameElement.sendKeys("DOAN");
	        
	        WebElement addressElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("billing_address_1")));
	        addressElement.clear();
	        addressElement.sendKeys("CO NHUE 2");
	        
	        WebElement cityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("billing_city")));
	        cityElement.clear();
	        cityElement.sendKeys("HA NOI");
	        
	        WebElement soDienThoaiElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("billing_phone")));
	        soDienThoaiElement.clear();
	        soDienThoaiElement.sendKeys("0123456789");
	        
	        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("billing_email")));
	        emailElement.clear();
	        emailElement.sendKeys("anhch@gmail.com");
	        
	 
	        Thread.sleep(1500);
	        WebElement orderElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("woocommerce_checkout_place_order")));
	        orderElement.isDisplayed();
	        orderElement.click();
	        Thread.sleep(5000);

	        WebElement checkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div/div/div/p")));
	        checkElement.isDisplayed();
	        
	        WebElement homePageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[1]/nav/div/ul/li[5]/a")));
	        homePageElement.click();
	        driver.get("https://quanaohuonganh.com/cua-hang/"); 
	        Thread.sleep(2000);

	    }
}
	


	