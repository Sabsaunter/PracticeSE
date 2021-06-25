package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonSteps.CommonFunctions;
import pageObjects.CreateLeadPageObjects;
import pageObjects.LoginPageObjects;

public class CreateLead extends CommonFunctions{
	
	Logger logger = Logger.getLogger(CreateLeads.class);
	
	public void Login() {
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		logger.info("Login into Application");
		
		LoginPageObjects.username.sendKeys(properties.getProperty("username"));
		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
		LoginPageObjects.decorativeSubmit.click();
		LoginPageObjects.crmsfaLink.click();
		
		logger.info("Click Leads Link");
		
		LoginPageObjects.Leads.click();
	}
	
	public void CreateLeadOperations() {
		
		PageFactory.initElements(driver, CreateLeadPageObjects.class);
		
		logger.info("Creating New Lead");
		
		CreateLeadPageObjects.createLead.click();
		CreateLeadPageObjects.createLeadForm_companyName.sendKeys("TCS");
		CreateLeadPageObjects.createLeadForm_firstName.sendKeys("Test");
		CreateLeadPageObjects.createLeadForm_lastName.sendKeys("Approve");
		CreateLeadPageObjects.createLeadForm_primaryPhoneNumber.sendKeys(" ");
		CreateLeadPageObjects.submitButton.click();
		
	}
	
	@Test
	public void CreatingLead() {
		
		Login();
		logger.info("Create Lead Test Case Execution Begin");
		CreateLeadOperations();
		
		logger.info("Create Lead Test Case Execution Completed");
		
	}

}
