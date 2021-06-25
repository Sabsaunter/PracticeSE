package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day1.BaseClass;
import week5.day2.WorkingWithExcel;


public class EditLead extends BaseClass{

	@Test(dataProvider = "getData",dependsOnMethods = {"testcase.CreateLead.runCreateLead"})
	public void runEditLead(String phoneNumber,String companyName) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name = "getData")
	public String[][] getData() throws IOException {
	WorkingWithExcel wwe = new WorkingWithExcel();
	return wwe.readExcel("EditLead");
}
}






