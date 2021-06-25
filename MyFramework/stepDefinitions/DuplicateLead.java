package stepDefinitions;

import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import commonSteps.CommonFunctions;
import pageObjects.DuplicateLeadPageObjects;


public class DuplicateLead extends CommonFunctions {
	
	public String oldCompanyName =null;
	public String newCompanyName =null;
	
	Logger logger = Logger.getLogger(DuplicateLead.class);
	
	public void FindLead() throws InterruptedException {
		
		logger.info("Finding Lead");

		DuplicateLeadPageObjects.FindLeadLink.click();
		DuplicateLeadPageObjects.PhoneTab.click();
		DuplicateLeadPageObjects.PhoneNumberField.sendKeys(" ");
		DuplicateLeadPageObjects.ClickFindLeadsButton.click();

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions
//				.invisibilityOfElementLocated(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		
		Thread.sleep(3000);
		
		logger.info("Click first lead link");
		
		DuplicateLeadPageObjects.ClickFirstLead.click();
		
		logger.info("Getting Old Company Name");
		
		oldCompanyName=DuplicateLeadPageObjects.GetFirstLeadCompany.getText();
	}
		
	public void DuplicateLeadOperation() {
		
		logger.info("Click on Duplicate Lead Button");
		
		DuplicateLeadPageObjects.ClickDuplicateLead.click();
		DuplicateLeadPageObjects.submitButton.click();
		
		logger.info("Getting New Company Name");
		
		newCompanyName=DuplicateLeadPageObjects.GetFirstLeadCompany.getText();
	}
		
		@Test
		public void VerifyDuplicateLead() throws InterruptedException {
			PageFactory.initElements(driver, DuplicateLeadPageObjects.class);
			
			logger.info("Duplicate Lead Test Case Execution Begin");
			
			FindLead();
			DuplicateLeadOperation();
			
			logger.info("Verifying Duplicate Lead");
			
			SoftAssert assert1 = new SoftAssert();
			assert1.assertEquals(newCompanyName, oldCompanyName);
			
			logger.info("Duplicate Lead Test Case Execution Completed");
					
		}

}
