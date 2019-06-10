package pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.base;

public class CouponValidation {
	public WebDriver driver; //create a driver object

	By acclink = By.xpath("//span[@class='label'][contains(text(),'Account')]");
	By login = By.xpath("//a[contains(text(),'Log In')]");
	By recorders =By.xpath("//h2[contains(text(),'Recent Orders')]");
	By firstname = By.xpath("//input[@id='billing:firstname']");
	By lastname = By.xpath("//input[@id='billing:lastname']");
	By logmail = By.xpath("//input[@id='email']");   
	By pass = By.xpath("//input[@id='pass']");
	By loginbtn = By.xpath("//button[@id='send2']");
	By reorder = By.cssSelector("tr.first.odd td.a-center.view.last span.nobr > a.link-reorder:nth-child(3)");
	By iphoneadd = By.xpath("//li[2]//div[1]//div[3]//button[1]");
	By coupon = By.xpath("//input[@id='coupon_code']");
	By grandtot = By.xpath("//strong//span[@class='price']");
	By couponapp = By.xpath("//button[@value='Apply']");
	By discount = By.cssSelector("tr:nth-child(2) > td.a-right:nth-child(2)");
	By ordertxt = By.xpath("//p[contains(text(),'Your order # is: ')]");
	
	public CouponValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}
	
	
	public WebElement getOrderText() {
		return driver.findElement(ordertxt);

	}
	
	public WebElement getDiscount() {
		return driver.findElement(discount);

	}
	
	
	public WebElement getCouponApply(){
		return driver.findElement(couponapp);

	}
	
	
	
	public WebElement getGrandTotal() {
		return driver.findElement(grandtot);

	}
	
	public WebElement getCouponCode() {
		return driver.findElement(coupon);

	}
	
	
	
	public WebElement getIphoneAdd() {
		return driver.findElement(iphoneadd);

	}
	
	
	public WebElement getReOrder() {
		return driver.findElement(reorder);

	}
	

	
	public WebElement getBillLastname() {
		return driver.findElement(lastname);

	}
	
	public WebElement getBillFirstname() {
		return driver.findElement(firstname);

	}
	
	
	
	public WebElement getLogin() {
		return driver.findElement(login);

	}
	
	
	
	public WebElement getPass() {
		return driver.findElement(pass);

	}

	

	public WebElement getLoginBtn() {
		return driver.findElement(loginbtn);

	}
	
	public WebElement getLogEmail() {
		return driver.findElement(logmail);

	}
	
	
	public WebElement getAccountLink() {
		return driver.findElement(acclink);

	}
	
	
	

	
	
	
		


		}


