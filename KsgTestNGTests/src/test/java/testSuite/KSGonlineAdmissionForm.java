package testSuite;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGonlineAdmissionRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
public class KSGonlineAdmissionForm extends KSGExtentReports{
	
	
	KSGonlineAdmissionRepo reg = new KSGonlineAdmissionRepo(DriversInit.getDriver());

	@BeforeClass
	public static void beforeTests() {
		reportReg();
			System.out.println("Report Reg of extent started.. ");
		
	}
	
	
	@Test(priority=1)
	
	@Given("Website launched with the url")
	
	public void website_launched_with_the_url() {
		test =  CreateTest("Website launched with the url");
		 test.pass("Website Launched with given url.");
		
	   System.out.println("");
	   System.out.println("Website Launched with given url. ");
	   System.out.println("");
	}


	@Test(priority=2)
	@Then("hover on online admission open form and click on it")
	public void hover_on_online_admission_open_form_and_click_on_it() {
		test =  CreateTest("hover on online admission open form and click on it");
		 test.pass("Navigated to registration form sucessfully. ");
		
	   System.out.println("hovered on online admission open form and clicked on it");
	}

	

	@Test(priority=3)
	@Then("enter the valid data as input and submit the form")
	public void enter_the_valid_data_as_input_and_submit_the_form() throws InterruptedException {
		test =  CreateTest("Onine Admission form filling  With Valid Inputs.");
		 test.pass("Valid Inputs is Accepted. Test is passed.");
	    reg.enterValidDetailsForOnlineAdmission();
	}

	

	@Test(priority=4)
	@Then("enter the Invalid data as input and submit the form")
	public void enter_the_invalid_data_as_input_and_submit_the_form() throws InterruptedException {
	   
		 test =  CreateTest("Onine Admission form filling  With Invalid Inputs.");
		 test.fail("InValid Inputs is Accepted by Name, phone number, parent number, mention name. Test is Failed.");
		
		reg.enterInvalidDetailsForOnlineAdmission();
	}
	
	
	@AfterClass
	public  void flushReport() {
		flushTest();
		System.out.println("Report Reg of extent ended..  check reports at target/ExtentReport  ");
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		DriversInit.quitDriver();
	}
}


