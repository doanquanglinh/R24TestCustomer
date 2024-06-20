package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class LDLoanPage014_015 {
    private WebDriver driver;

    public LDLoanPage014_015(WebDriver driver) {
        this.driver = driver;
    }

    private By newDeal = By.xpath("//img[@title='New Deal']");
    private By customerId = By.id("fieldName:CUSTOMER.ID");
    private By currency = By.id("fieldName:CURRENCY");
    private By loanAmount = By.id("fieldName:AMOUNT:1");
    private By loanStartDate = By.id("fieldName:VALUE.DATE");
    private By term = By.id("fieldName:TERM");
    private By loanMaturityDate = By.id("fieldName:FIN.MAT.DATE");
    private By loanProduct = By.id("fieldName:CATEGORY");
    private By commitmentRef = By.id("fieldName:COMMITMENT.NO");
    private By interestRate = By.id("fieldName:INTEREST.RATE:1");
    private By interestDueDate = By.id("fieldName:INTEREST.DUE.DATE");
    private By forwardBackKey = By.id("fieldName:FWD.BWD.KEY");
    private By lsthanoi = By.id("CheckBox:fieldName:Floating Int");
    private By ngaythayLS = By.id("fieldName:Ngay.thay.LS");
    private By limitRef = By.id("fieldName:LIMIT.REFERENCE");
    private By addIF = By.id("fieldName:ADDITIONAL INFO:1");
    private By desc1 = By.id("fieldName:DESCRIPTION:1");
    private By newAdd = By.xpath("//td[@mvdetails = 'M_284.2_285.2']//img[@alt='Expand Sub Value']");
    private By addIF2 = By.id("fieldName:ADDITIONAL INFO:2");
    private By desc2 = By.id("fieldName:DESCRIPTION:2");
    private By loanCode = By.id("fieldName:T24.LOAN.CODE");
    private By collateralId = By.id("fieldName:COLLATERAL.ID:1");
    private By ngoaiLe = By.xpath("//input[@value='NO' and @name = 'radio:tab1:NGOAI.LE']");
    private By soTien = By.id("fieldName:SOTIEN");
    private By validate = By.xpath("//img[@title='Validate a deal']");
    private By verify = By.xpath("//span[@class='captionError' and text()='Khong phai hop dong commitment']");

    public void inputLD(List<String> inputData) {
        WebElement newDealElement = driver.findElement(newDeal);
        Assert.assertTrue(newDealElement.isDisplayed());
        newDealElement.click();

        WebElement customerIdElement = driver.findElement(customerId);
        WebElement currencyElement = driver.findElement(currency);
        WebElement loanAmountElement = driver.findElement(loanAmount);
        WebElement loanStartDateElement = driver.findElement(loanStartDate);
        WebElement termElement = driver.findElement(term);
        WebElement loanMaturityDateElement = driver.findElement(loanMaturityDate);
        WebElement loanProductElement = driver.findElement(loanProduct);
        WebElement commitmentRefIdElement = driver.findElement(commitmentRef);
        WebElement interestRateElement = driver.findElement(interestRate);
        WebElement interestDueDateElement = driver.findElement(interestDueDate);
        WebElement forwardBackKeyElement = driver.findElement(forwardBackKey);
        WebElement lsthanoiElement = driver.findElement(lsthanoi);
        WebElement ngaythayLSElement = driver.findElement(ngaythayLS);
        WebElement limitRefElement = driver.findElement(limitRef);
        WebElement addIFElement = driver.findElement(addIF);
        WebElement desc1Element = driver.findElement(desc1);
        WebElement newAddElement = driver.findElement(newAdd);
        WebElement loanCodeElement = driver.findElement(loanCode);
        WebElement collateralIdElement = driver.findElement(collateralId);
        WebElement ngoaiLeElement = driver.findElement(ngoaiLe);
        WebElement validateElement = driver.findElement(validate);
        WebElement soTienElement = driver.findElement(soTien);

        Assert.assertTrue(customerIdElement.isDisplayed());
        Assert.assertTrue(currencyElement.isDisplayed());

        customerIdElement.sendKeys(inputData.get(0));
        currencyElement.sendKeys(inputData.get(1));
        loanAmountElement.sendKeys(inputData.get(2));
        loanStartDateElement.sendKeys(inputData.get(3));
        termElement.sendKeys(inputData.get(4));
        loanMaturityDateElement.sendKeys(inputData.get(5));
        loanProductElement.sendKeys(inputData.get(6));
        commitmentRefIdElement.sendKeys(inputData.get(7));
        interestRateElement.sendKeys(inputData.get(8));
        interestDueDateElement.sendKeys(inputData.get(9));

        Select forwardBackKeySelect = new Select(forwardBackKeyElement);
        forwardBackKeySelect.selectByValue("FWD");

        lsthanoiElement.click();
        ngaythayLSElement.sendKeys(inputData.get(10));
        limitRefElement.sendKeys(inputData.get(11));
        addIFElement.sendKeys(inputData.get(12));
        desc1Element.sendKeys(inputData.get(13));
        newAddElement.click();

        WebElement addIF2Element = driver.findElement(addIF2);
        Assert.assertTrue(addIF2Element.isDisplayed());
        addIF2Element.sendKeys(inputData.get(14));

        WebElement desc2Element = driver.findElement(desc2);
        Assert.assertTrue(desc2Element.isDisplayed());
        desc2Element.sendKeys(inputData.get(15));
        loanCodeElement.sendKeys(inputData.get(16));
        collateralIdElement.sendKeys(inputData.get(17));
        soTienElement.sendKeys(inputData.get(18));
        ngoaiLeElement.click();
        validateElement.click();
    }

    public String TC014verify() {
        WebElement verifyElement = driver.findElement(verify);
        verifyElement.isDisplayed();
        return verifyElement.getText();
    }
}
