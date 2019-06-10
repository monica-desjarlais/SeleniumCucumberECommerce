package stepDefinitions;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.CompareValidation;
import resources.base;

public class CompareProductsStepDefin extends base {

	// page objects

	LandingPage lp = new LandingPage(driver);
	CompareValidation cv = new CompareValidation(driver);


    @When("^click on add to compare for two mobiles$")
    public void click_on_add_to_compare_for_two_mobiles() throws Throwable {

		// click on Add to Compare for Sony Xperia
		cv.getCompareLink().click();

		// click on Add to Compare for IPhone
		cv.getCompareLink2().click();

	}

    @Then("^verify the products are reflected in the popup window$")
    public void verify_the_products_are_reflected_in_the_popup_window() throws Throwable {

		// handle the popup

		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		java.util.Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) {
			String handle = iterator.next();

			if (!handle.contains(parentWindow)) { // Switch to popup 
				driver.switchTo().window(handle);
				
				// Verify if the Compare pop-up displayed
				Assert.assertTrue(cv.getComparePopup().isDisplayed());

				// Verify if the 2 products are displayed

				Assert.assertTrue(cv.getSony().isDisplayed() && cv.getIphone().isDisplayed());

			}
		}
		// Switching back to parent window
		driver.switchTo().window(parentWindow);

	}
	

    @Given("^click on mobile menu$")
    public void click_on_mobile_menu() throws Throwable {
		// click on Mobile menu
		lp.getMobLink().click();
	}

    @When("^click on compare button$")
    public void click_on_compare_button() throws Throwable {
		// click on Compare button in the pop-up
		cv.getCompareBtn().click();
	}


}
