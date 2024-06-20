package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class LDLoanPage025 {
    private WebDriver driver;

    public LDLoanPage025(WebDriver driver) {
        this.driver = driver;
    }
    
    private By findButton = By.id("transactionId");
    private By amtIncDec = By.id("fieldName:AMOUNT.INCREASE");
    private By effectiveDate = By.id("fieldName:AMT.V.DATE");
    private By phiDaThu = By.id("fieldName:PHI.DA.THU");

    public void inputDataTC025(String amtIncDecData,String effectiveDateData,String phiDaThuData,String findButtonData ) {
        WebElement amtIncDecElement = driver.findElement(amtIncDec);
        WebElement effectiveDateElement = driver.findElement(effectiveDate);
        WebElement phiDaThuElement = driver.findElement(phiDaThu);
        WebElement findButtonElement = driver.findElement(findButton);
        
        Assert.assertTrue(findButtonElement.isDisplayed());
        Assert.assertTrue(amtIncDecElement.isDisplayed());
        Assert.assertTrue(effectiveDateElement.isDisplayed());
        Assert.assertTrue(phiDaThuElement.isDisplayed());
        
        findButtonElement.sendKeys(findButtonData);
        amtIncDecElement.sendKeys(amtIncDecData);
        effectiveDateElement.sendKeys(effectiveDateData);
        phiDaThuElement.sendKeys(phiDaThuData);
        
  
    }
 }

