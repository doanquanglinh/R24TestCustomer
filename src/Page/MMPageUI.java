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
	public static final By MATURITYDATE = By.id("fieldName:MATURITY.DATE");
	public static final By INTERESTTYPE = By.xpath("//input[@id = 'radio:tab1:INT.RATE.TYPE' and @value = '1']");
	public static final By INTERESTRATE = By.xpath("//input[@id = 'fieldName:INTEREST.RATE']");
	public static final By INTERESTBASIS= By.id("fieldName:INTEREST.BASIS");
	
	public static final By PAYMENTDETAILTAB = By.xpath("//a[@class='nonactive-tab' and span[contains(text(), 'Payment Details')]]");
	public static final By SECUREDFORM = By.id("fieldName:SECURED.FORM");
	public static final By CREDITACCOUNT = By.id("fieldName:DRAWDOWN.ACCOUNT");
	public static final By PRINCIPALLIQACCT = By.id("fieldName:PRIN.LIQ.ACCT");
	
}
