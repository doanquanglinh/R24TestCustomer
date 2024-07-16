package ldLoansTest;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
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
		signInPage = new SignInPage(driver);
		ldLoansPage = new ldLoansPage(driver);
		Date date = new Date();
		signInPage.signin("LINHDQ.1", "Abb$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("LD.LOANS.AND.DEPOSITS,VMB.COMMDR");
		String currentDate = date.getCurDate();
		String targetTitle = "LOANS.AND.DEPOSITS";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputLDData = Arrays.asList("12951378","VND","100M",date.SystemDate(),"12M","20261010","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*");
		ldLoansPage.inputLD(inputLDData);
		//driver.close();
	}

}
