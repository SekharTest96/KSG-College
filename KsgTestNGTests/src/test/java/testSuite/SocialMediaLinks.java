package testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLocatorsRepo.SocialMediaLinksRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;

public class SocialMediaLinks  extends KSGExtentReports {

	
	SocialMediaLinksRepo  socialMedia = new SocialMediaLinksRepo (DriversInit.getDriver());
	
	
	@BeforeClass
	public  void beforeTests() {
		reportSocialMedia();
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
	
	@Test(priority=2)
	@Then("Hover on facebook icon1 and click on facebook icon1")
	public void Hover_on_facebook_icon1_and_click_on_facebook_icon1l() {
		test = CreateTest("Hover on facebook icon1 and click on facebook icon1");
		test.pass("clicked on facebook icon1");

		socialMedia.checkFacebook1Link();
	
	}
	

	@Test(priority=3)
	@Then("KSGCollege Facebook page is displayed")
	public void KSGCollege_Facebook_page_should_display1() {
		test = CreateTest("KSGCollege Facebook page should display");
		test.pass("KSGCollege Facebook page is displayed.");

	
	}
	
	@Test(priority=4)
	@Then("Hover on facebook icon2 and click on facebook icon2")
	public void Hover_on_facebook_icon2_and_click_on_facebook_icon2() {
		test = CreateTest("Hover on facebook icon1 and click on facebook icon2");
		test.pass("clicked on facebook icon");

		socialMedia.checkFacebook2Link();
	
	}
	

	@Test(priority=5)
	@Then("KSGCollege Facebook page should display")
	public void KSGCollege_Facebook_page_should_display2() {
		test = CreateTest("KSGCollege Facebook page should display");
		test.fail("KSGCollege Facebook page is not displayed. It is navigating to homepage");

		
	}
	
	@Test(priority=6)
	@Then("Hover on youtube icon and click on youtube icon")
	public void Hover_on_youtube_icon_and_click_on_youtube_icon() {
		test = CreateTest("Hover on youtube icon and click on youtube icon");
		test.pass("clicked on youtube icon");

		socialMedia.checkYoutube();
	
	}
	
	
	@Test(priority=7)
	@Then("KSGCollege youtube page should display")
	public void KSGCollege_youtube_page_should_display() {
		test = CreateTest("KSGCollege youtube page should display");
		test.pass("KSGCollege youtube page is displayed");

		
	}
	

	@Test(priority=8)
	@Then("Hover on instagram icon1 and click on instagram icon1")
	public void Hover_on_instagram_icon1_and_click_on_instagram_icon1l() {
		test = CreateTest("Hover on instagram icon1 and click on instagram icon1");
		test.pass("clicked on instagram icon1");

		socialMedia.checkInstagram1Link();
	
	}
	

	@Test(priority=9)
	@Then("KSGCollege Facebook page is displayed")
	public void KSGCollege_instagram_page_should_display1() {
		test = CreateTest("KSGCollege instagram page should display");
		test.pass("KSGCollege instagram page is displayed.");

		
	}
	
	@Test(priority=10)
	@Then("Hover on instagram icon2 and click on instagram icon2")
	public void Hover_on_instagram_icon2_and_click_on_instagram_icon2() {
		test = CreateTest("Hover on instagram icon1 and click on instagram icon2");
		test.pass("clicked on instagram icon");
		socialMedia.checkInstagram2Link();
	
	}
	

	@Test(priority=11)
	@Then("KSGCollege instagram page should display")
	public void KSGCollege_instagram_page_should_display2() {
		test = CreateTest("KSGCollege instagram page should display");
		test.fail("KSGCollege instagram page is not displayed. It is navigating to homepage");

		
	}
	
	@Test(priority=12)
	@Then("Hover on twitter icon and click on twittericon")
	public void Hover_on_twitter_icon_and_click_on_twitter_icon() {
		test = CreateTest("Hover on twitter icon and click on twitter icon");
		test.pass("clicked on twitter icon");
		
		socialMedia.checktwitterLink();
	
	}
	
	
	@Test(priority=13)
	@Then("KSGCollege twitter page should display")
	public void KSGCollege_twitter_page_should_display() {
		test = CreateTest("KSGCollege twitter page should display");
		test.fail("KSGCollege twitter page is not displayed. It is navigating to homepage");

		
		
	}
	
	@Test(priority=14)
	@Then("Hover on Google Plus icon and click on Google Plusicon")
	public void Hover_on_Google_Plus_icon_and_click_on_Google_Plus_icon() {
		test = CreateTest("Hover on Google Plus icon and click on Google Plus icon");
		test.pass("clicked on Google Plus icon");

		socialMedia.checkGooglePlusLink();
	
	}
	
	
	@Test(priority=15)
	@Then("KSGCollege Google Plus page should display")
	public void KSGCollege_Google_Plus_page_should_display() {
		test = CreateTest("KSGCollege Google Plus page should display");
		test.fail("KSGCollege Google Plus page is not displayed. It is navigating to homepage");

		
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
