package Page;
import org.openqa.selenium.By;
public class dateUI {
	public static final By TRANSACTION_ID_DATES = By.xpath("//input[@id='transactionId' and @class = 'idbox idbox_DATES'] ");
	public static final By TODAY = By.xpath("//a[contains(text(),'Today')]//ancestor::tr[@tabid]//span[@class = 'disabled_dealbox disabled_dealbox_DATES' ]");
}
