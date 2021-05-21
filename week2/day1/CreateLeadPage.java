package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.GetElementText;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	//Keyin username and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
	//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
	//click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	//click on Create Lead Tab
		driver.findElement(By.linkText("Create Lead")).click();
		
	//Enter Values for all the fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Approved");
		
		//Select Conference option from Source Drop Down
				WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select sdd = new Select(sourceDropdown);
				sdd.selectByVisibleText("Conference");
		
		//Select Health Care option from Marketing campaign Drop Down
				WebElement marketingDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select mdd = new Select(marketingDropdown);
				mdd.selectByVisibleText("Demo Marketing Campaign");
				
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tester");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Approved");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/13/92");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mech");
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("7,65,000");
				
		//Select INR option from Preferred Currency Drop Down
				WebElement currencyDropdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
				Select cdd = new Select(currencyDropdown);
				cdd.selectByVisibleText("INR - Indian Rupee");
				
		//Select Health Care option from Industry Drop Down
				WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select idd = new Select(industryDropdown);
				idd.selectByValue("IND_HEALTH_CARE");
		
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("785");
				
		//Select Partnership option from ownership Drop Down
				WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select odd = new Select(ownershipDropdown);
				odd.selectByVisibleText("Partnership");
		
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("564ME");
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Green");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead with above information");
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Approved");
		
		//Contact Informations		
				driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("057");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04565");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("276052");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("04565");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Tester");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://tester_testapproved.com");
			
				
		//Primary Address
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Tester");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Tester");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("1 ABC Colony");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("630106");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Testing company street");
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("630106");
				
				//Select India option from Country Drop Down
				WebElement countryDropdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select coundd = new Select(countryDropdown);
				coundd.selectByVisibleText("India");
				
				//Select Tamilnadu option from State Drop Down
				WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select statedd = new Select(stateDropdown);
				Thread.sleep(1000);
				statedd.selectByVisibleText("TAMILNADU");
				
		//Click on Create Lead Button
				driver.findElement(By.className("smallSubmit")).click();	
				
		//click on duplicate lead button
				driver.findElement(By.linkText("Duplicate Lead")).click();
				
		//Replace company name				
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Testing Company");
				
		//Click on Create Lead Button
				driver.findElement(By.className("smallSubmit")).click();	
				
		//Get Company Name and Verify it
				String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				
				System.out.println("New Company Name is:"+companyName);
				
				String companyName2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				
				if (companyName==companyName2) {
					
					System.out.println("Company name has been updated sucessfully");
					
				}else
					System.out.println("Company name not updated");
				
		
		//Thread.sleep(600);
		
		driver.close();

}
}
