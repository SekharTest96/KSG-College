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
import pageLocatorsRepo.KSGServiceModuleRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class KSGServiceModule extends KSGExtentReports {

	
	KSGServiceModuleRepo service = new KSGServiceModuleRepo(DriversInit.getDriver());
	
	@BeforeAll
	public static void beforeTests() {
		reportService();
		System.out.println("Report service of extent started.. ");

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
	@Then("Hover on Service and click on Scholarships")
	public void Hover_on_Placement_and_click_on_Scholarships() {
		
		test = CreateTest("Hover on Service and click on Scholarships");
		test.pass("sucessfully navigated to Scholarships web page.");
		
		service.hoverOnServiceAndSelectScholarship1();
		
	}
	
	@Test
	@Order(3)
	@Then("Hover on Service and click on Prof Subbiah Yoga Centre")
	public void Hover_on_Placement_and_click_on_Prof_Subbiah_Yoga_Centre() {
		
		test = CreateTest("Hover on Service and click on Prof.Subbiah Yoga Centre");
		test.pass("sucessfully navigated to  Prof.Subbiah Yoga Centre web page.");
		service.hoverOnServiceAndSelectyoga1();
	}
	
	@Test
	@Order(4)
	@Then("Hover on Service and click on Group Insurance")
	public void Hover_on_Placement_and_click_on_Group_Insurance() {
		
		test = CreateTest("Hover on Service and click on Group Insurance");
		test.pass("sucessfully navigated to Group Insurance web page.");
		service.hoverOnServiceAndSelectGroupInsurance();
	}
	
	@Test
	@Order(5)
	@Then("Hover on Service and click on Research Programme")
	public void Hover_on_Placement_and_click_on_Research_Programme() {
		
		test = CreateTest("Hover on Service and click on Research Programme");
		test.pass("sucessfully navigated to Research Programme web page.");
		service.hoverOnServiceAndSelectResearchProgramme();
	}
	
	@Test
	@Order(6)
	@Then("Hover on Service and click on  UOW")
	public void Hover_on_Placement_and_click_on_UOW() {
		
		test = CreateTest("Hover on Service and click on  UOW");
		test.pass("sucessfully navigated to UOW web page.");
		service.hoverOnServiceAndSelectUOW();
	}
	
	
	
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report service of extent ended.. check reports at target/ExtentReport ");
		DriversInit.quitDriver();
	}
}
