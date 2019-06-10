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
import pageObjects.CouponValidation;
import resources.base;

public class CouponValidationStepDefin extends base {

	// page objects
	LoginPage lp = new LoginPage(driver);
	LandingPage l = new LandingPage(driver);
	CouponValidation cv = new CouponValidation(driver);

	@And("^enter (.+) and (.+) and logs in$")
	public void enter_and_and_logs_in(String username, String password) throws Throwable {
		// log in
		lp.getAccountLink().click();
		lp.getLogin().click();
		lp.getEmail().clear();
		lp.getEmail().sendKeys(username);
		lp.getPassword().clear();
		lp.getPassword().sendKeys(password);
		lp.getLoginBtn().click();

	}

	@Given("^click on mobile link$")
	public void click_on_mobile_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// click on Mobile menu
		l.getMobLink().click();
	}

	@And("^add iphone to cart$")
	public void add_iphone_to_cart() throws Throwable {
		// add IPhone to cart

		cv.getIphoneAdd().click();
	}

	@When("^enter coupon code$")
	public void enter_coupon_code() throws Throwable {

		// insert the coupon code
		cv.getCouponCode().clear();
		cv.getCouponCode().sendKeys(prop.getProperty("coupon"));
		cv.getCouponApply().click();
	}

	@Then("^verify the error discount is generated$")
	public void verify_the_error_discount_is_generated() throws Throwable {
		// get the discount applied
		System.out.println("The disocunt price is :" + cv.getDiscount().getText());

	}

}
