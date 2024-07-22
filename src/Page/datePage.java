package Page;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Locale;

public class datePage {
    private WebDriver driver;
    
    public datePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getSystemDate(String BranchCode) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement transactionIDDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dateUI.TRANSACTION_ID_DATES));
        transactionIDDateElement.sendKeys(BranchCode);
        WebElement viewTransactionDate = wait.until(ExpectedConditions.visibilityOfElementLocated(customerPageUI.viewTransaction));
        viewTransactionDate.click();
        WebElement todayElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dateUI.TODAY));
        String getDateToday = todayElement.getText();
        return getDateToday;
    }
}
