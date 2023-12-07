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
import pageLocatorsRepo.KSGCampusRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class KSGCampus extends KSGExtentReports {

	
	KSGCampusRepo campus = new KSGCampusRepo(DriversInit.getDriver());
	
	@BeforeAll
	public static void beforeTests() {
		reportCampus();
		System.out.println("Report Campus of extent started.. ");

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
	@Then("Hover on Campus and click on Campus")
	public void hover_on_Campus_and_click_on_it() {
		
		test = CreateTest("Hover on Campus and click on Campus");
		test.pass("sucessfully navigated to  Campus web page.");
		campus.hoverOnCampusAndSelectCampus();
	}
	
	@Test
	@Order(3)
	@Then("Check heading of webpage is Campus")
	public void Check_heading_of_webpage_is_Campus() {
		
		test = CreateTest("Check heading of webpage is Campus");
		test.pass("Heading of Web Page is Campus.");
		campus.checkCampusHeading();
	}
	
	@Test
	@Order(4)
	@Then("Check the title of webpage Campus")
	public void Check_the_title_of_webpage_Campus() {
		
		test = CreateTest("Check the title of webpage Campus");
		test.pass("Title of Web Page is Campus.");
		campus.checkCampusTitle();
	}
	

	@Test
	@Order(5)
	@Then("Hover on Campus and click on NSS")
	public void hover_on_Campus_and_click_on_NSS() {
		
		test = CreateTest("Hover on Campus and click on NSS");
		test.pass("sucessfully navigated to NSS web page.");
		campus.hoverOnCampusAndSelectNSS();
	}
	
	@Test
	@Order(6)
	@Then("Check heading of webpage is NSS")
	public void Check_heading_of_webpage_is_NSS() {
		
		test = CreateTest("Check heading of webpage is NSS");
		test.pass("Heading of Web Page is NSS.");
		campus.checkNssHeading();
	}
	
	@Test
	@Order(7)
	@Then("Check the title of webpage NSS")
	public void Check_the_title_of_webpage_NSS() {
		
		test = CreateTest("Check the title of webpage NSS");
		test.pass("Title of Web Page is NSS.");
		campus.checkNssTitle();
	}
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report  Campus of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
