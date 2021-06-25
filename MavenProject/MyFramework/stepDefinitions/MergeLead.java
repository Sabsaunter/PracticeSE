package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import commonSteps.CommonFunctions;
import pageObjects.MergeLeadPageObjects;

public class MergeLead extends CommonFunctions{
	
	public String leadId=null;
	public String reqText=null;
	
	Logger logger = Logger.getLogger(MergeLead.class);
	
	public void FromLead() throws InterruptedException {
		
		logger.info("Keying in value for from Lead field");
		MergeLeadPageObjects.MergeLeads.click();
		MergeLeadPageObjects.FromLeadImage.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		
		MergeLeadPageObjects.FirstNameField.sendKeys("Vel");
		MergeLeadPageObjects.ClickFindLeadsButton.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions
//				.invisibilityOfElementLocated(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		Thread.sleep(3000);
		leadId=MergeLeadPageObjects.GetFirstLead.getText();
		
		driver.switchTo().window(allhandles.get(0));
		
	}
	
	public void ToLead() throws InterruptedException {
		
		logger.info("Keying in value for To Lead field");
		
		MergeLeadPageObjects.ToLeadImage.click();
		
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		
		MergeLeadPageObjects.FirstNameField.sendKeys("Babu");
		MergeLeadPageObjects.ClickFindLeadsButton.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions
//				.invisibilityOfElementLocated(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		Thread.sleep(3000);
		driver.switchTo().window(allhandles2.get(0));
	}
	
	public void MergingLead() {
		
		logger.info("Merging Lead");
		
		MergeLeadPageObjects.MergeButton.click();
		driver.switchTo().alert().accept();
		
		MergeLeadPageObjects.FindLeads.click();
		MergeLeadPageObjects.createLead.sendKeys(leadId);
		MergeLeadPageObjects.ClickFindLeadsButton.click();
		reqText=MergeLeadPageObjects.GetPageInfo.getText();
		
	}
	
	@Test
	public void VerifyMergedLead() throws InterruptedException {
		
		logger.info("Merge Lead Test Case Execution Begin");
		
		PageFactory.initElements(driver, MergeLeadPageObjects.class);
		FromLead();
		ToLead();
		MergingLead();
		
		logger.info("Verifying Merging Lead");
		
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(reqText, "No records to display");
		
		logger.info("Merge Lead Test Case Execution Completed");
				
	}




}
