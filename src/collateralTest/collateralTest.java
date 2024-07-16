package collateralTest;
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
public class collateralTest extends BaseSetup {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPage customerPage;

	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
	}
	@Test
  public void collateralTest001() throws Exception{
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.closeAfterMethod();
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPage = new customerPage(driver);
		signInPage.signin("LINHDQ.1", "Anbinh$1234");
		signInPage.SwitchFrame1();
		SwitchWindow.switchToWindowWithTitle(driver, "COLLATERAL RIGHT");
  }
}
