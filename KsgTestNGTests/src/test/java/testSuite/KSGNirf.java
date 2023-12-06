package testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class KSGNirf extends KSGExtentReports {

	@BeforeSuite
	public void beforeTests() {
		reportNirf ();
		System.out.println("Report Nirf  of extent started.. ");

	}

	@Test(priority = 1)

	@Given("Website launched with the url")

	public void website_launched_with_the_url() {
		test = CreateTest("Website launched with the url");
		test.pass("Website Launched with given url.");

		System.out.println("");
		System.out.println("Website Launched with given url. ");
		System.out.println("");
	}

	@AfterSuite
	public void FlushReport() {
		flushTest();
		System.out.println("Report Nirf  of extent ended..  check reports at target/ExtentReport   ");
		DriversInit.quitDriver();
	}
}
