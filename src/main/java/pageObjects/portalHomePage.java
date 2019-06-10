package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class portalHomePage {

	
	public WebDriver driver;
	
	By myCourses=By.xpath("//a[contains(text(),'My Courses')]");
	By err=By.xpath("//div[contains(text(),'Invalid email or password')]");
	
	
	
	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	
	//public WebElement getSearchBox()
	//{
		//return driver.findElement(searchBox);
	//}
	
	public WebElement getCoursesLink()
	{
			return driver.findElement(myCourses);
	}
	
	public WebElement getErr()
	{
		return driver.findElement(err);
	}
	
	
		
		
		
	
	
}
