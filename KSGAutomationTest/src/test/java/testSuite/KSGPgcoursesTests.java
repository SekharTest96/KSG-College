package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import constant.Constantss;
import pageLocatorsRepo.KSGPgcourses;
import testReports.KSGExtentReports;
import utilities.DriversInit;


@Listeners(utilities.TestListners.class)



public class KSGPgcoursesTests extends KSGExtentReports {

	KSGPgcourses course = new KSGPgcourses(DriversInit.getDriver());

	

	// Now you can use extentReport to create tests, log information, and flush the reports.

	
	
	
	@BeforeClass
	public void openBrowser() {
		
		reportConfig1();  
		
	}
	
	@Test(priority=1)
	public void selectMaEl() {
		
		
		
		  test =  CreateTest1("  Clicked on M.A English Literature . ").fail(" But it do not navigate to M.A English Literature  webpage. So Test is Failed. ");;
		
		course.hoverOnCourseAndPGCourseAndSelectMAel();
	
	}
	
	@Test(priority=2)
	public void selectMscIT() {
		
		  test =  CreateTest1(" Clicked on M.Sc Information Technology .").fail(" But it do not navigate to  M.Sc Information Technology  webpage. So Test is Failed. ");
		
		course.checkMscIT();
		
		 
		
	}
	
	@Test(priority=3)
	public void selectMscM() {
		
		 test = CreateTest1(" Clicked on M.Sc Mathematics . ");
		 test.fail(" But it do not navigate to  M.Sc  Mathematics  webpage. So Test is Failed. ");
		course.checkMscM();
		
			
		
	}
	
	@Test(priority=4)
	public void selectMscB() {
		
		 test =  CreateTest1(" Clicked on M.Sc Biotechnology . ").fail(" But it do not navigate to  M.Sc Biotechnology  webpage. So Test is Failed. ");;
		 
		
		 course.checkMscB();
		 
		
	}
	
	@Test(priority=5)
	public void selectMcomCA() {
		
		
		 test = CreateTest1(" Clicked on M.Com (CA) . ");
		 test.fail(" But it do not navigate to  M.Com (CA)  webpage. So Test is Failed. ");
		course.checkMcomCA();
		
	}
	
	@Test(priority=6)
	public void selectMcom1B() {
		 test = CreateTest1(" Clicked on M.Com (IB) . ");
		 test.fail(" But it do not navigate to  M.Com (IB)  webpage. So Test is Failed. ");
		course.checkMcom1B();
		
	}
	
	@Test(priority=7)
	public void selectMphilTamil() {
		
		 test = CreateTest1(" Clicked on  MPhil Tamil . ");
		 test.fail(" But it do not navigate to MPhil Tamil  webpage. So Test is Failed. ");
		course.checkMphilTamil();
		
	}
	
	@Test(priority=8)
	public void selectMPhilCS() {
		
		 test = CreateTest1(" Clicked on MPhil Computer Science .");
		 test.fail(" But it do not navigate to  MPhil Computer Science   webpage. So Test is Failed. ");
		
		course.checkMPhilCS();
		
	}
	
	@Test(priority=9)
	public void selectPhdCS() {
		test =  CreateTest1(" Clicked on Ph.D Computer Science . ").fail(" But it do not navigate to  Ph.D Computer Science  webpage. So Test is Failed. ");
		
		
		
		course.checkPhdCS();
		
		 
		
		
	}
	
	
	
	
	@AfterClass
	public void closeBrowser() {
		
		test.info("All tests failed because For every course selected in PG Course have no specific webpage."
				+ "(not navigating to a specific  Webpage. when click on a particular PG Course.");
		
		System.out.println("All tests failed because For every course selected in PG Course have no specific webpage. (not navigating to a specific \r\n"
				+ "	 Webpage.");
		
		
		flushTest1();
		
		DriversInit.quitDriver();
		
	}
	
	
	
	/* All tests failed because For every course selected in PG Course have no specific webpage. (not navigating to a specific 
	 * Webpage. )*/
	
}
