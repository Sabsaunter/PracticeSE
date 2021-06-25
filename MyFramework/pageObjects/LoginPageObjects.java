package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	
	@FindBy(id = "username")
	public static WebElement username;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(className = "decorativeSubmit")
	public static WebElement decorativeSubmit;
	
	@FindBy(linkText = "CRM/SFA")
	public static WebElement crmsfaLink;
	
	@FindBy(linkText = "Leads")
	public static WebElement Leads;
	
	
}
