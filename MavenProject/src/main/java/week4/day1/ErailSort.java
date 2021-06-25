package week4.day1;

import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSort {

			public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://erail.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
			driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MS",Keys.TAB);
			driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
			driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU",Keys.TAB);
			driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
			List<WebElement> rows= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
			int rowCount=rows.size();
			List<String> trainName = new ArrayList<String> ();
			
			for (int i = 1; i < rowCount; i++) {
				
				String train = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
				trainName.add(train);
									
									}
			
			Set<String> setTrain = new LinkedHashSet<String>(trainName); 
			
						
			if (trainName.size()==setTrain.size()) {
				
				System.out.println("No Duplicate train");
				
			}else
				System.out.println("There is Duplicate train");
			
			Set<String> setTrain1 = new LinkedHashSet<String>();
			for (String eachName : trainName) {
				
				if (!setTrain1.add(eachName)) {
					
					System.out.println("Duplicate Train Name is: "+eachName);
					
				}
				
			}
			
			}
}


