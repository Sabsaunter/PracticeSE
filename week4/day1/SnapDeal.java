package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement fashion = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[2]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(fashion).click(fashion).perform();
		Thread.sleep(1000);
		WebElement shirt = driver.findElement(By.xpath("(//span[text()='Shirts'])[2]"));
		builder.moveToElement(shirt).click(shirt).perform();
		
		WebElement firstElement = driver.findElement(By.xpath("(//span[contains(@id,'display-price')])[1]"));
		builder.moveToElement(firstElement).click(driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"))).perform();
		
//		builder.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'close close1 mar')]"))).click(driver.findElement(By.xpath("//div[contains(@class,'close close1 mar')]"))).perform();
	}

}
