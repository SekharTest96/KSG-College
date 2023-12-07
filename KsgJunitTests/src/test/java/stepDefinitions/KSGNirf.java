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
import pageLocatorsRepo.KSGNirfRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class KSGNirf extends KSGExtentReports{

	
	KSGNirfRepo nirf = new KSGNirfRepo(DriversInit.getDriver());
	
	@BeforeAll
	public static void beforeTests() {
		reportNirf();
		System.out.println("Report Nirf of extent started.. ");

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
	@Then("Hover on NIRF and click on NIRF")
	public void hover_on_NIRF_and_click_on_NIRF() {
		
		test = CreateTest("Hover on Facilities and click on NIRF");
		test.pass("sucessfully navigated to NIRF web page.");
		nirf.hoverOnNirftAndSelectNirf();
	}
	
	@Test
	@Order(3)
	@Then("Check heading of webpage is NIRF")
	public void Check_heading_of_webpage_is_Donation() {
		
		test = CreateTest("Check heading of webpage is NIRF");
		test.pass("Heading of Web Page is NIRF.");
		nirf.checkNirfHeading();
	}
	
	@Test
	@Order(4)
	@Then("Check the title of webpage NIRF")
	public void Check_the_title_of_webpage_Facilities() {
		
		test = CreateTest("Check the title of webpage NIRF");
		test.pass("Title of Web Page is NIRF.");
		nirf.checkNirfTitle();
	}
	
	
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report Nirf of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
