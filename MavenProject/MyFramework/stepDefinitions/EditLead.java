package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import commonSteps.CommonFunctions;
import pageObjects.EditLeadPageObjects;

public class EditLead extends CommonFunctions {

	String newCompanyName = null;

	Logger logger = Logger.getLogger(EditLead.class);
	
	public void FindLead() throws InterruptedException {
		
		logger.info("Finding the Lead");

		EditLeadPageObjects.FindLeads.click();
		EditLeadPageObjects.Phone.click();
		EditLeadPageObjects.PhoneNumberBox.sendKeys(" ");
		EditLeadPageObjects.FindLeads.click();

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions
//				.invisibilityOfElementLocated(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		
		Thread.sleep(3000);
		
		logger.info("Click on first lead link");

		EditLeadPageObjects.GetFirstLead.click();

	}

	public void EditTheLead() {
		
		logger.info("Click on Edit Button");

		EditLeadPageObjects.ClickEditButton.click();
		EditLeadPageObjects.updateLeadForm_companyName.clear();
		EditLeadPageObjects.updateLeadForm_companyName.sendKeys("CTS");
		
		logger.info("Click on update button");
		
		EditLeadPageObjects.UpdateButton.click();
		
		logger.info("Get New Company Name");
		
		newCompanyName = EditLeadPageObjects.NewCompanyName.getText();

	}

	@Test
	public void VerifyEditLead() throws InterruptedException {
		PageFactory.initElements(driver, EditLeadPageObjects.class);
		
		logger.info("Edit Lead Test Case Execution Begin");
		
		FindLead();
		EditTheLead();
		
		logger.info("Verifying Edited Lead");
		
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(newCompanyName, "CTS");
		
		logger.info("Edit Lead Test Case Execution Completed");

	}

}
