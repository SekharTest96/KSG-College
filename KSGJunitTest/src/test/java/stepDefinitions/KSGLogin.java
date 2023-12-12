package stepDefinitions;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import io.cucumber.java.en.Given;
import pageLocatorsRepo.KSGLoginRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGLogin extends KSGExtentReports {

	KSGLoginRepo student = new KSGLoginRepo(DriversInit.getDriver());
	
	KSGLoginRepo staff = new KSGLoginRepo(DriversInit.getDriver());
	
	
	@BeforeAll
	public  void beforeTests() {
		reportLogin();
		System.out.println("Report placement of extent started.. ");

	}
	
	@Test
	@Order(1)
	@Given("Website launched with the URL")
	public void website_launched_with_the_url() {
		test = CreateTest("Website launched with the url");
		test.pass("Website Launched with given url.");

		System.out.println("");
		System.out.println("Website Launched with given url. ");
		System.out.println("");
	}
	
	
	@AfterAll
	public  void FlushReport() {
		flushTest();
		
		System.out.println("Report placement of extent ended.. check reports at target/ExtentReport ");
		DriversInit.quitDriver();
	}

	
}
