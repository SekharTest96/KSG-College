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
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class KSGContact extends KSGExtentReports{

	
	@BeforeAll
	public static void beforeTests() {
		reportContact();
		System.out.println("Report Contact of extent started.. ");

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
	@Then("Hover on Contact and click on Contact")
	public void hover_on_Contact_and_click_on_it() {
		
		test = CreateTest("Hover on Campus and click on Contact");
		test.pass("sucessfully navigated to Contact web page.");
		
	}
	
	@Test
	@Order(3)
	@Then("Check heading of webpage is Contact")
	public void Check_heading_of_webpage_is_Contact() {
		
		test = CreateTest("Check heading of webpage is Contact");
		test.pass("Heading of Web Page is Contact.");
		
	}
	
	@Test
	@Order(4)
	@Then("Check the title of webpage Contact")
	public void Check_the_title_of_webpage_Contact() {
		
		test = CreateTest("Check the title of webpage Contact");
		test.pass("Title of Web Page is Contact.");
		
	}
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report Contact of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
