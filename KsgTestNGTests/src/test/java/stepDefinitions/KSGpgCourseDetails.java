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
import pageLocatorsRepo.KSGPgcourses;
import testReports.KSGExtentReports;
import utilities.DriversInit;
import utilities.TestListnersss;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestListnersss.class)
public class KSGpgCourseDetails extends KSGExtentReports {

	KSGPgcourses pg = new KSGPgcourses(DriversInit.getDriver());

	@BeforeAll
	public static void openBrowser() {
		reportPg();

	}

	@Test
	 @Order(1)
	@Given("Website launched with given url")
	public void website_launched_with_given_url() {

		test = CreateTest("Launch Website with given URL. PG courses selection test ");

		test.pass(" Website launched with the URL Sucessfully.");

		System.out.println(" ");
		System.out.println("Website Launched with given URL. PG courses selection test ");
		System.out.println(" ");
	}

	@Test
	 @Order(2)
	@Then("hover on Courses, hover on pg course and select MA English Literature")
	public void hover_on_courses_hover_on_pg_course_and_select_ma_english_literature() {
		test = CreateTest("  Clicked on M.A English Literature . ")
				.fail(" But it do not navigate to M.A English Literature  webpage. So Test is Failed. ");
		;

		pg.hoverOnCourseAndPGCourseAndSelectMAel();
	}

	@Test
	 @Order(3)
	@Then("hover on Courses, hover on pg course and select MSC Information Technology")
	public void hover_on_courses_hover_on_pg_course_and_select_msc_information_technology() {

		test = CreateTest(" Clicked on M.Sc Information Technology .")
				.fail(" But it do not navigate to  M.Sc Information Technology  webpage. So Test is Failed. ");

		pg.checkMscIT();
	}

	@Test
	 @Order(4)
	@Then("hover on Courses, hover on pg course and select Msc Mathematics")
	public void hover_on_courses_hover_on_pg_course_and_select_msc_mathematics() {
		test = CreateTest(" Clicked on M.Sc Mathematics . ");
		test.fail(" But it do not navigate to  M.Sc  Mathematics  webpage. So Test is Failed. ");

		pg.checkMscM();
	}

	@Test
	 @Order(5)
	@Then("hover on Courses, hover on pg course and select Msc Bio Technology")
	public void hover_on_courses_hover_on_pg_course_and_select_msc_bio_technology() {

		test = CreateTest(" Clicked on M.Sc Biotechnology . ")
				.fail(" But it do not navigate to  M.Sc Biotechnology  webpage. So Test is Failed. ");
		;

		pg.checkMscB();
	}

	@Test
	 @Order(6)
	@Then("hover on Courses, hover on pg course and select M.Com \\(CA)")
	public void hover_on_courses_hover_on_pg_course_and_select_m_com_ca() {
		test = CreateTest(" Clicked on M.Com (CA) . ");
		test.fail(" But it do not navigate to  M.Com (CA)  webpage. So Test is Failed. ");

		pg.checkMcomCA();
	}

	@Test
	 @Order(7)
	@Then("hover on Courses, hover on pg course and select M.Com \\(IB)")
	public void hover_on_courses_hover_on_pg_course_and_select_m_com_ib() {

		test = CreateTest(" Clicked on M.Com (IB) . ");
		test.fail(" But it do not navigate to  M.Com (IB)  webpage. So Test is Failed. ");

		pg.checkMcom1B();
	}

	@Test
	 @Order(8)
	@Then("hover on Courses, hover on pg course and select MPhil Tamil")
	public void hover_on_courses_hover_on_pg_course_and_select_m_phil_tamil() {

		test = CreateTest(" Clicked on  MPhil Tamil . ");
		test.fail(" But it do not navigate to MPhil Tamil  webpage. So Test is Failed. ");

		pg.checkMphilTamil();
	}

	@Test
	 @Order(9)
	@Then("hover on Courses, hover on pg course and select MPhil Computer Science")
	public void hover_on_courses_hover_on_pg_course_and_select_m_phil_computer_science() {

		test = CreateTest(" Clicked on MPhil Computer Science .");
		test.fail(" But it do not navigate to  MPhil Computer Science   webpage. So Test is Failed. ");

		pg.checkMPhilCS();
	}

	@Test
	 @Order(10)
	@Then("hover on Courses, hover on pg course and select Ph.D Computer Science")
	public void hover_on_courses_hover_on_pg_course_and_select_ph_d_computer_science() {

		test = CreateTest(" Clicked on Ph.D Computer Science . ")
				.fail(" But it do not navigate to  Ph.D Computer Science  webpage. So Test is Failed. ");

		pg.checkPhdCS();
	}

	
	@AfterAll
	public static void closeBrowser() {
		flushTest();
		DriversInit.quitDriver();
	}

}
