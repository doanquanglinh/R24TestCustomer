package Page;
import org.openqa.selenium.By;
public class customerPageUI {
	public static final By newDeal = By.xpath("//img[@title='New Deal']");
	public static final By firstName = By.id("fieldName:FIRST.NAME");
	public static final By lastName = By.id("fieldName:LAST.NAME");
	public static final By middleName = By.id("fieldName:MIDDLE.NAME");
	public static final By gbFullName = By.id("fieldName:NAME.1:1");
	public static final By gbShortName = By.id("fieldName:SHORT.NAME:1");
	public static final By hoAdress = By.id("fieldName:ADDRESS:1:1");
	public static final By currAdress = By.id("fieldName:POST.CODE:1");
	public static final By otherAdress = By.id("fieldName:OTHER.ADDRESS:1");
	public static final By taxCode = By.id("fieldName:LEGAL.ID:1");

	public static final By gbStreet = By.id("fieldName:STREET:1");
	public static final By gbTown = By.id("fieldName:TOWN.COUNTRY:1");
	public static final By cityProvince = By.id("fieldName:PROVINCE");
    public static final By dob = By.id("fieldName:BIRTH.INCORP.DATE");
    public static final By dobAmend = By.xpath("//input[@id = 'fieldName:BIRTH.INCORP.DATE']");
	public static final By nationality = By.id("fieldName:NATIONALITY");
	public static final By idType = By.id("fieldName:NAT.ID.TYPE:1");
	public static final By idNumber = By.id("fieldName:NATIONAL.ID:1");
	public static final By issuedPlace = By.id("fieldName:NAT.PLACE.ISS:1");
	public static final By issuedDate = By.id("fieldName:NAT.ISS.DATE:1");
	public static final By expiryDate = By.id("fieldName:NAT.EXP.DATE:1");
	public static final By officeTel = By.id("fieldName:OFFICE.TEL");
	public static final By faxNo = By.id("fieldName:FAX.NO");
	public static final By establishDate = By.id("fieldName:ESTABLISH.DATE");
	public static final By doanhThuClick = By.xpath("//img[@title = 'Dropdown List' and @dropfield = 'fieldName:REVENUEYEAR']");
	public static final By doanhThu = By.id("fieldName:REVENUEYEAR:div");
	public static final By doanhThuTable = By.id("dropDownTable:fieldName:REVENUEYEAR");
	public static final By doanhThuText = By.id("dropDownRow2");
	public static final By hanMucTD = By.xpath("//input[@id = 'radio:mainTab:HAN.MUC.TD' and @value = 'Tu 100 ty tro xuong']");
	public static final By yomIndustry = By.id("fieldName:YEAR.MAIN.IND");
	public static final By cusAccep = By.xpath("//input[@id = 'radio:mainTab:CUSTOMER.ACCEPT' and @value = 'YES']");
	public static final By cusClass = By.xpath("//input[@value = 'KHACH HANG' and @id = 'radio:mainTab:CUS.CLASS']"); // default																						// KHACH																										// HANG
	public static final By sectorMain = By.id("fieldName:SECTOR.MAIN");
	public static final By sector = By.id("fieldName:SECTOR");
	public static final By industry = By.id("fieldName:INDUSTRY");
	public static final By classification = By.id("fieldName:TARGET");
	public static final By customerStatus = By.id("fieldName:CUSTOMER.STATUS");
	public static final By staffID = By.id("fieldName:STAFF.ID");
	public static final By contactName  = By.id("fieldName:CONTACT.NAME:1");
	public static final By officeNumber  = By.id("fieldName:CONTACT.OFFICE:1");
	public static final By idNumberCorp  = By.id("fieldName:ID.NUMBER:1");
	public static final By contactNationality  = By.id("fieldName:CONTACT.NAT:1");
	public static final By contactDOB  = By.id("fieldName:CONTACT.DOB:1");

	public static final By accountOfficer = By.id("fieldName:ACCOUNT.OFFICER");
	public static final By homeTel = By.id("fieldName:HOME.TEL");
	public static final By emailAdd = By.id("fieldName:EMAIL.ADD");
	public static final By mobileNo = By.id("fieldName:MOBILE.NO");
	public static final By validateDeal = By.xpath("//img[@title = 'Validate a deal']");
	public static final By commitDeal = By.xpath("//img[@title = 'Commit the deal']");
	public static final By errorMesBox = By.id("error_box");
	public static final By streetError = By.xpath("//td[@class = 'errors']//span[text() = ' Street.1']");
	public static final By idNumberError = By.xpath("//td[@class = 'errors']//span[text() = ' ID Number.1']");
	public static final By getCif = By.xpath("//div[@class = 'display_box display_box_CUSTOMER display_box_CUSTOMER_VMBINDIVSMART']");
	public static final By transactionId = By.xpath("//input[@id = 'transactionId' and @class= 'idbox idbox_CUSTOMER idbox_CUSTOMER_VMBINDIVSMART']");
	public static final By viewTransaction = By.xpath("//img[@title = 'View a contract']");
	public static final By mesBox = By.xpath("//td[@class='message']");
	public static final By editTransaction = By.xpath("//img[@title = 'Edit a contract']");
	public static final By transactionIdAmend = By.xpath("//input[@id = 'transactionId' and @class= 'idbox idbox_CUSTOMER idbox_CUSTOMER_VMBINDIVAMEND']");
	public static final By dobAfterAmend = By.xpath("//tr[@mvlist='M_9.2_9.2']//td[@colspan = '10']");
	public static final By genDer = By.xpath("//input[@name = 'radio:tab1:GENDER.ABB' and @value = 'MALE']");
	public static final By transactionIdCorp = By.xpath("//input[@id = 'transactionId' and @class = 'idbox idbox_CUSTOMER idbox_CUSTOMER_VMBCORPSMART']");
	public static final By getCifCorp = By.xpath("//td[@class = 'message']");
	public static final By transactionIdCorpAmend = By.xpath("//input[@id = 'transactionId' and @class = 'idbox idbox_CUSTOMER idbox_CUSTOMER_VMBCORPAMENDSMART']");
	
	public static final By returnToApp = By.xpath("//img[@title= 'Return to application screen']");
	
	public static final By emailAddCorp = By.id("fieldName:CONTACT.EMAIL:1");
	public static final By emailAddCorp2 = By.id("fieldName:CONTACT.EMAIL:2");
	public static final By emailAddCorp3 = By.id("fieldName:CONTACT.EMAIL:3");
	public static final By emailAddCorp4 = By.id("fieldName:CONTACT.EMAIL:4");
	
	public static final By mobileNumberCorp = By.id("fieldName:CONTACT.MOB:1");
	public static final By gbStreetAfterAmend = By.xpath("//tr[@mvlist = 'M_5.2_5.2,M_258.2_258.2' ]//td[@colspan = '42']");
	public static final By relCodeCorpAmend = By.id("fieldName:RELATION.CODE:1");
	public static final By relCustomerCorpAmend = By.id("fieldName:REL.CUSTOMER:1");
	public static final By relCustomerAfterAmend = By.xpath("//tr[@mvlist='M_10.2_22.2']//td[@colspan = '13']");	
	public static final By performContract = By.xpath("//img[@title = 'Perform an action on the contract']");
	public static final By authoriseDeal = By.xpath("//img[@title = 'Authorises a deal']");
	
	public static final By cusRalInput = By.xpath("//input[@name = 'value:1:1:1']");
	public static final By cusRalFind = By.xpath("//a[@title = 'Run Selection']");
	public static final By respondEnq = By.id("enquiry_response");
	public static final By enqData = By.id("enquiryDataScroller");
	
	public static final By deleteDeal = By.xpath("//img[@title = 'Deletes a Deal']");
	public static final By transactionIdAmendSF = By.xpath("//input[@class = 'idbox idbox_CUSTOMER idbox_CUSTOMER_VMBINDIVAMENDSF']");
	
	public static final By gbFullNameAmend = By.xpath("//tr[@mvlist = 'M_3.2_3.2']//span[@class = 'disabled_dealbox disabled_dealbox_CUSTOMER disabled_dealbox_CUSTOMER_VMBCORPSMART']");
	public static final By gbShortNameAmend = By.xpath("//tr[@mvlist = 'M_2.2_2.2']//span[@class = 'disabled_dealbox disabled_dealbox_CUSTOMER disabled_dealbox_CUSTOMER_VMBCORPSMART']");
	public static final By contactNameExpand = By.xpath("//td[@mvdetails = 'M_220.2_224.2']//img[@title= 'Expand Sub Value']");
	public static final By contactNameExpand2 = By.xpath("//td[@mvdetails = 'M_220.3_224.3']//img[@title= 'Expand Sub Value']");
	public static final By contactNameExpand3 = By.xpath("//td[@mvdetails = 'M_220.4_224.4']//img[@title= 'Expand Sub Value']");
	
	public static final By contactName2 = By.id("fieldName:CONTACT.NAME:2");
	public static final By contactName3 = By.id("fieldName:CONTACT.NAME:3");
	public static final By contactName4 = By.id("fieldName:CONTACT.NAME:4");
	
	public static final By relatedPerson1 = By.id("fieldName:CONTACT.POS.LT:1");
	public static final By relatedPerson2 = By.id("fieldName:CONTACT.POS.LT:2");
	public static final By relatedPerson3 = By.id("fieldName:CONTACT.POS.LT:3");
	public static final By relatedPerson4 = By.id("fieldName:CONTACT.POS.LT:4");

	public static final By officeNumber2  = By.id("fieldName:CONTACT.OFFICE:2");
	public static final By officeNumber3  = By.id("fieldName:CONTACT.OFFICE:3");
	public static final By officeNumber4  = By.id("fieldName:CONTACT.OFFICE:4");
	
	public static final By mobileNumberCorp2 = By.id("fieldName:CONTACT.MOB:2");
	public static final By mobileNumberCorp3 = By.id("fieldName:CONTACT.MOB:3");
	public static final By mobileNumberCorp4 = By.id("fieldName:CONTACT.MOB:4");

	public static final By viewContactName2 =  By.xpath("//a[contains(text(),'Contact Name.2')]//ancestor::tr[@tabid]//span[contains(text(),'MR LINH DOAN 2')]");
	public static final By viewRelatedPerson2 =  By.xpath("//a[contains(text(),'Related person.2')]//ancestor::tr[@tabid]//span[contains(text(),'Director') and @style]");
	
	public static final By viewContactName2TC023 =  By.xpath("//a[contains(text(),'Contact Name.2')]//ancestor::tr[@tabid]//span[contains(text(),'MR LINH DOAN CA')]");
	public static final By viewRelatedPerson2TC023 =  By.xpath("//a[contains(text(),'Related person.2')]//ancestor::tr[@tabid]//span[contains(text(),'Chief Accountant') and @style]");
	public static final By viewContactName2TC024 =  By.xpath("//a[contains(text(),'Contact Name.2')]//ancestor::tr[@tabid]//span[contains(text(),'MR LINH DOAN')]");
	public static final By viewRelatedPerson2TC024 =  By.xpath("//a[contains(text(),'Related person.2')]//ancestor::tr[@tabid]//span[contains(text(),'Legal Reprensentative') and @style]");
	public static final By viewRelatedPerson2TC025 =  By.xpath("//a[contains(text(),'Related person')]//ancestor::tr[@tabid]//span[contains(text(),'Legal Reprensentative') and @style]");
	public static final By viewContactName2TC021 =  By.xpath("//a[contains(text(),'Contact Name.1')]//ancestor::tr[@tabid]//span[contains(text(),'MR LINH DOAN' )]");
	public static final By viewContactName2TC022 =  By.xpath("//a[contains(text(),'Contact Name.2')]//ancestor::tr[@tabid]//span[contains(text(),'MR LINH DOAN CA' )]");
	public static final By viewContactName4TC026 =  By.xpath("//a[contains(text(),'Contact Name.4')]//ancestor::tr[@tabid]//span[contains(text(),'MS THU THUY' )]");
	public static final By viewRelatedPerson4TC026 =  By.xpath("//a[contains(text(),' Related person.4')]//ancestor::tr[@tabid]//span[contains(text(),'Contact Person') and @style]");
	public static final By viewSector = By.xpath("//a[contains(text(),'Sector')]//ancestor::tr[@tabid]//span[contains(text(),'2401')and@style]");
	public static final By transactionIDUpdate = By.xpath("//input[@id = 'transactionId' and @class = 'idbox idbox_CUSTOMER idbox_CUSTOMER_VMBAMENDRELPRIOCUS']");
	public static final By transactionIDtc032 = By.xpath("//input[@id = 'transactionId' and @class = 'idbox idbox_CUSTOMER idbox_CUSTOMER_VMBAMENDTARGET']");
	public static final By PCPID = By.id("fieldName:PCP.ID");
	public static final By companyVip = By.id("fieldName:COMPANY.VIP");
	public static final By viewcompanyVip = By.xpath("//a[contains(text(),'COMPANY.VIP')]//ancestor::tr[@tabid]//span[contains(text(),'') and @style]");
	public static final By viewPCPID = By.xpath("//a[contains(text(),'PCP.ID')]//ancestor::tr[@tabid]//span[contains(text(),'') and @style]");
	public static final By transactionIdTC033 = By.xpath("//input[@id = 'transactionId' and @class = 'idbox idbox_ABBCUSTOMERUUTIEN idbox_ABBCUSTOMERUUTIEN_INPUT']");
	public static final By userT24 = By.id("fieldName:USER.T24");
	public static final By employeeID = By.id("fieldName:A01.00.07");
	public static final By userT24View = By.xpath("//a[contains(text(),'USER.T24')]//ancestor::tr[@tabid]//span[contains(text(),'') and @style]");
	public static final By employeeIDView = By.xpath("//a[contains(text(),'Employee ID')]//ancestor::tr[@tabid]//span[contains(text(),'') and @style]");
//	public static final String FIND_BTN = "//a[text()='Find']";
//	public static final String FIND_CRITERIA_DROP = "//input[@value='%s']/parent::td/following-sibling::td/select";
	public static final By enqShortName = By.xpath("//input[@value='SHORT.NAME']/parent::td/following-sibling::td/input[@type='text']");
	public static final By enqCoCode = By.xpath("//input[@value='CO.CODE']/parent::td/following-sibling::td/input[@type='text']");
	public static final By enqFindButton = By.xpath("//a[@title = 'Run Selection']");
	public static final By enqviewDetailButton = By.xpath("//img[@src='../plaf/images/default/enquiry/drill.gif']");
	public static final By enqShortNameRes = By.xpath("//a[contains(text(),'GB Short Name')]//ancestor::tr[@tabid]//span[@class = 'disabled_dealbox disabled_dealbox_CUSTOMER']");
	public static final By enqCoCodeRes = By.xpath("//a[contains(text(),'Company Book')]//ancestor::tr[@tabid]//span[@style]");
	public static final By cifRes = By.xpath("//span[@class = 'iddisplay iddisplay_CUSTOMER']");

}
