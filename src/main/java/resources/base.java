package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public static WebDriver driver;
	public static Properties prop;
	public static String url;

	

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Monica\\workspace\\CucumberTestNGECommerce\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monica\\workspace\\CucumberTestNGECommerce\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			// execute in Firefox browser

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monica\\workspace\\CucumberTestNGECommerce\\drivers\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
//	IE code

			System.setProperty("webdriver.ie.driver", "C:\\Users\\Monica\\workspace\\CucumberTestNGECommerce\\drivers\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}
	
	public String getUrl() {

		String url = prop.getProperty("url");
		return url;

	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\screenshots\\" + result + "screenshot.png"));

	}

}
