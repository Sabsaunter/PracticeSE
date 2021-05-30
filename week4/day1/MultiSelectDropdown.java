package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement multiSelect1 = driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[1]"));
		WebElement multiSelect2 = driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[4]"));
		
		Actions multiOptionSelect = new Actions(driver);
		
		multiOptionSelect.keyDown(Keys.CONTROL).click(multiSelect1).click(multiSelect2).keyUp(Keys.CONTROL).perform();
	}

}
