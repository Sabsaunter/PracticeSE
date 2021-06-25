package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import commonFunctions.CommonFunctions;

public class LoginPage extends CommonFunctions {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUsername() {

		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		
		return this;

	}

	public LoginPage enterPassword() {

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		return this;
	}

	public HomePage clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();

		return new HomePage(driver);
	}

	
}
