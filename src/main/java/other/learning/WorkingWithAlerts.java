package other.learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sabap\\\\Documents\\\\SE\\\\Softwares\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button")).click();
		Alert alertBox = driver.switchTo().alert();
		alertBox.accept();
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
		Alert confirmBox=driver.switchTo().alert();
		confirmBox.dismiss();
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button")).click();
		Alert promptBox=driver.switchTo().alert();
		promptBox.sendKeys("Value inserted");
		promptBox.accept();
		
		driver.findElement(By.xpath("//*[@id=\'btn\']")).click();
		Alert sweetAlertBox = driver.switchTo().alert();
		((WebElement) sweetAlertBox).click();

	}

}
