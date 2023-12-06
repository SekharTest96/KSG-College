package testRunner;



import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		features = "src\\test\\java\\KSGFeatureFiles",
		glue = {"testSuite", "utilities", "testReports","constants", "resources","KsgTestNGTests"},
		plugin = {"pretty", "html:target\\cucumber-TestNG-reports\\TestNGTest.html"}
		
		)

public class TestRunner {

	   @Test
	   public void runCucumberTests() {
	      // This method is intentionally left blank.
	   }
	}

	

