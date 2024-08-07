package Page;

import org.openqa.selenium.By;

public class MMPageUI {
	public static final By DEALDATE = By.id("fieldName:DEAL.DATE");
	public static final By DEALERDESK = By.id("fieldName:DEALER.DESK");
	public static final By COUNTERPARTY = By.id("fieldName:CUSTOMER.ID");
	public static final By CURRENCY = By.id("fieldName:CURRENCY");
	public static final By AMOUNTPLACED = By.id("fieldName:PRINCIPAL");
	public static final By STARTDATE = By.id("fieldName:VALUE.DATE");
	public static final By TERM = By.id("fieldName:TERM");
	public static final By LIMIT_REFERENCE = By.id("fieldName:LIMIT.REFERENCE");

	public static final By MATURITYDATE = By.id("fieldName:MATURITY.DATE");
	public static final By INTERESTTYPE = By.xpath("//input[@id = 'radio:tab1:INT.RATE.TYPE' and @value = '1']");
	public static final By INTERESTRATE = By.xpath("//input[@id = 'fieldName:INTEREST.RATE']");
	public static final By INTERESTBASIS= By.id("fieldName:INTEREST.BASIS");
	public static final By NEGATIVE_RATE = By.id("fieldName:NEGATIVE.RATE");

	public static final By PAYMENTDETAILTAB = By.xpath("//a[@class='nonactive-tab' and span[contains(text(), 'Payment Details')]]");
	public static final By MMTAB = By.xpath("//a[@class='active-tab' and span[contains(text(), 'MM Placement/Loan - Fixed Maturity')]]");
	public static final By SECUREDFORM = By.id("fieldName:SECURED.FORM");
	public static final By CREDITACCOUNT = By.id("fieldName:DRAWDOWN.ACCOUNT");
	public static final By PRINCIPALLIQACCT = By.id("fieldName:PRIN.LIQ.ACCT");
	public static final By INT_LIQ_ACCT = By.id("fieldName:INT.LIQ.ACCT");
	public static final By CAPITALISATION = By.xpath("//input[@id = 'radio:tab1:CAPITALISATION' and @value = 'N' ]");
	public static final By SECURED_FORM = By.id("fieldName:SECURED.FORM");
	public static final By TYPE_OF_TXNS = By.id("fieldName:Type of transac");
	public static final By FREE_1 = By.id("fieldName:FREE:1");
	public static final By FREE_EXPAND = By.xpath("//td[@mvdetails = 'M_210.2_210.2']//img[@title = 'Expand Sub Value']");
	public static final By FREE_2 = By.id("fieldName:FREE:2");
	public static final By DESC_DEPT = By.id("fieldName:DESC.DEPT");
	public static final By NOI_LUU_KY = By.id("fieldName:MM.NOILUUKY");
	public static final By TONG_MENH_GIA = By.id("fieldName:MM.TONGMENHGIA");
	public static final By OVERRIDES = By.xpath("//td[@class = 'textbtn']");
	public static final By COMMIT_SUCCESSFUL = By.xpath("//td[@class='message' and contains(text(), 'Txn Complete') and contains(text(), 'Deal slip printed')]");
	public static final By TRANSACTION_ID_MM_PLACE_OVN = By.xpath("//input[@id= 'transactionId' and @class = 'idbox idbox_MMMONEYMARKET idbox_MMMONEYMARKET_VMBPLACEOVN']");
	public static final By TRANSACTION_ID_MM_MTHLY_INT = By.xpath("//input[@id= 'transactionId' and @class = 'idbox idbox_MMMONEYMARKET idbox_MMMONEYMARKET_VMBPLACEMTHLYINT']");
	public static final By TRANSACTION_ID_MM_TAKING = By.xpath("//input[@id= 'transactionId' and @class = 'idbox idbox_MMMONEYMARKET idbox_MMMONEYMARKET_VMBTAKING']");
	public static final By TRANSACTION_ID_MM_REPO = By.xpath("//input[@id= 'transactionId' and @class = 'idbox idbox_MMMONEYMARKET idbox_MMMONEYMARKET_VMBREVREPO']");
	public static final By TRANSACTION_ID_MM_TAKING_OVN = By.xpath("//input[@id= 'transactionId' and @class = 'idbox idbox_MMMONEYMARKET idbox_MMMONEYMARKET_VMBTAKINGOVN']");

}
