package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day1.BaseClass;
import week5.day2.WorkingWithExcel;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "getData")
	public void runCreateLead(String CompanyName, String FirstName, String LastName, String PrimaryPhoneNumber) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PrimaryPhoneNumber);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(name = "getData")
	public String[][] getData() throws IOException {

		WorkingWithExcel wwe = new WorkingWithExcel();
		return wwe.readExcel("CreateLead");
				
					}

				
	
}
		





