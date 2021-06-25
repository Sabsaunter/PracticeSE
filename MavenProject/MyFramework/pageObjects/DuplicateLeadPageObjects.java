package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DuplicateLeadPageObjects {
	
	@FindBy(linkText = "Find Leads")
	public static WebElement FindLeadLink;
	
	@FindBy(xpath = "//span[text()='Phone']")
	public static WebElement PhoneTab;
	
	@FindBy(xpath = "//input[@name='phoneNumber']")
	public static WebElement PhoneNumberField;
	
	@FindBy(xpath = "//button[text()='Find Leads']")
	public static WebElement ClickFindLeadsButton;
	
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	public static WebElement ClickFirstLead;
	
	@FindBy(id="viewLead_companyName_sp")
	public static WebElement GetFirstLeadCompany;
	
	@FindBy(linkText = "Duplicate Lead")
	public static WebElement ClickDuplicateLead;
	
	@FindBy(name = "submitButton")
	public static WebElement submitButton;
	
}
