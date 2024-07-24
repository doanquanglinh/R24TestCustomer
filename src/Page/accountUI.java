package Page;
import org.openqa.selenium.By;
public class accountUI {
	public static final By CUSTOMER_ID = By.id("fieldName:CUSTOMER");
	public static final By PRODUCT_CODE = By.id("fieldName:CATEGORY");
	public static final By MNEMONIC = By.id("fieldName:MNEMONIC");
	public static final By CURRENCY = By.id("fieldName:CURRENCY");
	public static final By MESSAGE = By.xpath("//td[@class = 'message']");
	public static final By NHOM_TAI_KHOAN = By.id("fieldName:NHOM.TK");
	public static final By TRANSACTION_ID_AU_ACC = By.xpath("//input[@id = 'transactionId' and @class = 'idbox idbox_ACCOUNT']");
	
}