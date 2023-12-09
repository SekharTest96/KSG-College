package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGServiceModuleRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
public class KSGServiceModule extends KSGExtentReports {

	
	KSGServiceModuleRepo service = new KSGServiceModuleRepo(DriversInit.getDriver());
	
	@BeforeClass
	public  void beforeTests() {
		reportService();
		System.out.println("Report service of extent started.. ");

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
	@Then("Hover on Service and click on Scholarships")
	public void Hover_on_Placement_and_click_on_Scholarships() {
		
		test = CreateTest("Hover on Service and click on Scholarships");
		test.pass("sucessfully navigated to Scholarships web page.");
		
		service.hoverOnServiceAndSelectScholarship1();
		
	}
	
	@Test(priority=3)
	@Then("Hover on Service and click on Prof Subbiah Yoga Centre")
	public void Hover_on_Placement_and_click_on_Prof_Subbiah_Yoga_Centre() {
		
		test = CreateTest("Hover on Service and click on Prof.Subbiah Yoga Centre");
		test.pass("sucessfully navigated to  Prof.Subbiah Yoga Centre web page.");
		service.hoverOnServiceAndSelectyoga1();
	}
	
	@Test(priority=4)
	@Then("Hover on Service and click on Group Insurance")
	public void Hover_on_Placement_and_click_on_Group_Insurance() {
		
		test = CreateTest("Hover on Service and click on Group Insurance");
		test.pass("sucessfully navigated to Group Insurance web page.");
		service.hoverOnServiceAndSelectGroupInsurance();
	}
	
	@Test(priority=5)
	@Then("Hover on Service and click on Research Programme")
	public void Hover_on_Placement_and_click_on_Research_Programme() {
		
		test = CreateTest("Hover on Service and click on Research Programme");
		test.pass("sucessfully navigated to Research Programme web page.");
		service.hoverOnServiceAndSelectResearchProgramme();
	}
	
	@Test(priority=6)
	@Then("Hover on Service and click on  UOW")
	public void Hover_on_Placement_and_click_on_UOW() {
		
		test = CreateTest("Hover on Service and click on  UOW");
		test.pass("sucessfully navigated to UOW web page.");
		service.hoverOnServiceAndSelectUOW();
	}
	
	
	
	
	@AfterClass
	public static void FlushReport() {
		flushTest();
		System.out.println("Report service of extent ended.. check reports at target/ExtentReport ");
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		DriversInit.quitDriver();
	}
}
