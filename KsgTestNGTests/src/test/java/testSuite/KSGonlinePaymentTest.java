package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.CollegeModuleRepo;
import pageLocatorsRepo.OnlinePaymentRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
public class KSGonlinePaymentTest extends KSGExtentReports {

	OnlinePaymentRepo pay = new OnlinePaymentRepo(DriversInit.getDriver());

	@BeforeSuite
	public static void openBrowser() {
		reportPay();
		System.out.println("Report pay of extent started.. ");
		
	}
	
	
	@Test(priority=1)
	@Given("Website launched with the URL")
	public void website_launched_with_the_url() {
		
	
		ExtentTest test = CreateTest("Launch Website with given URL. "); 
	       
        test.pass(" Website launched with the URL Sucessfully.");
		System.out.println("Given Website is launched with the provided url. ");
	}

	@Test(priority=2)
	@Then("navigated to Online Payment and clicked on it")
	public void navigated_to_online_payment_and_clicked_on_it() {
		
		ExtentTest   test = CreateTest("click on online payment. "); 
	       
        test.pass(" Test passed. Navigated to Online Payment When clicked on it");
		
		pay.clickOnlinePayment();
	}

	@Test(priority=3)
	@Then("Entered Valid details and clicked on pay")
	public void entered_valid_details_and_clicked_on_pay() {
		
		ExtentTest  test = CreateTest("Submitting online payment form with Valid inputs. "); 
	       
        test.pass(" Test passed. Valid Inputs accepted.");

		System.out.println("Entered Valid Details and clicked on pay");

	}

	@Test(priority=4)
	@Then("Entered valid card details")
	public void entered_valiid_card_details() {
	
		ExtentTest  test = CreateTest("Entered valiid card details . "); 
	       
        test.pass(" Test passed. Valid Inputs accepted.");
	
		pay.enterValidDetailsForOnlinePayment();
	}

	@Test(priority=5)
	@Then("Entered Invalid details and clicked on pay")
	public void entered_invalid_details_and_clicked_on_pay() {
		
		ExtentTest  test = CreateTest("Submitting online payment form with invalid details. ");
				test.fail("Test Failed . Invalid Inputs accepted.");
		pay.clickOnlinePayment();
		System.out.println("Entered Invalid Details and clicked on pay");
	}

	@Test(priority=6)
	@Then("Entered Invaliid card details")
	public void entered_invaliid_card_details() {

		
		ExtentTest  test = CreateTest("Entered valiid card details . "); 
	       
        test.pass(" Test passed. Inalid Inputs not accepted.");
		pay.enterInvalidDetailsForOnlinePayment();
	}

	@Test(priority=7)
	@Then("Entered no details and clicked on pay")
	public void entered_no_details_and_clicked_on_pay() {
		
		ExtentTest  test = CreateTest("Submitting online payment form without filling details. ");

		test.fail("empty Inputs accepted. Test with Empty Inputs test is Failed. ");
		pay.clickOnlinePayment();
		System.out.println("Entered no details (no data - empty input) and clicked on pay");
	}

	@Test(priority=8)
	@Then("Entered no card details")
	public void entered_no_card_details() {
		
		ExtentTest  	test = CreateTest("Entered no data (empty input) or details of card  . "); 
	       
        test.pass(" Test passed. Empty Inputs not accepted.");
		pay.emptyInput();
	}

	
	
	@AfterSuite
	public  void FlushReport() {
		flushTest();
		System.out.println("Report pay of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
	

}
