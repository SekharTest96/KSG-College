package testSuite;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGCampusRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGCampus extends KSGExtentReports  {

	
	KSGCampusRepo campus = new KSGCampusRepo(DriversInit.getDriver());
	
	@BeforeClass
	public void beforeTests() {
		reportCampus();
		System.out.println("Report campus of extent started.. ");

	}

	@Test(priority=1)
	
	@Given("Website launched with the url")

	public void website_launched_with_the_url() {
		test = CreateTest("Website launched with the url");
		test.pass("Website Launched with given url.");

		System.out.println("");
		System.out.println("Website Launched with given url. ");
		System.out.println("");
	}
	
	
	@Test(priority=2)

	@Then("Hover on Campus and click on Campus")
	public void hover_on_Campus_and_click_on_it() {
		
		test = CreateTest("Hover on Campus and click on Campus");
		test.pass("sucessfully navigated to  Campus web page.");
		campus.hoverOnCampusAndSelectCampus();
	}
	
	@Test(priority=3)
	@Then("Check heading of webpage is Campus")
	public void Check_heading_of_webpage_is_Campus() {
		
		test = CreateTest("Check heading of webpage is Campus");
		test.pass("Heading of Web Page is Campus.");
		campus.checkCampusHeading();
	}
	
	
	
	@Test(priority=4)

	@Then("Hover on Campus and click on NSS")
	public void hover_on_Campus_and_click_on_NSS() {
		
		test = CreateTest("Hover on Campus and click on NSS");
		test.pass("sucessfully navigated to NSS web page.");
		campus.hoverOnCampusAndSelectNSS();
	}
	
	@Test(priority=5)
	@Then("Check heading of webpage is NSS")
	public void Check_heading_of_webpage_is_NSS() {
		
		test = CreateTest("Check heading of webpage is NSS");
		test.pass("Heading of Web Page is NSS.");
		campus.checkNssHeading();
	}
	
	
	
	@AfterClass
	public void FlushReport() {
		flushTest();
		System.out.println("Report campus of extent ended..  check reports at target/ExtentReport   ");
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		DriversInit.quitDriver();
	}
}
