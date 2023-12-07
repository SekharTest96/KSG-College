package stepDefinitions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGDonationRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class KSGDonation extends KSGExtentReports{

	
	KSGDonationRepo donation = new KSGDonationRepo(DriversInit.getDriver());
	
	
	@BeforeAll
	public static void beforeTests() {
		reportDonation();
		System.out.println("Report Donation of extent started.. ");

	}

	@Test
	@Order(1)
	@Given("Website launched with the url")

	public void website_launched_with_the_url() {
		test = CreateTest("Website launched with the url");
		test.pass("Website Launched with given url.");

		System.out.println("");
		System.out.println("Website Launched with given url. ");
		System.out.println("");
	}
	
	@Test
	@Order(2)
	@Then("Hover on Donation and click on Donation")
	public void hover_on_Donation_and_click_on_Donation() {
		
		test = CreateTest("Hover on Campus and click on Contact");
		test.pass("sucessfully navigated to Donation web page.");
		donation.hoverOnDonationAndSelectDonation();
	}
	
	@Test
	@Order(3)
	@Then("Check heading of webpage is Donation")
	public void Check_heading_of_webpage_is_Donation() {
		
		test = CreateTest("Check heading of webpage is Donation");
		test.fail("Heading of Web Page is Campus.");
		
		donation.checkDonationHeading();
	}
	
	@Test
	@Order(4)
	@Then("Check the title of webpage Donation")
	public void Check_the_title_of_webpage_Contact() {
		
		test = CreateTest("Check the title of webpage Donation");
		test.fail("Title of Web Page is Campus.");
		donation.checkDonationHeading();
	}
	
	@Test
	@Order(5)
	@Then("Check the Online Payment Details of Donation")
	public void Check_the_Online_Payment_Details_of_Donation() {
		
		test = CreateTest("Check the Online Payment Details Donation");
		test.pass("Online Payment Deatils are correct.");
		donation.validateOnlinePaymentDetails();
		
	}
	
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report Donation of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
