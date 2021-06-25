package commonSteps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static WebDriver driver = null;
	public static Properties properties = null;
	
	Logger logger = Logger.getLogger(CommonFunctions.class);

	public Properties loadPropertyFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("./MyFramework/config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		logger.info("Execution Begin");
		PropertyConfigurator.configure("./MyFramework/Log4j.properties");
		logger.info("Loading Property File");
		loadPropertyFile();
		
		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("driverlocation");
		String url = properties.getProperty("applicationurl");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation+"chromedriver.exe");
			logger.info("Launching Chrome");
			driver = new ChromeDriver();
			driver.get(url);
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation+"geckodriver.exe");
			logger.info("Launching FireFox");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		logger.info("Execution Completed. Closing the Browser");
		driver.quit();

	}

}
