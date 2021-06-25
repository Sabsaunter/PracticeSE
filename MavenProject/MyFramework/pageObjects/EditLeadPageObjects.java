package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditLeadPageObjects {
	
	@FindBy(linkText = "Find Leads")
	public static WebElement FindLeads;
	
	@FindBy(xpath = "//span[text()='Phone']")
	public static WebElement Phone;
	
	@FindBy(xpath = "//input[@name='phoneNumber']")
	public static WebElement PhoneNumberBox;
	
	@FindBy(xpath = "//button[text()='Find Leads']")
	public static WebElement ClickFindLeadsButton;
	
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	public static WebElement GetFirstLead;
	
	@FindBy(linkText = "Edit")
	public static WebElement ClickEditButton;
	
	@FindBy(id = "updateLeadForm_companyName")
	public static WebElement updateLeadForm_companyName;
	
	@FindBy(xpath = "//input[@value='Update']")
	public static WebElement UpdateButton;
	
	@FindBy(xpath="//span[@id='viewLead_companyName_sp']")
	public static WebElement NewCompanyName;
		
	
}
