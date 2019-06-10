package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

public class GeneralStepDefinition extends base {
	

	
	//Browser initialize

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();

	}
	
	//Navigate to a page

	@And("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) throws Throwable {
		driver.get(arg1);
		driver.manage().window().maximize();
		//url = getUrl();
         
	}
	
	
    

	
	//Close browser
	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

}
