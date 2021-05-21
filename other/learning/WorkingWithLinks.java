package other.learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		String linkContent = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("Required link is: "+linkContent);
		
		String brokenLink = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		if (brokenLink.contains("error")) {
			
			System.out.println("Link is broken and the link is: "+brokenLink);
			
		}
		else
			System.out.println("It is a proper Link and the link is: "+brokenLink);
		
		int sizeLink = driver.findElements(By.tagName("a")).size();
		System.out.println("No of Links in this page is: "+sizeLink);
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/a")).click();
		
	}

}
