package other.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BbcWeather {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sabap\\\\Documents\\\\SE\\\\Softwares\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/weather");
		WebElement searchbox =driver.findElement(By.id("ls-c-search__input-label"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(searchbox).click().sendKeys(searchbox, "Chennai");
		seriesOfActions.perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'location-list\']/li[1]/a/span")).click();

	}

}
