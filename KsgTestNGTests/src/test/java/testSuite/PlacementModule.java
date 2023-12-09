package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.PlacementModuleRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
public class PlacementModule extends KSGExtentReports {

	PlacementModuleRepo placement = new PlacementModuleRepo(DriversInit.getDriver());
	
	@BeforeClass
	public  void beforeTests() {
		reportPlacement();
		System.out.println("Report placement of extent started.. ");

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
	@Then("Hover on Placement and click on Placement Cell")
	public void Hover_on_Placement_and_click_on_Placement_Cell() {
		
		test = CreateTest("Hover on College and click Placement Cell");
		test.pass("sucessfully navigated to Placement Cell web page.");
		placement.hoverOnPlacementAndSelectPlacementCell();
	}
	
	
	@Test(priority=3)
	@Then("Hover on Placement and click on Placement Office")
	public void Hover_on_Placement_and_click_on_Placement_Office() {
		
		test = CreateTest("Hover on College and click Placement Office");
		test.pass("sucessfully navigated to Placement Officel web page.");
		placement.hoverOnPlacementAndSelectPlacementOffice();
	}
	
	@Test(priority=4)
	@Then("Hover on Placement and click on Activities")
	public void Hover_on_Placement_and_click_on_Activities() {
		
		test = CreateTest("Hover on College and click Activities");
		test.pass("sucessfully navigated to Activities web page.");
		placement.hoverOnPlacementAndSelectPlacementActivities();
	}
	
	@Test(priority=4)
	@Then("Hover on Placement and click on Companies")
	public void Hover_on_Placement_and_click_on_Companies() {
		
		test = CreateTest("Hover on College and click Companies");
		test.pass("sucessfully navigated to Companies web page.");
		placement.hoverOnPlacementAndSelectPlacementCell();
	}
	
	@Test(priority=5)
	@Then("Hover on Placement and click on Career")
	public void Hover_on_Placement_and_click_on_Career() {
		
		test = CreateTest("Hover on College and click Career");
		test.pass("sucessfully navigated to Career web page.");
		placement.hoverOnPlacementAndSelectPlacementCell();
	}

	
	@AfterClass
	public  void FlushReport() {
		flushTest();
		
		System.out.println("Report placement of extent ended.. check reports at target/ExtentReport ");
		
	}

	@AfterSuite
	public void closeBrowser() {
		DriversInit.quitDriver();
	}
}
