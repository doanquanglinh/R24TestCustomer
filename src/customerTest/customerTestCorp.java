package customerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseSetup;
import Base.RanDomCccdSDT;
import Page.SignInPage;
import Page.customerPageCorp;
import Page.customerPageUI;
import Base.SwitchWindow;
import java.util.Arrays;
import java.util.List;

public class customerTestCorp extends BaseSetup {
	private WebDriver driver;
	public SignInPage signInPage;
	public customerPageCorp customerPageCorp;

	@Parameters({ "browserType", "URL" })
	@BeforeMethod
	public void setUp() {
		driver = getDriver();
	}
	@Test
	public void customerTest010() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin("LINHDQ.1", "Anbinh$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY LINHDQ", "LINHDQ CO", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", "26584325682", "DK1", "368126968123", "HA NOI",
				"20201010", "20301010", "051651678912", "3616506549816", "20201010", "2020", "8005", "2109", "9614",
				"999", "E093710", "MR LINH DOAN", "03265482656", "2615615", "VN", "20221010");
		customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
		customerPageCorp.customerTest010Verify();
		driver.close();
	}
	
	@Test
	public void customerTest011() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin("LINHDQ.1", "Anbinh$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY LINHDQ", "LINHDQ CO", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", "26584325682", "DK1", "368126968123", "HA NOI",
				"20301010", "20311010", "051651678912", "3616506549816", "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", "03265482656", "2615615", "VN", "20221010");
		customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
		String expectedMessageCustomer011 = "Issued Date.1 Cannot be Greater than or Equal to Today";
		Assert.assertEquals(expectedMessageCustomer011,customerPageCorp.customerTest011Verify());
		driver.close();
	}
	
	@Test
	public void customerTest012() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin("LINHDQ.1", "Anbinh$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 012", "CONG TY DATA TEST CASE 012", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
				"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
				customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
				WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
				commitDealElement.click();
				WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
				getCifCorpElement.isDisplayed();
			    String cifText = getCifCorpElement.getText();
			    String afterCutCifCorpStringTC012 = cifText.substring(14, 22);
			    System.out.println(afterCutCifCorpStringTC012);
			    driver.close();			
				SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
				signInPage.SwitchFrame1();
				signInPage.CMD("CUSTOMER,VMB.CORP.SMART D "+ afterCutCifCorpStringTC012);
				SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
				WebElement deleteDealElement = driver.findElement(customerPageUI.deleteDeal);
				deleteDealElement.isDisplayed();
				deleteDealElement.click();
				Alert alert = driver.switchTo().alert();
				alert.accept();
				driver.close();	
				SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
				signInPage.SwitchFrame1();
				signInPage.CMD("CUSTOMER,VMB.CORP.SMART D "+ afterCutCifCorpStringTC012);
				String expectedMessageCustomer012 = "UNAUTH. RECORD MISSING";
				SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
				customerPageCorp.customerTest012Verify(afterCutCifCorpStringTC012);
				Assert.assertEquals(expectedMessageCustomer012,customerPageCorp.customerTest012Verify(afterCutCifCorpStringTC012));
				driver.close();
	}	
@Test
public void customerTest013() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin("LINHDQ.1", "Anbinh$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY TEST CASE 013", "TEST CASE 013", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
				"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
				customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
				
				WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
				commitDealElement.click();
				WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
				getCifCorpElement.isDisplayed();
			    String cifText = getCifCorpElement.getText();
			    String afterCutCifCorpString = cifText.substring(14, 22);
				System.out.println(afterCutCifCorpString);
				driver.close();
		
				SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
				signInPage.SwitchFrame1();
				signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
				SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
				customerPageCorp.customerTest013AndVerify("PEAK VIEW, 36 HOANG CAU","linhdq@abbank.vn",RanDomCccdSDT.genRandomCCCD(),afterCutCifCorpString);
				driver.close();
	}	
@Test
public void customerTest014() throws Exception{
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Anbinh$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY TEST CASE 014", "TEST CASE 014", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
			"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
			commitDealElement.click();
			WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
			getCifCorpElement.isDisplayed();
		    	String cifText = getCifCorpElement.getText();
		    	String afterCutCifCorpString = cifText.substring(14, 22);
			driver.close();
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
			signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
			SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
			customerPageCorp.customerTest014AndVerify("9","12951594","linhdq@abbank.vn",RanDomCccdSDT.genRandomCCCD(),afterCutCifCorpString);
			driver.close();
}	
@Test
public void customerTest015() throws Exception{
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Anbinh$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("ENQ VMB.CUS.RELATION");
	String targetTitle = "Customer Ralationship";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	customerPageCorp.customerTest015Verify("12951760");
	String expectedMessageCustomer015 = "12951760 TEST CASE 015 9 CHU SO HUU 12951759 CONG TY DATA TEST CASE 015 99 DONG CHU SO HUU";
	Assert.assertEquals(expectedMessageCustomer015,customerPageCorp.customerTest015Verify("12951760"));
}

@Test
public void customerTest016() throws Exception{
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Anbinh$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.INDIV.SF");
	SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
	String expectedMessageCustomer016 = "Vui long thuc hien chuc nang nay tren SmartForm.";
	customerPageCorp.customerTest016Verify();
	Assert.assertEquals(expectedMessageCustomer016,customerPageCorp.customerTest016Verify());
	driver.close();
}

@Test
public void customerTest017() throws Exception{
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Anbinh$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.INDIV.AMEND.SF");
	SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
	String expectedMessageCustomer017 = "Vui long thuc hien chuc nang nay tren SmartForm.12951916";
	customerPageCorp.customerTest017Verify("12951916");
	Assert.assertEquals(expectedMessageCustomer017,customerPageCorp.customerTest017Verify("12951916"));
	driver.close();
}

@Test
public void customerTest018() throws Exception{
	SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
	driver.navigate().refresh();
	signInPage = new SignInPage(driver);
	customerPageCorp = new customerPageCorp(driver);
	signInPage.signin("LINHDQ.1", "Anbinh$1234");
	signInPage.SwitchFrame1();
	signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
	String targetTitle = "CUSTOMER";
	SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
	List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 017", "CONG TY DATA TEST CASE 017", "CO NHUE, HA NOI", "CO NHUE",
			"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
			"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
			"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
			customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
			
			WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
			commitDealElement.click();
			WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
			getCifCorpElement.isDisplayed();
		    String cifText = getCifCorpElement.getText();
		    String afterCutCifCorpString = cifText.substring(14, 22);
		    System.out.println(afterCutCifCorpString);
		    driver.close();			
		    customerPageCorp.authoriseCustomerCorp(afterCutCifCorpString);
		    driver.close(); 
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
			driver.navigate().refresh();			
			signInPage = new SignInPage(driver);
			customerPageCorp = new customerPageCorp(driver);
			signInPage.signin("LINHDQ.1", "Anbinh$1234");
			signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
			SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
			List<String> inputCustomerCorpData2 = Arrays.asList("CONG TY TEST CASE 015", "TEST CASE 015", "CO NHUE, HA NOI", "CO NHUE",
					"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
					"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
					"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
					customerPageCorp.inputCustomerCorp(inputCustomerCorpData2);
					WebElement commitDealElement2 = driver.findElement(customerPageUI.commitDeal);
					commitDealElement2.isDisplayed();
					commitDealElement2.click();
					WebElement getCifCorpElement2 = driver.findElement(customerPageUI.getCifCorp);
					getCifCorpElement2.isDisplayed();
				    String cifText2 = getCifCorpElement2.getText();
				    String afterCutCifCorpString2 = cifText2.substring(14, 22);
				    System.out.println(afterCutCifCorpString2);
				    driver.close();
					SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
					signInPage.SwitchFrame1();
					signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
					SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
					//customerPageCorp.customerTest018AndVerify();	
					//driver.close();
}

	

	public void customerTest014Indep() throws Exception {
			SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
			driver.navigate().refresh();
			signInPage = new SignInPage(driver);
			customerPageCorp = new customerPageCorp(driver);
			signInPage.signin("LINHDQ.1", "Anbinh$1234");
			signInPage.SwitchFrame1();
			signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
			String targetTitle = "CUSTOMER";
			SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
			List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 017", "CONG TY DATA TEST CASE 017", "CO NHUE, HA NOI", "CO NHUE",
					"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
					"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
					"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
					customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
					
					WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
					commitDealElement.click();
					WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
					getCifCorpElement.isDisplayed();
				    String cifText = getCifCorpElement.getText();
				    String afterCutCifCorpString = cifText.substring(14, 22);
				    System.out.println(afterCutCifCorpString);
				    driver.close();			
				    customerPageCorp.authoriseCustomerCorp(afterCutCifCorpString);
				    driver.close(); 
					SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
					driver.navigate().refresh();			
					signInPage = new SignInPage(driver);
					customerPageCorp = new customerPageCorp(driver);
					signInPage.signin("LINHDQ.1", "Anbinh$1234");
					signInPage.SwitchFrame1();
					signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
					SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
					List<String> inputCustomerCorpData2 = Arrays.asList("CONG TY TEST CASE 015", "TEST CASE 015", "CO NHUE, HA NOI", "CO NHUE",
							"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
							"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
							"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
							customerPageCorp.inputCustomerCorp(inputCustomerCorpData2);
							WebElement commitDealElement2 = driver.findElement(customerPageUI.commitDeal);
							commitDealElement2.isDisplayed();
							commitDealElement2.click();
							WebElement getCifCorpElement2 = driver.findElement(customerPageUI.getCifCorp);
							getCifCorpElement2.isDisplayed();
						    String cifText2 = getCifCorpElement2.getText();
						    String afterCutCifCorpString2 = cifText2.substring(14, 22);
						    System.out.println(afterCutCifCorpString2);
						    driver.close();
							SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
							signInPage.SwitchFrame1();
							signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
							SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
							customerPageCorp.customerTest014AndVerify("9",afterCutCifCorpString,"linhdq@abbank.vn",RanDomCccdSDT.genRandomCCCD(),afterCutCifCorpString2);
							driver.close();
		}	
	public void customerTest015Indep() throws Exception {
		SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
		driver.navigate().refresh();
		signInPage = new SignInPage(driver);
		customerPageCorp = new customerPageCorp(driver);
		signInPage.signin("LINHDQ.1", "Anbinh$1234");
		signInPage.SwitchFrame1();
		signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
		String targetTitle = "CUSTOMER";
		SwitchWindow.switchToWindowWithTitle(driver, targetTitle);
		List<String> inputCustomerCorpData = Arrays.asList("CONG TY DATA TEST CASE 015", "CONG TY DATA TEST CASE 015", "CO NHUE, HA NOI", "CO NHUE",
				"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
				"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
				"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
				customerPageCorp.inputCustomerCorp(inputCustomerCorpData);
				
				WebElement commitDealElement = driver.findElement(customerPageUI.commitDeal);
				commitDealElement.click();
				WebElement getCifCorpElement = driver.findElement(customerPageUI.getCifCorp);
				getCifCorpElement.isDisplayed();
			    String cifText = getCifCorpElement.getText();
			    String afterCutCifCorpString = cifText.substring(14, 22);
			    System.out.println(afterCutCifCorpString);
			    driver.close();			
			    customerPageCorp.authoriseCustomerCorp(afterCutCifCorpString);
			    driver.close(); 
				SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
				driver.navigate().refresh();
				
				signInPage = new SignInPage(driver);
				customerPageCorp = new customerPageCorp(driver);
				signInPage.signin("LINHDQ.1", "Anbinh$1234");
				signInPage.SwitchFrame1();
				signInPage.CMD("CUSTOMER,VMB.CORP.SMART");
				SwitchWindow.switchToWindowWithTitle(driver,"CUSTOMER");
				List<String> inputCustomerCorpData2 = Arrays.asList("CONG TY TEST CASE 014", "TEST CASE 014", "CO NHUE, HA NOI", "CO NHUE",
						"CO NHUE", "20201010", "CO NHUE", "CO NHUE", "1000", RanDomCccdSDT.genRandomCCCD(), "DK1", RanDomCccdSDT.genRandomCCCD(), "HA NOI",
						"20201010", "20301010",RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "20201010", "2020", "8009", "2102", "9614",
						"999", "E093710", "MR LINH DOAN", RanDomCccdSDT.genRandomCCCD(), RanDomCccdSDT.genRandomCCCD(), "VN", "20221010");
						customerPageCorp.inputCustomerCorp(inputCustomerCorpData2);
						WebElement commitDealElement2 = driver.findElement(customerPageUI.commitDeal);
						commitDealElement2.isDisplayed();
						commitDealElement2.click();
						WebElement getCifCorpElement2 = driver.findElement(customerPageUI.getCifCorp);
						getCifCorpElement2.isDisplayed();
					    String cifText2 = getCifCorpElement2.getText();
					    String afterCutCifCorpString2 = cifText2.substring(14, 22);
					    System.out.println(afterCutCifCorpString2);
					    driver.close();
						SwitchWindow.switchToWindowWithTitle(driver, "T24 - HOI SO CHINH-HAN");
						signInPage.SwitchFrame1();
						signInPage.CMD("CUSTOMER,VMB.CORP.AMEND.SMART");
						SwitchWindow.switchToWindowWithTitle(driver, "CUSTOMER");
						customerPageCorp.customerTest014AndVerify("9",afterCutCifCorpString,"linhdq@abbank.vn",RanDomCccdSDT.genRandomCCCD(),afterCutCifCorpString2);  
						driver.close();
						customerPageCorp.authoriseCustomerCorp(afterCutCifCorpString2);
						driver.close();
						signInPage.SwitchFrame1();
						signInPage.CMD("ENQ VMB.CUS.RELATION");
						SwitchWindow.switchToWindowWithTitle(driver,"Customer Ralationship");					
	}	
}
