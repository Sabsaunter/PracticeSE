package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import commonFunctions.CommonFunctions;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ViewLead extends CommonFunctions{
	
	public ViewLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ViewLead VerifyFirstname() {
		
		String firstName=driver.findElement(By.xpath("//span[@id=\'viewLead_companyName_sp\']")).getText();
		
		Assert.assertEquals(firstName, "TCS");
		
		return this;
	}

}
