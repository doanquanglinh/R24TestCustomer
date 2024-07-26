package Page;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class localTablePage {
	private WebDriver driver;
	public localTablePage(WebDriver driver) {
		this.driver = driver;
	}
  public void specialOffersPage(String vettingTable2Data, String gbRemark2Data) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement vettingTableExpandElement = wait.until(ExpectedConditions.visibilityOfElementLocated(localTablePageUI.VETTING_TABLE_EXPAND));
		vettingTableExpandElement.click();
		WebElement vettingTable2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(localTablePageUI.VETTING_TABLE_2));
		vettingTable2Element.isDisplayed();
		WebElement gbRemark2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(localTablePageUI.GB_REMARK_2));
		vettingTable2Element.sendKeys(vettingTable2Data);
		gbRemark2Element.sendKeys(gbRemark2Data);
		WebElement commitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.commitDeal));
		commitElement.click();
  }
}
