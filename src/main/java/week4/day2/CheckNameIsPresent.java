package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckNameIsPresent {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert promptBox=driver.switchTo().alert();
		promptBox.sendKeys("Saba");
		promptBox.accept();
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		if (text.contains("saba")) {
			
			System.out.println("Expected Text is present");
			
		}else
			System.out.println("Expected Text is not there");
		
	}

}
