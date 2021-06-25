package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonSteps.CommonFunctions;
import pageObjects.DeleteLeadPageObjects;

public class DeleteLead extends CommonFunctions{

	public String leadID = null;
	public String reqText=null;
	
	Logger logger = Logger.getLogger(DeleteLead.class);

	public void FindLead() throws InterruptedException {
		
		logger.info("Finding Lead");

		DeleteLeadPageObjects.FindLeads.click();
		DeleteLeadPageObjects.Phone.click();
		DeleteLeadPageObjects.PhoneNumberBox.sendKeys(" ");
		
		
		
		DeleteLeadPageObjects.FindLeads.click();

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions
//				.invisibilityOfElementLocated(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		
		Thread.sleep(3000);
		
		logger.info("Getting first lead ID");
		
		leadID = DeleteLeadPageObjects.GetFirstLead.getText();
		
		logger.info("Clicking first lead Link");
		
		DeleteLeadPageObjects.GetFirstLead.click();

	}

	public void DeleteTheLead() {

		logger.info("Clicking Delete Lead Button");
		
		DeleteLeadPageObjects.DeleteButton.click();
		DeleteLeadPageObjects.FindLeads.click();
		
		logger.info("Passing lead ID");
		
		DeleteLeadPageObjects.LeadIdField.sendKeys(leadID);
		DeleteLeadPageObjects.ClickFindLeadsButton.click();
		reqText=DeleteLeadPageObjects.GetPageInfo.getText();
		

	}

	@Test
	public void VerifyDeleteLead() throws InterruptedException {
		PageFactory.initElements(driver, DeleteLeadPageObjects.class);
		
		logger.info("Delete Lead Test Case Execution Begin");
		
		FindLead();
		DeleteTheLead();
		
		logger.info("Verifying Delete Lead");
		
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(reqText, "No records to display");
		
		logger.info("Delete Lead Test Case Execution Begin");

	}
	
}
