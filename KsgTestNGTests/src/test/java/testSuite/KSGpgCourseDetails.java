package testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGPgcourses;
import testReports.KSGExtentReports;
import utilities.DriversInit;
public class KSGpgCourseDetails extends KSGExtentReports {

	KSGPgcourses pg = new KSGPgcourses(DriversInit.getDriver());

	@BeforeSuite
	public static void openBrowser() {
		reportPg();
		System.out.println("Report pg of extent started.. ");
	}

	@Test(priority=1)
	@Given("Website launched with given url")
	public void website_launched_with_given_url() {

		test = CreateTest("Launch Website with given URL. PG courses selection test ");

		test.pass(" Website launched with the URL Sucessfully.");

		System.out.println(" ");
		System.out.println("Website Launched with given URL. PG courses selection test ");
		System.out.println(" ");
	}

	@Test(priority=2)
	@Then("hover on Courses, hover on pg course and select MA English Literature")
	public void hover_on_courses_hover_on_pg_course_and_select_ma_english_literature() {
		test = CreateTest("  Clicked on M.A English Literature . ")
				.fail(" But it do not navigate to M.A English Literature  webpage. So Test is Failed. ");
		;

		pg.hoverOnCourseAndPGCourseAndSelectMAel();
	}

	@Test(priority=3)
	@Then("hover on Courses, hover on pg course and select MSC Information Technology")
	public void hover_on_courses_hover_on_pg_course_and_select_msc_information_technology() {

		test = CreateTest(" Clicked on M.Sc Information Technology .")
				.fail(" But it do not navigate to  M.Sc Information Technology  webpage. So Test is Failed. ");

		pg.checkMscIT();
	}

	@Test(priority=4)
	@Then("hover on Courses, hover on pg course and select Msc Mathematics")
	public void hover_on_courses_hover_on_pg_course_and_select_msc_mathematics() {
		test = CreateTest(" Clicked on M.Sc Mathematics . ");
		test.fail(" But it do not navigate to  M.Sc  Mathematics  webpage. So Test is Failed. ");

		pg.checkMscM();
	}

	@Test(priority=5)
	@Then("hover on Courses, hover on pg course and select Msc Bio Technology")
	public void hover_on_courses_hover_on_pg_course_and_select_msc_bio_technology() {

		test = CreateTest(" Clicked on M.Sc Biotechnology . ")
				.fail(" But it do not navigate to  M.Sc Biotechnology  webpage. So Test is Failed. ");
		;

		pg.checkMscB();
	}

	@Test(priority=6)
	@Then("hover on Courses, hover on pg course and select M.Com \\(CA)")
	public void hover_on_courses_hover_on_pg_course_and_select_m_com_ca() {
		test = CreateTest(" Clicked on M.Com (CA) . ");
		test.fail(" But it do not navigate to  M.Com (CA)  webpage. So Test is Failed. ");

		pg.checkMcomCA();
	}

	@Test(priority=7)
	@Then("hover on Courses, hover on pg course and select M.Com \\(IB)")
	public void hover_on_courses_hover_on_pg_course_and_select_m_com_ib() {

		test = CreateTest(" Clicked on M.Com (IB) . ");
		test.fail(" But it do not navigate to  M.Com (IB)  webpage. So Test is Failed. ");

		pg.checkMcom1B();
	}

	@Test(priority=8)
	@Then("hover on Courses, hover on pg course and select MPhil Tamil")
	public void hover_on_courses_hover_on_pg_course_and_select_m_phil_tamil() {

		test = CreateTest(" Clicked on  MPhil Tamil . ");
		test.fail(" But it do not navigate to MPhil Tamil  webpage. So Test is Failed. ");

		pg.checkMphilTamil();
	}

	@Test(priority=9)
	@Then("hover on Courses, hover on pg course and select MPhil Computer Science")
	public void hover_on_courses_hover_on_pg_course_and_select_m_phil_computer_science() {

		test = CreateTest(" Clicked on MPhil Computer Science .");
		test.fail(" But it do not navigate to  MPhil Computer Science   webpage. So Test is Failed. ");

		pg.checkMPhilCS();
	}

	@Test(priority=10)
	@Then("hover on Courses, hover on pg course and select Ph.D Computer Science")
	public void hover_on_courses_hover_on_pg_course_and_select_ph_d_computer_science() {

		test = CreateTest(" Clicked on Ph.D Computer Science . ")
				.fail(" But it do not navigate to  Ph.D Computer Science  webpage. So Test is Failed. ");

		pg.checkPhdCS();
	}

	
	@AfterSuite
	public static void closeBrowser() {
		flushTest();
		System.out.println("Report pg of extent ended.. check reports at target/ExtentReport  ");
		DriversInit.quitDriver();
	}

}
