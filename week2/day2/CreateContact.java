package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
	//Keyin username and password
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("DemoSalesManager");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("crmsfa");
		
	//click on login button
		//driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@class='decorativeSubmit']")).click();
		
	//click on CRM/SFA Link
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CRM/')]")).click();
		
	//Click on contacts Button
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 
//		 Click on Create Contact
		 driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		 
//		 Enter FirstName Field Using id Locator
		 driver.findElement(By.id("firstNameField")).sendKeys("Tester");
		 
//		 Enter LastName Field Using id Locator
		 driver.findElement(By.id("lastNameField")).sendKeys("Approved");
		 
//		 Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Tester");
		 
//		 Enter LastName(Local) Field Using id Locator
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Approved");
		 
//		 Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mech");
		 
//		 Enter Description Field Using any Locator of your choice 
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Hello Everyone");
		 
//		 Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@gmail.com");
		 
//		 Select State/Province as NewYork Using Visible Text
		 WebElement stateDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select stateDropdown1=new Select(stateDropdown);
		 stateDropdown1.selectByVisibleText("New York");
		 
//		 Click on Create Contact
		 driver.findElement(By.name("submitButton")).click();
		 
//		 Click on edit button 
		 driver.findElement(By.linkText("Edit")).click();
		 
//		 Clear the Description Field using .clear
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 
//		 Fill ImportantNote Field with Any text
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated");
		 
//		 Click on update button using Xpath locator
		 driver.findElement(By.xpath("//input[@name='submitButton'][@value='Update']")).click();
		 
//		 Get the Title of Resulting Page.
		// WebElement titleText = driver.findElement(By.xpath("//body[@class=' ext-safari']"));
		 String titleText = driver.getTitle();
		 System.out.println("Page Title is: "+titleText);
		 
		 driver.close();
	}

}
