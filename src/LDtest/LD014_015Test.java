package LDtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Base.Date;
import Page.SignInPage;
import Page.LDLoanPage014_015;
import Base.SwitchWindow;
import org.testng.Assert;
import java.util.Arrays;
import java.util.List;

public class LD014_015Test extends BaseSetup {

	private WebDriver driver;
	public SignInPage signInPage;
	public LDLoanPage014_015 lDLoanPage014;

	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
	}

	@Test
	public void TestLD014() throws Exception {
		signInPage = new SignInPage(driver);
		lDLoanPage014 = new LDLoanPage014_015(driver);
		Date date = new Date();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.COMMDR");
		String currentDate = date.getCurDate();
		String systemDate = date.SystemDate();
		String targetTitle = "LOANS.AND.DEPOSITS";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputData = Arrays.asList("12655581", "VND", "1000000", systemDate, "12M", currentDate, "21050",
				"123456", "20", "20241010M0101", "20241010M0101", "12010.01", "Employee id", "E123456",
				"Nguoi Phe Duyet", "CU ANH TUAN", "VLD.01.01 - Thanh toan tien dien", "12655581.01", "VND 10000000");
		lDLoanPage014.inputLD(inputData);
		String expectedMessage = "Khong phai hop dong commitment";
		Assert.assertEquals(expectedMessage, lDLoanPage014.TC014verify());
		driver.close();
	}
	@Test
	public void TestLD015() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		lDLoanPage014 = new LDLoanPage014_015(driver);
		Date date = new Date();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.COMMDR");
		String currentDate = date.getCurDate();
		String systemDate = date.SystemDate();
		String targetTitle = "LOANS.AND.DEPOSITS";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputData = Arrays.asList("12655581", "VND", "1000000", systemDate, "12M", currentDate, "21050",
				"123456", "20", "20241010M0101", "20241010M0101", "12010.01", "Employee id", "E123456",
				"Nguoi Phe Duyet", "CU ANH TUAN", "VLD.01.01 - Thanh toan tien dien", "12655581.01", "VND 10000000");
		lDLoanPage014.inputLD(inputData);
		String expectedMessage = "";
		Assert.assertEquals(expectedMessage, lDLoanPage014.TC014verify());
		driver.close();
	}
}
