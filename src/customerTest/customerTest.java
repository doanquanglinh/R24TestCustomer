package customerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Page.SignInPage;
import Page.customerPage;
import Base.SwitchWindow;
import java.util.Arrays;
import java.util.List;
import Page.customerPageUI;
import Base.RanDomStringInt;

public class customerTest extends BaseSetup {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPage customerPage;

	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
	}

	@Test
	public void customerTest001() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUS,VMB.INDIV.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerData = Arrays.asList("DOAN", "LINH", "QUANG","DOAN QUANG LINH", "LINHDQ", "CO NHUE", "CO NHUE",
				"1000", "19991010", "VN", "CCCD", "25787278228", "BAC NINH", "20151010",
				"1001", "9102", "2001", "114", "E123456","9990","0797979796789","linhdq@abbank.vn","0264852376789","20301010");
		customerPage.inputCustomer(inputCustomerData);	
		customerPage.customerTest001Verify();
	driver.close();
	}
	
	@Test
	public void customerTest002() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUS,VMB.INDIV.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerData = Arrays.asList("DOAN", "LINH", "QUANG","DOAN QUANG LINH", "LINHDQ", "", "CO NHUE",
				"1000", "19991010", "VN", "CCCD", "", "HA NOI", "20151010",
				"1001", "9102", "2001", "114", "E123456","9990","012345678","linhdq@abbank.vn","0264852376789","20301010");
		customerPage.inputCustomer(inputCustomerData);	
		String expectedMessageStreet = "Street.1";
		String expectedMessageIdNumber = "ID Number.1";
		Assert.assertEquals(expectedMessageStreet, customerPage.customerTest002VerifyStreet());
		Assert.assertEquals(expectedMessageIdNumber, customerPage.customerTest002VerifyIdNumber());
		driver.close();
	}
	
	@Test
	public void customerTest003() throws Exception {
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUS,VMB.INDIV.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerData = Arrays.asList("DOAN", "LINH", "QUANG","DOAN QUANG LINH", "LINHDQ", "CO NHUE", "CO NHUE",
				"1000", "20301010", "VN", "CCCD", "064846526", "HA NOI", "20151010",
				"1001", "9102", "2001", "114", "E123456","9990","012345678","linhdq@abbank.vn","0264852376789","20301010");
		customerPage.inputCustomer(inputCustomerData);	
		String expectedMessageCustomer003 = "Date of Birth Cannot be Greater than or Equal to Today";
		Assert.assertEquals(expectedMessageCustomer003, customerPage.customerTest003Verify());
		driver.close();
	}
	
	@Test
	public void customerTest004() throws Exception {
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUS,VMB.INDIV.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerData = Arrays.asList("DOAN", "LINH", "QUANG","DOAN QUANG LINH", "LINHDQ", "CO NHUE", "CO NHUE",
				"1000", "19991010", "VN", "CCCD", "064846526", "HA NOI", "20241010",
				"1001", "9102", "2001", "114", "E123456","9990","012345678","linhdq@abbank.vn","0264852376789","20301010");
		customerPage.inputCustomer(inputCustomerData);
		customerPage.customerTest004Verify();	
		driver.close();
	}
	@Test
	public void customerTest005() throws Exception {
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");	
		signInPage.SwitchFrame1();
		signInPage.CMD("CUS,VMB.INDIV.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerData = Arrays.asList("DOAN", "LINH", "QUANG","DOAN QUANG LINH", "LINHDQ", "CO NHUE", "CO NHUE",
				"1000", "19991010", "VN", "CCCD", "123456", "HA NOI", "20241010",
				"1001", "9102", "2001", "114", "E123456","9990","012345678","linhdq@abbank.vn","0264852376789","20301010");
		customerPage.inputCustomer(inputCustomerData);
		String expectedMessageCustomer005 = "ID Number.1 KH NAY DA CO ID TREN HE THONG";
		Assert.assertEquals(expectedMessageCustomer005,	customerPage.customerTest005Verify());
		driver.close();
	}
	@Test
	public void customerTest006() throws Exception {
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUS,VMB.INDIV.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerData = Arrays.asList("DOAN", "LINH", "QUANG","DOAN QUANG LINH", "LINHDQ", "CO NHUE", "CO NHUE",
				"1000", "19991010", "VN", "DK1", "123456", "HA NOI", "20241010",
				"1001", "9102", "2001", "114", "E123456","9990","012345678","linhdq@abbank.vn","0264852376789","20301010");
		customerPage.inputCustomer(inputCustomerData);
		String expectedMessageCustomer006 = "ID Type.1 KH CA NHAN KHÔNG DUOC CHON ID TYPE DK1";
		Assert.assertEquals(expectedMessageCustomer006,	customerPage.customerTest006Verify());
		driver.close();
	}
	@Test
	public void customerTest007() throws Exception {
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUS,VMB.INDIV.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		String expectedMessageCustomer007 = "RECORD MISSING";
		Assert.assertEquals(expectedMessageCustomer007, customerPage.customerTest007AndVerify("12951221"));
		driver.close();
	}
	@Test
	public void customerTest008() throws Exception {
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER D 12951377");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		String expectedMessageCustomer008 = "UNAUTH. RECORD MISSING";
		Assert.assertEquals(expectedMessageCustomer008, customerPage.customerTest008AndVerify());
		driver.close();	
	}
	@Test	
	public void customerTest009() throws Exception {
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUS,VMB.INDIV.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerData = Arrays.asList("DOAN", "LINH", "QUANG","DOAN QUANG LINH", "LINHDQ", "CO NHUE", "CO NHUE",
				"1000", "19991010", "VN", "CCCD",RanDomStringInt.genRandom(), "BAC NINH", "20151010",
				"1001", "9102", "2001", "114", "E123456","9990","0797979796789","linhdq@abbank.vn",RanDomStringInt.genRandom(),"20301010");
		customerPage.inputCustomer(inputCustomerData);	
			WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
		commitDealElement.click();
		WebElement getCifElement = driver.findElement(customerPageUI.getCif);
		getCifElement.isDisplayed();
	    String cifText = getCifElement.getText();
	    String afterCutCifString = cifText.substring(14, 22);
		System.out.println(afterCutCifString);
		driver.close();
		signInPage.closeAfterMethod();
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.INDIV.AMEND");
		SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
		customerPage.customerTest009AndVerify("15 OCT 1999",afterCutCifString);
	    driver.close();
	}	
}


