package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCart {
	

	public WebDriver driver; //create a driver object

	By addbtn = By.xpath("//li[1]//div[1]//div[3]//button[1]");
	By qty = By.xpath("//input[@title='Qty']");
	By update = By.xpath("//td[@class='product-cart-actions']//button[@name='update_cart_action']");
	By err = By.xpath("//p[contains(text(),'The maximum quantity allowed for purchase')]");
	By empty = By.xpath("//span[contains(text(),'Empty Cart')]");
	By msgempty = By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]");
	
	
	public AddCart(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}


	
	public WebElement getAddBtn() {
		return driver.findElement(addbtn);

	}
	
	
	public WebElement getMsgEmpty() {
		return driver.findElement(msgempty);

	}
	
	public WebElement getQty() {
		return driver.findElement(qty);

	}
	
	public WebElement getUpdate() {
		return driver.findElement(update);

	}
	
	public WebElement getError() {
		return driver.findElement(err);

	}
		
	
	public WebElement getEmpty() {
		return driver.findElement(empty);

	}
	
	
		

}
