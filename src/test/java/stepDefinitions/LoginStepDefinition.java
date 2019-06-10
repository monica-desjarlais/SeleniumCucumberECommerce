package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

public class LoginStepDefinition extends base {
	
 
	//page objects 

	LoginPage lp = new LoginPage(driver);
	
	

  

	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
    	
		// log in
		lp.getAccountLink().click();
		lp.getLogin().click();
		lp.getEmail().clear();
		lp.getEmail().sendKeys(username);
		lp.getPassword().clear();
		lp.getPassword().sendKeys(password);
		lp.getLoginBtn().click();
	}
    
    
  

	@Then("^Verify user is logged in or error message displays$")
	public void verify_that_user_is_logged_in() throws Throwable {
		
		
		if (driver.getTitle().contains("My Account")) {
			
			System.out.println("Login successful");
			
		} else {
			String error=lp.getError().getText();
			System.out.println(error);
		}
		
		
						

	}
	
	
	


	
	

}
