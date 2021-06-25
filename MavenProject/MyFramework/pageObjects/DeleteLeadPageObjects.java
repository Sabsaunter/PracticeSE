package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteLeadPageObjects {
	
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
	
	@FindBy(linkText = "Delete")
	public static WebElement DeleteButton;
	
	@FindBy(xpath = "//input[@name='id']")
	public static WebElement LeadIdField;
	
	@FindBy(className = "x-paging-info")
	public static WebElement GetPageInfo;
	
	}
