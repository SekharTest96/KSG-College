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
import pageLocatorsRepo.PlacementModuleRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class PlacementModule extends KSGExtentReports {

	PlacementModuleRepo placement = new PlacementModuleRepo(DriversInit.getDriver());
	
	@BeforeAll
	public static void beforeTests() {
		reportPlacement();
		System.out.println("Report placement of extent started.. ");

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
	@Then("Hover on Placement and click on Placement Cell")
	public void Hover_on_Placement_and_click_on_Placement_Cell() {
		
		test = CreateTest("Hover on College and click Placement Cell");
		test.pass("sucessfully navigated to Placement Cell web page.");
		placement.hoverOnPlacementAndSelectPlacementCell();
	}
	
	
	@Test
	@Order(3)
	@Then("Hover on Placement and click on Placement Office")
	public void Hover_on_Placement_and_click_on_Placement_Office() {
		
		test = CreateTest("Hover on College and click Placement Office");
		test.pass("sucessfully navigated to Placement Officel web page.");
		placement.hoverOnPlacementAndSelectPlacementOffice();
	}
	
	@Test
	@Order(4)
	@Then("Hover on Placement and click on Activities")
	public void Hover_on_Placement_and_click_on_Activities() {
		
		test = CreateTest("Hover on College and click Activities");
		test.pass("sucessfully navigated to Activities web page.");
		placement.hoverOnPlacementAndSelectPlacementActivities();
	}
	
	@Test
	@Order(5)
	@Then("Hover on Placement and click on Companies")
	public void Hover_on_Placement_and_click_on_Companies() {
		
		test = CreateTest("Hover on College and click Companies");
		test.pass("sucessfully navigated to Companies web page.");
		placement.hoverOnPlacementAndSelectPlacementCell();
	}
	
	@Test
	@Order(6)
	@Then("Hover on Placement and click on Career")
	public void Hover_on_Placement_and_click_on_Career() {
		
		test = CreateTest("Hover on College and click Career");
		test.pass("sucessfully navigated to Career web page.");
		placement.hoverOnPlacementAndSelectPlacementCell();
	}

	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report placement of extent ended.. check reports at target/ExtentReport ");
		DriversInit.quitDriver();
	}

	
}
