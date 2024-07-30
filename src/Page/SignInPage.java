package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.SwitchWindow;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Keys;

public class SignInPage  {
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;
	private By User = By.id("signOnName");
	private By Password = By.id("password");
	private By SignIn = By.id("sign-in");
	private By Cmd = By.id("commandValue");

	public void UserField(String USER) {
		WebElement UserField = driver.findElement(User);
		if (UserField.isDisplayed()) {
			UserField.sendKeys(USER);
		}
	}
	public void PassWordField(String PASSWORD) {
		WebElement PassWordField = driver.findElement(Password);
		if (PassWordField.isDisplayed()) {
			PassWordField.sendKeys(PASSWORD);
		}
	}
	public void ClickSignIn() {
		WebElement ClickSignIn = driver.findElement(SignIn);
		if (ClickSignIn.isDisplayed()) {
			ClickSignIn.click();
		}
	}
	
		public void closeAfterMethod() {
		    if (SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER")) {
		        driver.close();
		    } else {
		    	//System.out.println("Continue");
		    }
		}
	
	public void signin(String USER, String PASSWORD) throws Exception {
	    	Thread.sleep(1000);
	    	UserField(USER);
		    PassWordField(PASSWORD);
		    Thread.sleep(1000);
		    ClickSignIn();
		    Thread.sleep(1500);
}
	public void SwitchFrame1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement frm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/frameset/frame[1]")));
	    driver.switchTo().frame(frm);
	}
	public void CMD(String Command) throws Exception
	{
		WebElement Com = driver.findElement(Cmd);
		if (Com.isDisplayed()) {
			Com.clear();
			Com.sendKeys(Command,Keys.ENTER);
			Thread.sleep(2000);

		}
	}

	
	/**********************************************************************************/
	public void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}
}
	
	
/*
 
	public boolean verifySignInPageTitle() {
		String expectedTitle = "Sign In";
		return getSignInPageTitle().equals(expectedTitle);
	}

	public boolean verifySignInPageText() {
		WebElement element = driver.findElement(headerPageText);
		String pageText = element.getText();
		String expectedPageText = "Forgot Username/Password?";
		return pageText.contains(expectedPageText);
	}

	
	public void signin(String username, String password, String Pin) throws Exception {
		enterEmail(username);
		enterPassword(password);
		clickSignIn();
		Thread.sleep(1000);
		enterPin(Pin);
		clickSubmit();
	}

	public boolean verifySignIn() {
		enterEmail("test");
		enterPassword("pass");
		clickSignIn();
		return getErrorMessage().contains("incorrect");
	}

	public void enterEmail(String email) {
		WebElement emailTxtBox = driver.findElement(emailInput);
		if (emailTxtBox.isDisplayed())
			emailTxtBox.sendKeys(email);
	}

	public void enterPassword(String password) {
		WebElement passwordTxtBox = driver.findElement(passwordInput);
		if (passwordTxtBox.isDisplayed())
			passwordTxtBox.sendKeys(password);
	}

	public void clickSignIn() {
		WebElement signin = driver.findElement(signinBtn);
		if (signin.isDisplayed()) {
			signin.click();
		}
	}

	public void clickSubmit() {
		WebElement submit = driver.findElement(submitBtn);
		if (submit.isDisplayed()) {
			submit.click();
		}
	}

	public void enterPin(String PIN) {
		driver.findElement(pinInput).sendKeys(PIN);
	}

	public void clickBack() {
		driver.findElement(backBtn).click();
	}

	public void clickResetPin() {
		driver.findElement(resetPintBtn).click();
	}

	public String getErrorMessage() {
		String strErrorMsg = null;
		WebElement errorMsg = driver.findElement(errorMsgText);
		if (errorMsg.isDisplayed() && errorMsg.isEnabled())
			strErrorMsg = errorMsg.getText();
		return strErrorMsg;
	}
*/
	
	