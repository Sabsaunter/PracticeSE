package pageObjects;

import org.openqa.selenium.By;

import commonFunctions.CommonFunctions;

public class LeadsPage extends CommonFunctions{
	
	public CreateLeadPage Leads() {
		
		driver.findElement(By.linkText("Leads")).click();
		
		return new CreateLeadPage(driver);
	}

}
