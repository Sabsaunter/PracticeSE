package other.learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkingWithCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[5]/input")).click();
		
		boolean selected = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input")).isSelected();
		System.out.println("Selected: "+selected);
		
		WebElement notChecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if (notChecked.isSelected()) {
			notChecked.click();			
		}
		WebElement checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if (checked.isSelected()) {
			checked.click();			
		}
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[5]/input")).click();
	//driver.close();
	}
	}
