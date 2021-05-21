package other.learning;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		//driver.findElement(ById.name("q")).sendKeys("leafground" + Keys.ENTER);
		//driver.findElement(By.linkText("TestLeaf - Selenium Playground")).click();
		//driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a")).click();
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("test@gmail.com");
		
		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("Test");
		
		WebElement defaultBox=driver.findElement(By.name("username"));
				String value = defaultBox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disabledBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled=disabledBox.isEnabled();
		System.out.println(enabled);
		//driver.quit();

		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\geckodriver.exe");
		 * 
		 * WebDriver driverf = new FirefoxDriver();
		 * driverf.get("https://www.google.com/"); driverf.quit();
		 */
		 
	}

}
