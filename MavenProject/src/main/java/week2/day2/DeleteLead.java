package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
//		Keyin username and password
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("crmsfa");
		
//		click on login button
		driver.findElement(By.xpath("//*[@class='decorativeSubmit']")).click();
		
//		click on CRM/SFA Link
		driver.findElement(By.xpath("//*[contains(text(),'CRM/')]")).click();
		
//		Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
//		Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
//		Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
//		Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys(" ");
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9092467493");
		
//		Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
//		Capture lead ID of First Resulting lead
		String textFirstLead = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr[1]/td[1]/div[1]/a[1]")).getText();
		System.out.println("Capture First Lead is: "+textFirstLead);
		
//		Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr[1]/td[1]/div[1]/a[1]")).click();
		
//		Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
//		Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
//		Enter captured lead ID
		driver.findElement(By.xpath("//div[@class='x-tab-panel-bwrap']//input[@name='id']")).sendKeys(textFirstLead);
		//driver.findElement(By.xpath("//div[@class='x-tab-panel-bwrap']//input[@name='id']")).sendKeys("10086");
		
//		Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
//		Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		
		if (displayed==true) {
			
			System.out.println("No records available for the search");
			
		}
		
		else
			System.out.println("There are records to display");
		
//		Close the browser (Do not log out)
		driver.close();

	}

}
