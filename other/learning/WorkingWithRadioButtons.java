package other.learning;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkingWithRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		driver.findElement(By.xpath("//*[@id=\'first\']/label[1]")).click();
		WebElement unChecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]"));
		//WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]"));
		
		boolean unCheckedRadio = unChecked.isSelected();
		//boolean checkedRadio = checked.isSelected();
		
		if(unCheckedRadio==true) {
			System.out.println("UnChecked Radio Button is selected as default");
		}
		else
			System.out.println("Checked Radio Button is selected as default");
	}

}
