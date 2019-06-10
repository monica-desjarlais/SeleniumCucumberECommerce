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

public class LandingPage {
	public WebDriver driver; //create a driver object

	By moblink = By.xpath("//a[contains(text(),'Mobile')]");
	By hometxt = By.xpath("//h2[contains(text(),'This is demo site')]");
	By droplist = By.xpath("//select[1][@title ='Sort By']");
	By arrow = By.xpath("//a[contains(text(),'Set Ascending Direction')] ");
	By prodgroup = By.cssSelector("ul.products-grid h2.product-name");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}
//there are more elements
	public List<WebElement> getProdGroup() {
		return driver.findElements(prodgroup);

	}


	public WebElement getMobLink() {
		return driver.findElement(moblink);

	}

	
	public WebElement getDropList() {
		return driver.findElement(droplist);

	}
	
	public WebElement getHomeText() {
		return driver.findElement(hometxt);

	}
	
	public WebElement getArrow() {
		return driver.findElement(arrow);

	}

	

	
	
	
		


		}


