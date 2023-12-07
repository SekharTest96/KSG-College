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
import pageLocatorsRepo.KSGFacilitiesRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class KSGFacilities extends KSGExtentReports{

	
	KSGFacilitiesRepo facilities = new KSGFacilitiesRepo (DriversInit.getDriver());
	
	@BeforeAll
	public static void beforeTests() {
		reportFacilities();
		System.out.println("Report Facilities of extent started.. ");

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
	@Then("Hover on Facilities and click on Facilities")
	public void hover_on_Facilities_and_click_on_Donation() {
		
		test = CreateTest("Hover on Facilities and click on Facilities");
		test.pass("sucessfully navigated to Facilities web page.");
		facilities.hoverOnFacilitiesAndSelectFacilities();
	}
	
	@Test
	@Order(3)
	@Then("Check heading of webpage is Facilities")
	public void Check_heading_of_webpage_is_Donation() {
		
		test = CreateTest("Check heading of webpage is Facilities");
		test.pass("Heading of Web Page is Facilities.");
		
	}
	
	@Test
	@Order(4)
	@Then("Check the title of webpage Facilities")
	public void Check_the_title_of_webpage_Facilities() {
		
		test = CreateTest("Check the title of webpage Facilities");
		test.pass("Title of Web Page is Facilities.");
		facilities.checkFacilitiesTitle();
	}
	
	
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report Facilities of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
