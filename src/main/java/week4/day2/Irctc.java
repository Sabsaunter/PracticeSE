package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wind = new ArrayList<String>(windowHandles);
		int size=wind.size();
		System.out.println(size);
		WebDriver flightScreen=driver.switchTo().window(wind.get(1));
		
		File source=((TakesScreenshot) flightScreen).getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/FlightScreen.png");
		FileUtils.copyToDirectory(source, target);
		
		driver.switchTo().window(wind.get(size-1)).close();
		
		
			}

}
