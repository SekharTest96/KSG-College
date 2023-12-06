package testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.CollegeModuleRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class CollegeModule extends KSGExtentReports {

	CollegeModuleRepo college = new CollegeModuleRepo(DriversInit.getDriver());

	@BeforeSuite
	public void beforeTests() {
		reportCM();
		System.out.println("Report college of extent started.. ");

	}

	@Test(priority=1)
	@Given("Website launched with the URL")
	public void Website_launched_with_the_URL() {
		test = CreateTest("Website launched with the url");
		test.pass("Website Launched with given url.");

		System.out.println("");
		System.out.println("Website Launched with given url. ");
		System.out.println("");
	}

	@Test(priority=2)
	@Then("Hover on College and click on AboutKSG")
	public void hover_on_college_and_click_on_about_ksg() {
		
		test = CreateTest("Hover on College and click on AboutKSG");
		test.pass("sucessfully navigated to about KSG web page.");
		college.hoverOnCollegeAndSelectaboutKSG1();
	}

	@Test(priority=3)
	
	@Then("Hover on College and click on Management")
	public void hover_on_college_and_click_on_management() {

		test = CreateTest("Hover on College and click on Management");
		test.pass("sucessfully navigated to Management web page.");
		college.selectManagement();
	}

	@Test(priority=4)
	@Then("Hover on College and click on Achevement")
	public void hover_on_college_and_click_on_achevement() {

		test = CreateTest("Hover on College and click on Achevement");
		test.pass("sucessfully navigated to Achevement web page.");
		college.selectAchievement();
	}

	@Test(priority=5)
	@Then("Hover on College and click on College Council")
	public void hover_on_college_and_click_on_college_council() {

		test = CreateTest("Hover on College and click on College Council");
		test.pass("sucessfully navigated to College Council web page.");
		college.selectCollegeCouncil();
	}

	@Test(priority=6)
	@Then("Hover on College and click on College Committee")
	public void hover_on_college_and_click_on_college_committee() {

		test = CreateTest("Hover on College and click on College Committee");
		test.pass("sucessfully navigated to College Committee web page.");
		college.selectCollegeCommittee();
	}

	@Test(priority=7)
	@Then("Hover on College and click on Charity")
	public void hover_on_college_and_click_on_charity() {

		test = CreateTest("Hover on College and click on Charity");
		test.pass("sucessfully navigated to Charity web page.");
		college.selectCharity();
	}

	@Test(priority=8)
	@Then("Hover on College and click on Events1")
	public void hover_on_college_and_click_on_events1() {

		test = CreateTest("Hover on College and click on Events1");
		test.pass("sucessfully navigated to Events1 web page.");
		college.selectEvent1();
	}

	@Test(priority=9)
	@Then("Hover on College and click on Videos")
	public void hover_on_college_and_click_on_videos() {

		test = CreateTest("Hover on College and click on Videos");
		test.pass("sucessfully navigated to Videos web page.");
		college.selectVideos();
	}
	
	
	@AfterSuite
	public void FlushReport() {
		flushTest();
		System.out.println("Report college of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}

}
