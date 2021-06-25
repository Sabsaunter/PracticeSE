package stepDefinitions;

import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.LoginPage;

public class LoginAndLogout extends CommonFunctions{
	
	@Test
	public void runCreateLead() {
		
		new LoginPage(driver).enterUsername().enterPassword().clickLogin();
		
	}

}
