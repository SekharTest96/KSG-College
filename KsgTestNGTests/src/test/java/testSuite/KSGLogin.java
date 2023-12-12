package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import pageLocatorsRepo.KSGLoginRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGLogin extends KSGExtentReports {

	KSGLoginRepo student = new KSGLoginRepo(DriversInit.getDriver());
	
	KSGLoginRepo staff = new KSGLoginRepo(DriversInit.getDriver());
	
	
	@BeforeClass
	public  void beforeTests() {
		reportLogin();
		System.out.println("Report placement of extent started.. ");

	}
	
	@Test(priority=1)
	@Given("Website launched with the URL")
	public void website_launched_with_the_url() {
		test = CreateTest("Website launched with the url");
		test.pass("Website Launched with given url.");

		System.out.println("");
		System.out.println("Website Launched with given url. ");
		System.out.println("");
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
