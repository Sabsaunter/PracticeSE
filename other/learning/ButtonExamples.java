package other.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabap\\Documents\\SE\\Softwares\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1. Get Position
		
		WebElement getPosition= driver.findElement(By.id("position"));
		Point xyPoint=getPosition.getLocation();
		int xPoint=xyPoint.getX();
		int yPoint=xyPoint.getY();
		System.out.println("X Point Value is: "+xPoint+ " Y Point Value is: "+yPoint);
		
		//2. Get Color
		
		WebElement getColor= driver.findElement(By.id("color"));
		String color=getColor.getCssValue("background-color");
		System.out.println("Button Color is: "+color);
		
		//3. Get Size
		WebElement getSize= driver.findElement(By.id("size"));
		int buttonHeight=getSize.getSize().getHeight();
		int buttonWidth=getSize.getSize().getWidth();
		System.out.println("Button Height is: "+buttonHeight+"Button Width is: "+buttonWidth);
		
		//4. Go to Home
		WebElement goToHome= driver.findElement(By.id("home"));
		goToHome.click();
		
	}

}
