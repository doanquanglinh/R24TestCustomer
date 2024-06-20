package Page;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class OpenCurAcc {
	private WebDriver driver;

	public OpenCurAcc(WebDriver driver) {
		this.driver = driver;
	}
	private By CustomerID = By.id("fieldName:CUSTOMER");
	private By Mnemonic = By.id("fieldName:MNEMONIC");
	private By Currency = By.id("fieldName:CURRENCY");
	private By AccountName = By.id("fieldName:ACCOUNT.TITLE.1:1");
	private By Short_Name = By.id("fieldName:SHORT.TITLE:1");
	private By NhomTK = By.id("fieldName:NHOM.TK");
	private By PHONG_QL_KPI = By.id("fieldName:PHONG.QL.KPI");
	private By Commit = By.xpath(
			"/html/body/div[3]/div[2]/form[1]/div[2]/table/thead/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[1]/a/img");
	private By stk = By.className("message");

	/*********************************************/
	private By FindId = By.id("value:1:1:1");
	private By FindButton = By.xpath("/html/body/div[3]/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/table/tbody/tr/td/a");

	String mnemonic = generateRandomString(6);
    private String generateRandomString(int length) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
    
	public void inputAcc(String customerID, String mnemonic, String currency, String account_Name, String short_Name,
		String nhomTK, String PqlPKI) {
		WebElement customerIDElement = driver.findElement(CustomerID);
		WebElement nemonicElement = driver.findElement(Mnemonic);
		WebElement Currencylement = driver.findElement(Currency);
		WebElement Account_Namelement = driver.findElement(AccountName);
		WebElement Short_NameElement = driver.findElement(Short_Name);
		WebElement NhomTKElement = driver.findElement(NhomTK);
		WebElement PHONG_QL_KPIElement = driver.findElement(PHONG_QL_KPI);
		WebElement CommitElement = driver.findElement(Commit);
	
		
		Assert.assertTrue(customerIDElement.isDisplayed());
		Assert.assertTrue(nemonicElement.isDisplayed());
		Assert.assertTrue(Currencylement.isDisplayed());
		Assert.assertTrue(Account_Namelement.isDisplayed());
		Assert.assertTrue(Short_NameElement.isDisplayed());
		Assert.assertTrue(NhomTKElement.isDisplayed());
		Assert.assertTrue(PHONG_QL_KPIElement.isDisplayed());
		Assert.assertTrue(CommitElement.isDisplayed());


		customerIDElement.sendKeys(customerID);
		nemonicElement.sendKeys(mnemonic);
		Currencylement.sendKeys(currency);
		Account_Namelement.sendKeys(account_Name);
		Short_NameElement.sendKeys(short_Name);
		NhomTKElement.sendKeys(nhomTK);
		PHONG_QL_KPIElement.sendKeys(PqlPKI);
		CommitElement.click();
		

	}
	public String substring;
	public void getAccNum() {
		WebElement accNum = driver.findElement(stk);
		Assert.assertTrue(accNum.isDisplayed());
		String AccNum = accNum.getText();
		substring = AccNum.substring(14, 14 + 13);
		System.out.println(substring);
	}

	public void Auth() {
				WebElement FindIdElement = driver.findElement(FindId);
				FindIdElement.clear();
				FindIdElement.sendKeys(substring);
				WebElement FindIdButtonElement = driver.findElement(FindButton);
				Assert.assertTrue(FindIdElement.isDisplayed());
				Assert.assertTrue(FindIdButtonElement.isDisplayed());
				System.out.println("123");
				FindIdButtonElement.click();
	}
}
