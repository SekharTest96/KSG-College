package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import constant.Constantss;
import pageLocatorsRepo.KSGonlineAdmissionRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;



@Listeners(utilities.TestListners.class)


public class OnlineAdmissionTest extends KSGExtentReports  {

	
	KSGonlineAdmissionRepo onlineAddmission = new KSGonlineAdmissionRepo(DriversInit.getDriver());
	
	
	
	
	@BeforeClass
	public void openBrowser() {
		
		reportConfig3();
		
	}
	
	
	@Test(priority=1)
	public void OnlineAddmissionFormForRegistrationWithValidInputs() throws InterruptedException {
		
		/*WebElement OnlineAddmissionImage = DriversInit.driver.findElement(By.xpath("//a[@href=\"online-admissions.php\"]"));
		Actions act = new Actions(DriversInit.getDriver());
		act.click(OnlineAddmissionImage).build().perform();
		OnlineAddmissionImage.isDisplayed();
		
		OnlineAddmissionImage.click();*/
		
		 reportConfig3(); 
		 test =  CreateTest1("Onine Admission form filling  With Valid Inputs.");
		 test.pass("Valid Inputs is Accepted. Test is passed.");
		
		onlineAddmission.enterDetailsForOnlineAdmission();
		
		
		
		
	}
	
	@Test(priority=2)
	public void OnlineAddmissionFormForRegistrationWithInvalidInputs() throws InterruptedException {
		
		/*WebElement OnlineAddmissionImage = DriversInit.driver.findElement(By.xpath("//a[@href=\"online-admissions.php\"]"));
		Actions act = new Actions(DriversInit.getDriver());
		act.click(OnlineAddmissionImage).build().perform();
		OnlineAddmissionImage.isDisplayed();
		
		OnlineAddmissionImage.click();*/
		
		
		 test =  CreateTest1("Onine Admission form filling  With Invalid Inputs.");
		 test.fail("InValid Inputs is Accepted by Name, phone number, parent number, mention name. Test is Failed.");
		
		onlineAddmission.enterDetailsForOnlineAdmission1();
		
		
		
		
	}
	
	
	
	@AfterClass
	public void flushReport() {
		
		
		flushTest1();
		DriversInit.quitDriver();
	}
	
	
}
