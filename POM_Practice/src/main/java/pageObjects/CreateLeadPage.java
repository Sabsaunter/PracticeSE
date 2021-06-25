package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import commonFunctions.CommonFunctions;

public class CreateLeadPage extends CommonFunctions{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage ClickCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		return this;
		
	}

	public CreateLeadPage enterLeadDetails() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Approve");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(" ");
		
		return this;
	}
	
	
	public ViewLead clickSubmitButton() {
		
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLead(driver);
		
	}
	
	
}
