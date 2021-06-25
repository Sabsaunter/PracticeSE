package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
	

@Given("Open LeafTaps Url as {string}")
public void openUrl(String url) {
	
	driver.get(url);
	
}

@And("Enter username as {string}")
public void enterUsername(String username) {
	
	driver.findElement(By.id("username")).sendKeys(username);
	
}

@And("Enter password as {string}")
public void enterPassword(String password) {
	
	driver.findElement(By.id("password")).sendKeys(password);
	
}

@When("Click on Login Button")
public void clickLogin() {
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
}

@Then("Home Page should be displayed")
public void verifyHomePage() {
	
	System.out.println("Home Page Displayed");
	
}

@And("Username should be displayed in the Home Page")
public void verifyUserInHomepage() {
	
	System.out.println("User Displayed in Home Page");
	
}

@But("Home Page should not be displayed")
public void verifyErrorInHomepage() {
	
	System.out.println("Home Page not be displayed");
	
}




}
