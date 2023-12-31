package pageLocatorsRepo;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.DriversInit;

public class KSGonlineAdmissionRepo {

	public KSGonlineAdmissionRepo(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"https://ksgcollege.com/online-admissions.php\"]") WebElement OnlineAdmission;
	@FindBy(how=How.XPATH, using="//input[@placeholder=\"Name of the Candidate\"]") WebElement  Name;
	@FindBy(xpath="//input[@id=\"rd1\"]") WebElement Male;
	@FindBy(xpath="//input[@id=\"rd2\"]") WebElement Female;
	@FindBy(how=How.XPATH, using="//select[@name=\"co\"]") WebElement CoursePreferred;
	@FindBy(xpath="//input[@placeholder=\"Phone Number\"]") WebElement PhoneNumber;
	@FindBy(xpath="//input[@placeholder=\"Parent / Alternative Phone Number\"]") WebElement AlternateNumber;
	@FindBy(xpath="//input[@placeholder=\"Please mention Name\"]") WebElement MentionName;
	@FindBy(xpath="//textarea[contains(text(), \"Address for Communication\")]") WebElement Address ;
	@FindBy(xpath="//input[@type=\"file\"]") WebElement FileUpload;
	@FindBy(xpath="//span[@role=\"checkbox\"]") WebElement captchaCheckbox;
	@FindBy(xpath="//input[@value=\"Register\"]") WebElement  Register;
	//@FindBy(xpath="") WebElement ;
	
	
	
	
	public void enterValidDetailsForOnlineAdmission() throws InterruptedException {
		
		Actions act1 = new Actions(DriversInit.driver);
		act1.moveToElement(OnlineAdmission).build().perform();
		OnlineAdmission.click();
		
		
	
		Name.sendKeys("Bts Infotech");
		
		for(int i=0; i<12; i++) {
			JavascriptExecutor js = (JavascriptExecutor) DriversInit.driver;
			js.executeScript("arguments[0].click()", Male);
			
			JavascriptExecutor js1 = (JavascriptExecutor) DriversInit.driver;
			js1.executeScript("arguments[0].click()", Female);
		}
		
	    CoursePreferred.click();
	
		Select sel = new Select(CoursePreferred);
		sel.selectByIndex(0);
		sel.selectByIndex(5);
		sel.selectByIndex(10);
		sel.selectByIndex(15);
		sel.selectByIndex(6);
		sel.selectByIndex(12);
		sel.selectByIndex(1);
		sel.selectByIndex(13);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByIndex(9);
		sel.selectByIndex(8);
		sel.selectByIndex(7);
		sel.selectByIndex(11);
		sel.selectByIndex(14);
		sel.selectByIndex(16);
		sel.selectByIndex(18);
		sel.selectByIndex(19);
		sel.selectByIndex(17);
		
		sel.selectByIndex(0);
		sel.selectByIndex(5);
		sel.selectByIndex(10);
		sel.selectByIndex(15);
		sel.selectByIndex(6);
		sel.selectByIndex(12);
		sel.selectByIndex(1);
		sel.selectByIndex(13);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByIndex(9);
		sel.selectByIndex(8);
		sel.selectByIndex(7);
		sel.selectByIndex(11);
		sel.selectByIndex(14);
		sel.selectByIndex(16);
		sel.selectByIndex(18);
		sel.selectByIndex(19);
		sel.selectByIndex(17);
		
		sel.selectByIndex(0);
		sel.selectByIndex(5);
		sel.selectByIndex(10);
		sel.selectByIndex(15);
		sel.selectByIndex(6);
		sel.selectByIndex(12);
		sel.selectByIndex(1);
		sel.selectByIndex(13);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByIndex(9);
		sel.selectByIndex(8);
		sel.selectByIndex(7);
		
		
		PhoneNumber.sendKeys("1234567890");
		AlternateNumber.click();
		AlternateNumber.sendKeys("0987456321");
		MentionName.click();
		MentionName.sendKeys("friend");
		Address.click();
		Address.sendKeys("Sreesailam Hills, Thirupathi.");
		
		
		String filePath = "F:\\Jai Ganesha New Hall Ticket.txt";
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(FileUpload).build().perform();
		
		
		FileUpload.sendKeys(filePath);
		//act.moveToElement(captchaCheckbox).build().perform();
		Thread.sleep(25000);
		//captchaCheckbox.click();
		System.out.println("Complete Captcha Verifiaction in 25 Seconds. ");
		 Register.click();
		 
		 Alert alert = DriversInit.driver.switchTo().alert();
		 String actualAlertText  = alert.getText();
		 
		 System.out.println("Alert text is : "+actualAlertText );
		 
		 String expectedAlertText = "Succesfully Updated";
		
		 Assert.assertEquals( actualAlertText, expectedAlertText);
		 alert.accept();
		 
		
	}
	
	
	public void enterInvalidDetailsForOnlineAdmission() throws InterruptedException {
		
		
		DriversInit.driver.get("https://www.ksgcollege.com/");
		Actions act1 = new Actions(DriversInit.driver);
		act1.moveToElement(OnlineAdmission).build().perform();
		OnlineAdmission.click();
		
	
		Name.sendKeys("Bts Infotech");
		
		for(int i=0; i<12; i++) {
			JavascriptExecutor js = (JavascriptExecutor) DriversInit.driver;
			js.executeScript("arguments[0].click()", Male);
			
			JavascriptExecutor js1 = (JavascriptExecutor) DriversInit.driver;
			js1.executeScript("arguments[0].click()", Female);
		}
		
	    CoursePreferred.click();
	
		Select sel = new Select(CoursePreferred);
	
		sel.selectByIndex(13);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByIndex(9);
		sel.selectByIndex(8);
		sel.selectByIndex(7);
		sel.selectByIndex(11);
		sel.selectByIndex(14);
		sel.selectByIndex(16);
		sel.selectByIndex(18);
		sel.selectByIndex(19);
		sel.selectByIndex(17);
		
		sel.selectByIndex(0);
		sel.selectByIndex(5);
		sel.selectByIndex(10);
		sel.selectByIndex(15);
		sel.selectByIndex(6);
		sel.selectByIndex(12);
		sel.selectByIndex(1);
	
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByIndex(9);
		sel.selectByIndex(8);
		sel.selectByIndex(7);
		
		
		PhoneNumber.sendKeys("156adgf%$");
		AlternateNumber.click();
		AlternateNumber.sendKeys("098$%jhj");
		MentionName.click();
		MentionName.sendKeys("GD$jh89");
		Address.click();
		Address.sendKeys("Sreesailam Hills, Thirupathi.");
		
		
		String filePath = "F:\\Jai Ganesha New Hall Ticket.txt";
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(FileUpload).build().perform();
		
		
		FileUpload.sendKeys(filePath);
		//act.moveToElement(captchaCheckbox).build().perform();
		Thread.sleep(25000);
		//captchaCheckbox.click();
		System.out.println("Complete Captcha Verifiaction in 25 Seconds. ");
		 Register.click();
		 
		 Alert alert = DriversInit.driver.switchTo().alert();
		 String actualAlertText  = alert.getText();
		 
		 System.out.println("Alert text is : "+actualAlertText );
		 
		 String expectedAlertText = "Succesfully Updated";
		
		 Assert.assertEquals( actualAlertText, expectedAlertText);
		 alert.accept();
		 
		
	}
	
	
}
