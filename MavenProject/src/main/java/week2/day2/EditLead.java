package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
//		Key-in Username and password
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
		
//		Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Tester");
		
//		Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
//		Thread.sleep(5000);
//		Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr[1]/td[1]/div[1]/a[1]")).click();
		
//		Verify title of the page
		String title = driver.getTitle();
		System.out.println("Page Title is: "+title);
		
//		Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
//		Change the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("New Test Company");
				
//		Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
//		Confirm the changed name appears
		String newCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("New Company Name is: "+newCompanyName);
		
		if (newCompanyName.contains("New Test Company")) {
			System.out.println("Company Updated sucessfully");
		}else
			System.out.println("New Company Name not updated");
		
//		Close the browser (Do not log out)
		driver.close();

	}

}
