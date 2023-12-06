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
import pageLocatorsRepo.CollegeModuleRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class CollegeModule extends KSGExtentReports {

	CollegeModuleRepo college = new CollegeModuleRepo(DriversInit.getDriver());

	@BeforeAll
	public static void beforeTests() {
		reportCM();
		System.out.println("Report College of extent started.. ");

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
	@Then("Hover on College and click on AboutKSG")
	public void hover_on_college_and_click_on_about_ksg() {
		
		test = CreateTest("Hover on College and click on AboutKSG");
		test.pass("sucessfully navigated to about KSG web page.");
		college.hoverOnCollegeAndSelectaboutKSG1();
	}

	@Test
	@Order(3)
	@Then("Hover on College and click on Management")
	public void hover_on_college_and_click_on_management() {

		test = CreateTest("Hover on College and click on Management");
		test.pass("sucessfully navigated to Management web page.");
		college.selectManagement();
	}

	@Test
	@Order(4)
	@Then("Hover on College and click on Achevement")
	public void hover_on_college_and_click_on_achevement() {

		test = CreateTest("Hover on College and click on Achevement");
		test.pass("sucessfully navigated to Achevement web page.");
		college.selectAchievement();
	}

	@Test
	@Order(5)
	@Then("Hover on College and click on College Council")
	public void hover_on_college_and_click_on_college_council() {

		test = CreateTest("Hover on College and click on College Council");
		test.pass("sucessfully navigated to College Council web page.");
		college.selectCollegeCouncil();
	}

	@Test
	@Order(6)
	@Then("Hover on College and click on College Committee")
	public void hover_on_college_and_click_on_college_committee() {

		test = CreateTest("Hover on College and click on College Committee");
		test.pass("sucessfully navigated to College Committee web page.");
		college.selectCollegeCommittee();
	}

	@Test
	@Order(7)
	@Then("Hover on College and click on Charity")
	public void hover_on_college_and_click_on_charity() {

		test = CreateTest("Hover on College and click on Charity");
		test.pass("sucessfully navigated to Charity web page.");
		college.selectCharity();
	}

	@Test
	@Order(8)
	@Then("Hover on College and click on Events1")
	public void hover_on_college_and_click_on_events1() {

		test = CreateTest("Hover on College and click on Events1");
		test.pass("sucessfully navigated to Events1 web page.");
		college.selectEvent1();
	}

	@Test
	@Order(9)
	@Then("Hover on College and click on Videos")
	public void hover_on_college_and_click_on_videos() {

		test = CreateTest("Hover on College and click on Videos");
		test.pass("sucessfully navigated to Videos web page.");
		college.selectVideos();
	}
	
	
	@AfterAll
	public static void FlushReport() {
		flushTest();
		System.out.println("Report college of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}

}
