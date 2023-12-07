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
public class KSGGallery extends KSGExtentReports{

	
	@BeforeAll
	public static void beforeTests() {
		reportGallery();
		System.out.println("Report Gallery of extent started.. ");

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
	@Then("Hover on Gallery and click on Gallery")
	public void hover_on_Gallery_and_click_on_Gallery() {
		
		test = CreateTest("Hover on Facilities and click on Gallery");
		test.pass("sucessfully navigated to Gallery web page.");
		
	}
	
	@Test
	@Order(3)
	@Then("Check heading of webpage is Gallery")
	public void Check_heading_of_webpage_is_Donation() {
		
		test = CreateTest("Check heading of webpage is Gallery");
		test.pass("Heading of Web Page is Gallery.");
		
	}
	
	@Test
	@Order(4)
	@Then("Check the title of webpage Gallery")
	public void Check_the_title_of_webpage_Facilities() {
		
		test = CreateTest("Check the title of webpage Gallery");
		test.pass("Title of Web Page is Gallery.");
		
	}
	
	
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report Gallery of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
