package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadPageObjects {
	
	@FindBy(linkText = "Create Lead")
	public static WebElement createLead;
	
	@FindBy(id = "createLeadForm_companyName")
	public static WebElement createLeadForm_companyName;
	
	@FindBy(id = "createLeadForm_firstName")
	public static WebElement createLeadForm_firstName;
	
	@FindBy(id = "createLeadForm_lastName")
	public static WebElement createLeadForm_lastName;
	
	@FindBy(id = "createLeadForm_primaryPhoneNumber")
	public static WebElement createLeadForm_primaryPhoneNumber;
	
	@FindBy(name = "submitButton")
	public static WebElement submitButton;
	

}
