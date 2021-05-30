package week3.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("c");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
		driver.findElement(By.xpath("//td[text()='9']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(2000);
		String busFound = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Total No. of. Buses available: "+busFound);
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label[1]")).click();
		String sleeperBusFound = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Total No. of. Sleeper Buses available: "+sleeperBusFound);
		driver.findElement(By.xpath("//input[@id='bt_AC']/following-sibling::label[1]")).click();
		String acBusFound = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Total No. of. A/C Buses available: "+acBusFound);
		
	}

}
