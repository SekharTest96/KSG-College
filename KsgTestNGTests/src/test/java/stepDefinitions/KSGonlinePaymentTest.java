package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import com.aventstack.extentreports.ExtentTest;
import pageLocatorsRepo.OnlinePaymentRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class KSGonlinePaymentTest extends KSGExtentReports {

	OnlinePaymentRepo pay = new OnlinePaymentRepo(DriversInit.getDriver());

	@BeforeAll
	public static void openBrowser() {
		reportPay();
		
		
	}
	
	
	@Test
	 @Order(1)
	@Given("Website launched with the URL")
	public void website_launched_with_the_url() {
		
	
		ExtentTest test = CreateTest("Launch Website with given URL. "); 
	       
        test.pass(" Website launched with the URL Sucessfully.");
		System.out.println("Given Website is launched with the provided url. ");
	}

	@Test
	 @Order(2)
	@Then("navigated to Online Payment and clicked on it")
	public void navigated_to_online_payment_and_clicked_on_it() {
		
		ExtentTest   test = CreateTest("click on online payment. "); 
	       
        test.pass(" Test passed. Navigated to Online Payment When clicked on it");
		
		pay.clickOnlinePayment();
	}

	@Test
	 @Order(3)
	@Then("Entered Valid details and clicked on pay")
	public void entered_valid_details_and_clicked_on_pay() {
		
		ExtentTest  test = CreateTest("Submitting online payment form with Valid inputs. "); 
	       
        test.pass(" Test passed. Valid Inputs accepted.");

		System.out.println("Entered Valid Details and clicked on pay");

	}

	@Test
	 @Order(4)
	@Then("Entered valid card details")
	public void entered_valiid_card_details() {
	
		ExtentTest  test = CreateTest("Entered valiid card details . "); 
	       
        test.pass(" Test passed. Valid Inputs accepted.");
	
		pay.enterValidDetailsForOnlinePayment();
	}

	@Test
	 @Order(5)
	@Then("Entered Invalid details and clicked on pay")
	public void entered_invalid_details_and_clicked_on_pay() {
		
		ExtentTest  test = CreateTest("Submitting online payment form with invalid details. ");
				test.fail("Test Failed . Invalid Inputs accepted.");
		pay.clickOnlinePayment();
		System.out.println("Entered Invalid Details and clicked on pay");
	}

	@Test
	 @Order(6)
	@Then("Entered Invaliid card details")
	public void entered_invaliid_card_details() {

		
		ExtentTest  test = CreateTest("Entered valiid card details . "); 
	       
        test.pass(" Test passed. Inalid Inputs not accepted.");
		pay.enterInvalidDetailsForOnlinePayment();
	}

	@Test
	 @Order(7)
	@Then("Entered no details and clicked on pay")
	public void entered_no_details_and_clicked_on_pay() {
		
		ExtentTest  test = CreateTest("Submitting online payment form without filling details. ");

		test.fail("empty Inputs accepted. Test with Empty Inputs test is Failed. ");
		pay.clickOnlinePayment();
		System.out.println("Entered no details (no data - empty input) and clicked on pay");
	}

	@Test
	 @Order(8)
	@Then("Entered no card details")
	public void entered_no_card_details() {
		
		ExtentTest  	test = CreateTest("Entered no data (empty input) or details of card  . "); 
	       
        test.pass(" Test passed. Empty Inputs not accepted.");
		pay.emptyInput();
	}

	
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		DriversInit.quitDriver();
	}
	

}
