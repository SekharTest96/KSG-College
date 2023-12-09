package utilities;

import java.time.Duration;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import constants.Constantss;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriversInit {

	
		
		
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver ==  null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
		
			
			opt.setImplicitWaitTimeout(Duration.ofSeconds(60));
		
			driver=new ChromeDriver(opt);
	
			driver.get(Constantss.homePageURL);
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
			
			Dimension dm = new Dimension(1012,618);
			driver.manage().window().setSize(dm);
			
			//driver.manage().deleteAllCookies();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
			
			//driver.navigate().refresh();
			
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver=null;
		}
		
	}
}
