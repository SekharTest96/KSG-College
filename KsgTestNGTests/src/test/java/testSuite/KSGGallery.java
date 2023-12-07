package testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGGallery extends KSGExtentReports {

	@BeforeSuite
	public void beforeTests() {
		reportGallery();
		System.out.println("Report Gallery of extent started.. ");

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

	@Then("Hover on Gallery and click on Gallery")
	public void hover_on_Gallery_and_click_on_Facilities() {
		
		test = CreateTest("Hover on Facilities and click on Gallery");
		test.pass("sucessfully navigated to Gallery web page.");
		
	}
	
	@Test(priority=3)
	@Then("Check heading of webpage is Gallery")
	public void Check_heading_of_webpage_is_Gallery() {
		
		test = CreateTest("Check heading of webpage is Gallery");
		test.pass("Heading of Web Page is Gallery.");
		
	}
	
	@Test(priority=4)
	@Then("Check the title of webpage Gallery")
	public void Check_the_title_of_webpage_Gallery() {
		
		test = CreateTest("Check the title of webpage Gallery");
		test.pass("Title of Web Page is Gallery.");
		
	}




	
	@AfterSuite
	public void FlushReport() {
		flushTest();
		System.out.println("Report Gallery of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
