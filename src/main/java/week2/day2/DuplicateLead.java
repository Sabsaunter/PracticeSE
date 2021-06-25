package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		
//		Click on email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
//		Enter email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(" ");
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9092467493");
		
//		Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
//		Capture lead ID of First Resulting lead
		String textFirstLead = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr[1]/td[1]/div[1]/a[1]")).getText();
		System.out.println("Capture First Lead is: "+textFirstLead);
		
		Thread.sleep(5000);
//		Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr[1]/td[1]/div[1]/a[1]")).click();
		String newCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("New Company Name is: "+newCompany);
		
//		Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
//		Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
//		Click Create Lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
//		Confirm the duplicated lead name is same as captured name
		String newCompany1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Duplicate Company Name is: "+newCompany1);
		
		if (newCompany==newCompany1) {
			System.out.println("duplicated lead name is same as captured name");
		}else
			System.out.println("duplicated lead name is not same as captured name");
		
//		Close the browser (Do not log out)
		driver.close();

	}

}
