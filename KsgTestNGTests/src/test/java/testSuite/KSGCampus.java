package testSuite;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGCampus extends KSGExtentReports  {

	@BeforeSuite
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

	@Then("Hover on Campus and click on it")
	public void hover_on_Campus_and_click_on_it() {
		
		test = CreateTest("Hover on Campus and click on it");
		test.pass("sucessfully navigated to  Campus web page.");
		
	}
	
	@Test(priority=3)
	@Then("Check heading of webpage is Campus")
	public void Check_heading_of_webpage_is_Campus() {
		
		test = CreateTest("Check heading of webpage is Campus");
		test.pass("Heading of Web Page is Campus.");
		
	}
	
	@Test(priority=4)
	@Then("Check the title of webpage Campus")
	public void Check_the_title_of_webpage_Campus() {
		
		test = CreateTest("Check the title of webpage Campus");
		test.pass("Title of Web Page is Campus.");
		
	}
	
	@AfterSuite
	public void FlushReport() {
		flushTest();
		System.out.println("Report campus of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
