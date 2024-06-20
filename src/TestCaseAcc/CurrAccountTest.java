package TestCaseAcc;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Page.SignInPage;
import Page.OpenCurAcc;

public class CurrAccountTest extends BaseSetup {

	private WebDriver driver;
	public SignInPage signInPage;
	public OpenCurAcc openCurAcc;

	@Parameters({ "browserType", "URL" })
	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test
	public void TypeAcc() throws Exception {
		signInPage = new SignInPage(driver);
		openCurAcc = new OpenCurAcc(driver);

		signInPage.signin("LINHDQ.1", "Abcd$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("ACCOUNT,VMB.CA.OPEN I 10");

		String currentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			if (!handle.equals(currentWindowHandle)) {
				driver.switchTo().window(handle);
				openCurAcc.inputAcc("99900456", "CNIDAK", "VND", "KHACH HANG 99900456", "KHACH HANG 99900456",
						"Tk Thuong", "VN0010001-0");
				openCurAcc.getAccNum();
				driver.close();
				driver.switchTo().window(currentWindowHandle);
				break;
			}
		}
		driver.navigate().refresh();
		signInPage.signin("LINHDQ.2", "Abcd$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("ENQ VMB.ACCOUNT.NAU");
		String currentWindowHandle2 = driver.getWindowHandle();
		Set<String> allWindowHandles2 = driver.getWindowHandles();
		for (String handle2 : allWindowHandles2) {
			if (!handle2.equals(currentWindowHandle2)) {
				driver.switchTo().window(handle2);
				System.out.println("handle2");
				openCurAcc.Auth();
				break;
			}
		}
	}
}
