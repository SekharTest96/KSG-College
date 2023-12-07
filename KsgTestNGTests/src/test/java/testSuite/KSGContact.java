package testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGContactRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGContact extends KSGExtentReports{

	
	KSGContactRepo contact = new KSGContactRepo(DriversInit.getDriver());
	
	@BeforeSuite
	public void beforeTests() {
		reportContact();
		System.out.println("Report Contact of extent started.. ");
		
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

	@Then("Hover on Contact and click on Contact")
	public void hover_on_Contact_and_click_on_Contact() {
		
		test = CreateTest("Hover on Campus and click on Contact");
		test.pass("sucessfully navigated to  Contact web page.");
		contact.hoverOnContactAndSelectContact();
	}
	
	@Test(priority=3)
	@Then("Check heading of webpage is Contact")
	public void Check_heading_of_webpage_is_Contact() {
		
		test = CreateTest("Check heading of webpage is Contact");
		test.pass("Heading of Web Page is Contact.");
		contact.checkContactHeading();
	}
	
	@Test(priority=4)
	@Then("Check the title of webpage Contact")
	public void Check_the_title_of_webpage_Contact() {
		
		test = CreateTest("Check the title of webpage Contact");
		test.pass("Title of Web Page is Contact.");
		contact.checkContactTitle();
	}

	@AfterSuite
	public void FlushReport() {
		flushTest();
		System.out.println("Report Contact of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
