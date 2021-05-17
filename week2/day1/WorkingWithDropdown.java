package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropdown {
	
	public static void main(String[] args) {
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
		
	//Enter Values for Company Name and Forename
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tester");
		
	//Select Health Care option from Industry Drop Down
		WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select idd = new Select(industryDropdown);
		idd.selectByValue("IND_HEALTH_CARE");
		
	//Click on Create Lead Button
		//driver.findElement(By.className("smallSubmit")).click();
		
		//Thread.sleep(600);
		
		//driver.close();

}
}
