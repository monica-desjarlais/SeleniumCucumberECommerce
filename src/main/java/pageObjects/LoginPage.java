package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By acclink = By.xpath("//span[@class='label'][contains(text(),'Account')]");
	By email=By.xpath("//input[@id='email']");   
	By password=By.xpath("//input[@id='pass']");
	By login=By.xpath("//a[contains(text(),'Log In')]");
	By loginbtn = By.xpath("//button[@id='send2']");
	By error = By.xpath("//span[contains(text(),'Invalid login or password.')]");
	
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getLoginBtn()
	{
		return driver.findElement(loginbtn);
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getError()
	{
		return driver.findElement(error);
	}
	
	public WebElement getAccountLink() {
		return driver.findElement(acclink);

	}
	
	
	
}
