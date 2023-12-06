package testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.KSGUgCourse;
import testReports.KSGExtentReports;
import utilities.DriversInit;
public class KSGugCoursesTest extends KSGExtentReports {

	KSGUgCourse ug = new KSGUgCourse(DriversInit.getDriver());

	@BeforeSuite
	public  void openBrowser() {
		reportUg();
		System.out.println("Report ug of extent started.. ");
	}

	@Test(priority=1)
	@Given("Website launched with provided url")
	public void website_launched_with_the_url() {

		System.out.println("");
		System.out.println("Website Launched with given url. ");
		System.out.println("");
	}

	@Test(priority=2)
	@Then("hover on Courses, hover on pg course and select Computer Applications BCA")
	public void hover_on_courses_hover_on_pg_course_and_select_computer_applications_bca() {
		test = CreateTest(" Clicked on BCA .  ");
		test.pass("It is navigated to  Computer Applications (BCA)  webpage.  ");
		ug.hoverOnCourseAndUGCourseAndClickBCA();
	}

	@Test(priority=3)
	@Then("hover on Courses, hover on pg course and select Bcom CA")
	public void hover_on_courses_hover_on_pg_course_and_select_bcom_CA() {
		test = CreateTest(" Clicked on BcomCA.  ");
		test.pass("It do not navigate to COMMERCE WITH COMPUTER APPLICATIONS  webpage.   ");
		ug.checkBcomCA();
	}

	@Test(priority=4)
	@Then("hover on Courses, hover on pg course and select Bcom Professional Accounting B.ComPA")
	public void hover_on_courses_hover_on_pg_course_and_select_bcom_professional_accounting_b_com_pa() {
		test = CreateTest(
				" Clicked on BcomProfessional  Accounting .It navigate to Bcom Professional Accounting (B.Com(PA))  webpage.  ");
		test.pass("Accounting .It navigate to Bcom Professional Accounting (B.Com(PA))  webpage. ");
		ug.checkBcomPA();
	}

	@Test(priority=5)
	@Then("hover on Courses, hover on pg course and select COMPUTER SCIENCE B.SC")
	public void hover_on_courses_hover_on_pg_course_and_select_computer_science_b_sc() {
		
		test = CreateTest(" Clicked on B.SC COMPUTER SCIENCE   . ");
		test.fail("It navigate to COMPUTER SCIENCE (B.SC)  webpage. But Computer Applications (BCA) course detais showing in web page. ");

		ug.checkBscCS();

	}

	@Test(priority=6)
	@Then("hover on Courses, hover on pg course and select INFORMATION TECHNOLOGY B.SC")
	public void hover_on_courses_hover_on_pg_course_and_select_information_technology_b_sc() {

		test = CreateTest(" Clicked on B.SC INFORMATION TECHNOLOGY   . ");

		test.fail("It navigate to INFORMATION TECHNOLOGY (B.SC)  webpage. But Computer Applications (BCA) course detais showing in web page. ");

		ug.checkBscIT();
	}

	@Test(priority=7)
	@Then("hover on Courses, hover on pg course and select Bcom")
	public void hover_on_courses_hover_on_pg_course_and_select_Bcom() {

		test = CreateTest(" Clicked on Bcom\"   . ");

		test.pass("It is navigate to Commerce(B.Com) webpage. ");

		ug.checkBcom();
	}

	@Test(priority=8)
	@Then("hover on Courses, hover on pg course and select B.Sc Multimedia Webtechnology")
	public void hover_on_courses_hover_on_pg_course_and_select_b_sc_multimedia_webtechnology() {

		test = CreateTest(" Clicked on B.sc Multimedia & WebTechnology.   ");
		test.fail("But it is not navigated to  B.sc Multimedia & WebTechnology webpage. ");
		ug.checkBscMW();
	}

	@Test(priority=9)
	@Then("hover on Courses, hover on pg course and select BIOTECHNOLOGY B.SC")
	public void hover_on_courses_hover_on_pg_course_and_select_biotechnology_b_sc() {

		test = CreateTest(" Clicked on B.sc Biotechnology. ");
		test.pass(" It is navigate to BIOTECHNOLOGY (B.SC)   webpage.  ");
		ug.checkBscBT();
	}

	@Test(priority=10)
	@Then("hover on Courses, hover on pg course and select B.SC Catering Science Hotel Management")
	public void hover_on_courses_hover_on_pg_course_and_select_b_sc_catering_science_hotel_management() {
		test = CreateTest(" Clicked on B.SC Catering Science Hotel Management .   ");
		test.pass("It is navigate to Catering Science Hotel Management B.sc  webpage. ");
		ug.checkBscCSHM();
	}

	@Test(priority=11)
	@Then("hover on Courses, hover on pg course and select ELECTRONICS AND COMMUNICATION SYSTEMS B.SC")
	public void hover_on_courses_hover_on_pg_course_and_select_electronics_and_communication_systems_b_sc() {

		test = CreateTest(" Clicked on B.sc ELECTRONICS AND COMMUNICATION SYSTEMS . ");

		test.pass("It is navatige to ELECTRONICS AND COMMUNICATION SYSTEMS B.sc  webpage.   ");
		ug.checkBscECS();
	}

	@Test(priority=12)
	@Then("hover on Courses, hover on pg course and select MATHEMATICS B.SC")
	public void hover_on_courses_hover_on_pg_course_and_select_mathematics_b_sc() {
		test = CreateTest(" Clicked on B.sc MATHEMATICS  .  ");

		test.pass("It is navigated to MATHEMATICS B.sc  webpage.  ");
		ug.checkBscM();
	}

	@Test(priority=13)
	@Then("hover on Courses, hover on pg course and select ENGLISH LITERATURE B.A")
	public void hover_on_courses_hover_on_pg_course_and_select_english_literature_b_a() {

		test = CreateTest(" Clicked on BA ENGLISH LITERATURE .  ");

		test.pass("It is navigated to ENGLISH LITERATURE BA   webpage.  ");
		ug.checkBaEL();
	}

	@Test(priority=14)
	@Then("hover on Courses, hover on pg course and select BACHELOR OF BUSINESS ADMINISTRATION \\(CA)")
	public void hover_on_courses_hover_on_pg_course_and_select_bachelor_of_business_administration_ca() {

		test = CreateTest(" Clicked on BBA CA .   ");

		test.pass("It is navigated to BACHELOR OF BUSINESS ADMINISTRATION (CA)   webpage. ");
		ug.checkBbaCA();
	}

	@Test(priority=15)
	@Then("hover on Courses, hover on pg course and select B.Sc Psychology")
	public void hover_on_courses_hover_on_pg_course_and_select_b_sc_psychology() {

		test = CreateTest(" Clicked on  B.sc Psychology . ");

		test.fail("It is navigated to B.sc Psychology   webpage. But heading is wrong (defect) showing COMMERCE WITH COMPUTER APPLICATIONS   ");

		ug.checkBscP();
	}

	
	@AfterSuite
	public  void closeBrowser() {
		flushTest();
		System.out.println("Report ug of extent ended.. check reports at target/ExtentReport  ");
		DriversInit.quitDriver();
	}

}
