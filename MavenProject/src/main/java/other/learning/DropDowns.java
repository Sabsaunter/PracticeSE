package other.learning;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\'dropdown1\']"));
		Select dropDown1Box=new Select(dropDown1);
		dropDown1Box.selectByIndex(1);
		
		WebElement dropDown2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/select"));
		Select dropDown2Box=new Select(dropDown2);
		dropDown2Box.selectByVisibleText("Selenium");
		
		WebElement dropDown3 = driver.findElement(By.xpath("//*[@id=\'dropdown3\']"));
		Select dropDown3Box=new Select(dropDown3);
		dropDown3Box.selectByValue("3");
		
		int size = driver.findElements(By.xpath("//select[@class='dropdown']/option")).size();
		//Select dropDown4Box=new Select(dropDown4);
		//List<WebElement> dropDown4size = dropDown4Box.getOptions();
		System.out.println("No of Slections available are: "+size);
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select")).sendKeys("Selenium");
		
//		WebElement dropDown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
//		Select dropDown5Box=new Select(dropDown5);
//		dropDown5Box.selectByIndex(1);
//		dropDown5Box.selectByIndex(2);
//		dropDown5Box.selectByIndex(3);
		
		WebElement dropDown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		List<WebElement> element= driver.findElements(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option"));
		int size2=element.size();
		Select dropDown5Box=new Select(dropDown5);
		System.out.println(size2);
		
		for (int i = 0; i < size2; i++) {
			
			dropDown5Box.selectByIndex(i);			
		}
		
	}

}
