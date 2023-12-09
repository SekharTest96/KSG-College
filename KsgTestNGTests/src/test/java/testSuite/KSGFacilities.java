package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGFacilitiesRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGFacilities extends KSGExtentReports {

	
	KSGFacilitiesRepo facilities = new KSGFacilitiesRepo (DriversInit.getDriver());
	
	
	@BeforeClass
	public void beforeTests() {
		reportFacilities();
		System.out.println("Report facilities of extent started.. ");

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

	@Then("Hover on Facilities and click on Facilities")
	public void hover_on_Facilities_and_click_on_Facilities() {
		
		test = CreateTest("Hover on Facilities and click on Facilities");
		test.pass("sucessfully navigated to Facilities web page.");
		facilities.hoverOnFacilitiesAndSelectFacilities();
	}
	
	@Test(priority=3)
	@Then("Check heading of webpage is Facilities")
	public void Check_heading_of_webpage_is_Facilities() {
		
		test = CreateTest("Check heading of webpage is Facilities");
		test.pass("Heading of Web Page is Facilities.");
		facilities.checkGalleryHeading();
		
	}
	
	



	@AfterClass
	public void FlushReport() {
		flushTest();
		System.out.println("Report facilities of extent ended..  check reports at target/ExtentReport   ");
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		DriversInit.quitDriver();
	}
}
