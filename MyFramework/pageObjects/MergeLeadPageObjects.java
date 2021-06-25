package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MergeLeadPageObjects {
	
	@FindBy(linkText = "Merge Leads")
	public static WebElement MergeLeads;
	
	@FindBy(xpath = "//img[@alt='Lookup']")
	public static WebElement FromLeadImage;
	
	@FindBy(xpath = "//input[@name='firstName']")
	public static WebElement FirstNameField;
	
	@FindBy(xpath = "//button[text()='Find Leads']")
	public static WebElement ClickFindLeadsButton;
	
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	public static WebElement GetFirstLead;
	
	@FindBy(xpath = ("(//img[@alt='Lookup'])[2]"))
	public static WebElement ToLeadImage;
	
	@FindBy(xpath = "//a[text()='Merge']")
	public static WebElement MergeButton;
	
	@FindBy(linkText = "Find Leads")
	public static WebElement FindLeads;
	
	@FindBy(xpath = "//input[@name='id']")
	public static WebElement createLead;
	
	@FindBy(xpath = "//input[@name='id']")
	public static WebElement LeadIdField;
	
	@FindBy(className = "x-paging-info")
	public static WebElement GetPageInfo;
		
}
