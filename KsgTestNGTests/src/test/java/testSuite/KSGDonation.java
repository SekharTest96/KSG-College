package testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGDonation extends KSGExtentReports {

	@BeforeSuite
	public void beforeTests() {
		reportDonation();
		System.out.println("Report donation of extent started.. ");

	}

	@Test(priority = 1)

	@Given("Website launched with the url")

	public void website_launched_with_the_url() {
		test = CreateTest("Website launched with the url");
		test.pass("Website Launched with given url.");

		System.out.println("");
		System.out.println("Website Launched with given url. ");
		System.out.println("");
	}

	
	@Test(priority=2)

	@Then("Hover on Donation and click on Donation")
	public void hover_on_Donation_and_click_on_Contact() {
		
		test = CreateTest("Hover on Campus and click on Donation");
		test.pass("sucessfully navigated to Donation web page.");
		
	}
	
	@Test(priority=3)
	@Then("Check heading of webpage is Donation")
	public void Check_heading_of_webpage_is_Donation() {
		
		test = CreateTest("Check heading of webpage is Donation");
		test.pass("Heading of Web Page is Donation.");
		
	}
	
	@Test(priority=4)
	@Then("Check the title of webpage Donation")
	public void Check_the_title_of_webpage_Donation() {
		
		test = CreateTest("Check the title of webpage Donation");
		test.pass("Title of Web Page is Donation.");
		
	}


	@AfterSuite
	public void FlushReport() {
		flushTest();
		System.out.println("Report donation of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
