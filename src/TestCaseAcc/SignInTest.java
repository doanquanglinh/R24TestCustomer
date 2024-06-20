package TestCaseAcc;

import org.openqa.selenium.WebDriver;
import Base.BaseSetup;
import Page.SignInPage;
import Page.OpenCurAcc;

public class SignInTest extends BaseSetup {

	private WebDriver driver;
	public SignInPage signInPage;
	public OpenCurAcc openCurAcc;


	public void setUp() {
		driver = getDriver();
	}
	
	public void signIn() throws Exception {
		signInPage = new SignInPage(driver);
		signInPage.signin("LINHDQ.1","Abcd$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("ACCOUNT,VMB.CA.OPEN I 10");
		}
}