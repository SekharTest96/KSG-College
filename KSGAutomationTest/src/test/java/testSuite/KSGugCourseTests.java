package testSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageLocatorsRepo.KSGUgCourse;
import testReports.KSGExtentReports;
import utilities.DriversInit;



@Listeners(utilities.TestListners.class)


public class KSGugCourseTests extends KSGExtentReports {

	
	KSGUgCourse course = new KSGUgCourse(DriversInit.getDriver());
	
	
	
	

	@BeforeClass
	public void openBrowser() {
		 reportConfig2();  
		
	}
	
	@Test(priority=1)
	public void selectCourseBCA(){
		
		
		
		test=CreateTest1(" Clicked on BCA .  "); 
		test.pass("It is navigated to  Computer Applications (BCA)  webpage.  ");
		course.hoverOnCourseAndUGCourse(); 
		
	
	}
	
	@Test(priority=2)
	public void selectCourseBcomCA() {
		
		ExtentTest test = CreateTest1(" Clicked on BcomCA.  ");
		test.pass("It do not navigate to COMMERCE WITH COMPUTER APPLICATIONS  webpage.   ");
		course.checkBcomCA();
		
		
	}
	
	@Test(priority=3)
	public void selectCourseBcomPA() {
		
		
		CreateTest1(" Clicked on BcomProfessional  Accounting .It navigate to Bcom Professional Accounting (B.Com(PA))  webpage.  ");
		test.pass("Accounting .It navigate to Bcom Professional Accounting (B.Com(PA))  webpage. ");
		course.checkBcomPA();
		
	}
	
	@Test(priority=4)
	public void selectCourseBscComputerScience() {
		
		CreateTest1(" Clicked on B.SC COMPUTER SCIENCE   . ");
		test.fail("It navigate to COMPUTER SCIENCE (B.SC)  webpage. But Computer Applications (BCA) course detais showing in web page. ");
		
		course.checkBscCS();
		
	}
	
	@Test(priority=5)
	public void selectCourseBscInformationTechnology() {
		
		CreateTest1(" Clicked on B.SC INFORMATION TECHNOLOGY   . ");
		
		test.fail("It navigate to INFORMATION TECHNOLOGY (B.SC)  webpage. But Computer Applications (BCA) course detais showing in web page. ");
		course.checkBscIT();
		
	}
	
	@Test(priority=6)
	public void selectCourseBcom() {
		
		CreateTest1(" Clicked on B.Com .   ");
		test.pass("It is navigated to Commerce(B.Com)  webpage. .  ");
		course.checkBcom();
		
	}
	
	@Test(priority=7)
	public void selectCourseBscMW() {
		
		CreateTest1(" Clicked on B.sc Multimedia & WebTechnology.   ");
		test.fail("But it is not navigated to  B.sc Multimedia & WebTechnology webpage. ");
		course.checkBscMW();
		
	}
	
	@Test(priority=8)
	public void selectCourseBscBT() {
		
		CreateTest1(" Clicked on B.sc Biotechnology. ");
		test.fail(" It is navigate to BIOTECHNOLOGY (B.SC)   webpage.  ");
		course.checkBscBT();
		
	}
	
	@Test(priority=9)
	public void selectCourseBscCSHM() {
		
		CreateTest1(" Clicked on B.SC Catering Science Hotel Management .   ");
		test.pass("It is navigate to Catering Science Hotel Management B.sc  webpage. ");
		course.checkBscCSHM();
		
	}
	
	@Test(priority=10)
	public void selectCourseBscECS() {
		
		CreateTest1(" Clicked on B.sc ELECTRONICS AND COMMUNICATION SYSTEMS . ");
		
		test.pass("It is navatige to ELECTRONICS AND COMMUNICATION SYSTEMS B.sc  webpage.   ");
		course.checkBscECS();
		
	}
	
	@Test(priority=11)
	public void selectCourseBscM() {
		
		CreateTest1(" Clicked on B.sc MATHEMATICS  .  ");
		
		test.pass("It is navigated to MATHEMATICS B.sc  webpage.  ");
		course.checkBscM();
		
	}
	
	@Test(priority=12)
	public void selectCourseBaEL() {
		
		CreateTest1(" Clicked on BA ENGLISH LITERATURE .  ");
		
		test.pass("It is navigated to ENGLISH LITERATURE BA   webpage.  ");
		course.checkBaEL();
		
	}
	
	@Test(priority=13)
	public void selectCourseBbaCA() {
		
		CreateTest1(" Clicked on BBA CA .   ");
		
		test.pass("It is navigated to BACHELOR OF BUSINESS ADMINISTRATION (CA)   webpage. ");
		course.checkBbaCA();
		
	}
	
	@Test(priority=14)
	public void selectCourseBscP() {
		
		CreateTest1(" Clicked on  B.sc Psychology . ");
		
		test.fail("It is navigated to B.sc Psychology   webpage. But heading is wrong (defect) showing COMMERCE WITH COMPUTER APPLICATIONS   ");
		course.checkBscP();
		
	}
	
	@AfterTest
	public void flushReport() {
		
		
		flushTest1();
		DriversInit.quitDriver();
	}
	
	
	
	
	
}
