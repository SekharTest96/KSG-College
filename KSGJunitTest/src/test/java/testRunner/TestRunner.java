package testRunner;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions.CollegeModule;
import stepDefinitions.KSGCampus;
import stepDefinitions.KSGContact;
import stepDefinitions.KSGDonation;
import stepDefinitions.KSGFacilities;
import stepDefinitions.KSGGallery;
import stepDefinitions.KSGNirf;
import stepDefinitions.KSGServiceModule;
import stepDefinitions.KSGonlineAdmissionForm;
import stepDefinitions.KSGonlinePaymentTest;
import stepDefinitions.KSGpgCourseDetails;
import stepDefinitions.KSGugCoursesTest;
import stepDefinitions.PlacementModule;
import stepDefinitions.SocialMediaLinks;
import utilities.TestListnersss;


@Suite
@ExtendWith(TestListnersss.class)
@RunWith(Cucumber.class)
@SelectClasses({
	CollegeModule.class,
	KSGCampus.class,
	KSGContact.class,
	KSGDonation.class,
	KSGFacilities.class,
	KSGGallery.class,
	KSGNirf.class,
	KSGonlineAdmissionForm.class,
	KSGonlinePaymentTest.class,
	KSGpgCourseDetails.class,
	KSGServiceModule.class,
	KSGugCoursesTest.class,
	PlacementModule.class,
	SocialMediaLinks.class
})
@CucumberOptions(
		
		features = "src\\test\\java\\KSGFeatureFiles",
		glue = {"stepDefinitions", "utilities", "testReports","constants",  "KsgJunitTest"},
		plugin = {"pretty", "html:target\\cucumber-Junit-reports\\JunitTest.html"}
		
		)




public class TestRunner {
    // This class is empty; it serves only as a holder for the above annotations.
}

	

