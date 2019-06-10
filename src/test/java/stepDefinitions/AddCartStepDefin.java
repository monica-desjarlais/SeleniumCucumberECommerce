package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.AddCart;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

public class AddCartStepDefin extends base {

	// page objects

	AddCart ac = new AddCart(driver);
	LandingPage l = new LandingPage(driver);

	@When("^change qty value to \"([^\"]*)\"$")
	public void change_qty_value_to(String arg1) throws Throwable {
		// change QTY value to 1000
		ac.getQty().sendKeys(arg1);
	}

	@When("^click on empty card link$")
	public void click_on_empty_card_link() throws Throwable {
		// click on Empty Card link
		ac.getEmpty().click();

	}

	@Then("^verify the error message is displayed$")
	public void verify_the_error_message_is_displayed() throws Throwable {
		// verify the error message is displayed for products
		Assert.assertTrue(ac.getError().isDisplayed());

	}

	@Then("^verify the error message is displayed for empty card$")
	public void verify_the_error_message_is_displayed_for_empty_card() throws Throwable {
		// verify the error message for empty card is displayed
		Assert.assertTrue(ac.getMsgEmpty().isDisplayed());

	}

	@Given("^click on \"([^\"]*)\" menu$")
	public void click_on_menu(String arg1) throws Throwable {
		// click on Mobile menu
		l.getMobLink().click();
	}

	@Given("^click on add to cart menu for xperia mobile$")
	public void click_on_add_to_cart_menu_for_xperia_mobile() throws Throwable {
		// click on Add to Cart button
		ac.getAddBtn().click();

	}

	@When("^click on update button$")
	public void click_on_update_button() throws Throwable {

		// click on Update button
		ac.getUpdate().click();
	}

}
