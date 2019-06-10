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

public class CompareValidation {
	public WebDriver driver; //create a driver object

	By complink = By.xpath("//li[1]//div[1]//div[3]//ul[1]//li[2]//a[1]");
	By complink2 = By.xpath("//li[2]//div[1]//div[3]//ul[1]//li[2]//a[1]");
	By compbtn = By.xpath("//button[@class='button']//span//span[contains(text(),'Compare')]");
	By compopup = By.xpath("//table[@id='product_comparison']");
	By sony = By.xpath("//a[contains(text(),'Sony Xperia')]");
	By iphone = By.xpath("//a[contains(text(),'IPhone')]");
	
	
	public CompareValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}


	public WebElement getSony() {
		return driver.findElement(sony);

	}
	
	public WebElement getIphone() {
		return driver.findElement(iphone);

	}
	
	
	public WebElement getCompareLink() {
		return driver.findElement(complink);

	}
	
	public WebElement getCompareLink2() {
		return driver.findElement(complink2);

	}
	
	public WebElement getCompareBtn() {
		return driver.findElement(compbtn);

	}
	
	public WebElement getComparePopup() {
		return driver.findElement(compopup);

	}
	
	
	
	
		


		}


