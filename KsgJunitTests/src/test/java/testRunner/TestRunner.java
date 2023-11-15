package testRunner;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions.KSGonlineAdmissionForm;
import stepDefinitions.KSGonlinePaymentTest;
import stepDefinitions.KSGpgCourseDetails;
import stepDefinitions.KSGugCoursesTest;
import utilities.TestListnersss;


@ExtendWith(TestListnersss.class)
@RunWith(Cucumber.class)
@SuiteClasses({
	KSGonlinePaymentTest.class,
	KSGonlineAdmissionForm.class,
	KSGpgCourseDetails.class,
	KSGugCoursesTest.class,
})
@CucumberOptions(
		 monochrome = true,
		features = "src\\test\\java\\KSGFeatureFiles",
		glue = {"stepDefinitions", "utilities", "testReports","constants",  "KsgJunitTests"},
		plugin = {"pretty", "html:target\\cucumber-Junit-reports\\JunitTest.html"}
		
		)

public class TestRunner  {

	  
	}

	
