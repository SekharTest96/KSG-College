package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGNirfRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGNirf extends KSGExtentReports {

	
	KSGNirfRepo nirf = new KSGNirfRepo(DriversInit.getDriver());
	
	@BeforeClass
	public void beforeTests() {
		reportNirf ();
		System.out.println("Report Nirf  of extent started.. ");

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

	@Then("Hover on NIRF and click on NIRF")
	public void hover_on_NIRF__and_click_on_NIRF () {
		
		test = CreateTest("Hover on Facilities and click on NIRF ");
		test.pass("sucessfully navigated to NIRF  web page.");
		nirf.hoverOnNirftAndSelectNirf();
	}
	
	@Test(priority=3)
	@Then("Check heading of webpage is NIRF")
	public void Check_heading_of_webpage_is_NIRF () {
		
		test = CreateTest("Check heading of webpage is NIRF ");
		test.pass("Heading of Web Page is NIRF .");
		nirf.checkNirfHeading();
		
	}
	


	
	@AfterClass
	public void FlushReport() {
		flushTest();
		System.out.println("Report Nirf  of extent ended..  check reports at target/ExtentReport   ");
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		DriversInit.quitDriver();
	}
}
