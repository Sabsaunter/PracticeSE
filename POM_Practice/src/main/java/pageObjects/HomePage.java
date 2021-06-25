package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import commonFunctions.CommonFunctions;

public class HomePage extends CommonFunctions{
	
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage clickCrmsfaLink() {

		driver.findElement(By.linkText("CRM/SFA")).click();

		return new CreateLeadPage(driver);
	}

}
