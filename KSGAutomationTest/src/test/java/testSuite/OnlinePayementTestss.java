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
import pageLocatorsRepo.OnlinePaymentRepo;
import testReports.KSGExtentReports;
import utilities.DriversInit;


@Listeners(utilities.TestListners.class)



public class OnlinePayementTestss extends KSGExtentReports {
    
    OnlinePaymentRepo pay = new OnlinePaymentRepo(DriversInit.getDriver());
    
    
   
    
	@BeforeClass
	public void openBrowser() {
		reportConfig4();  
		
		
	}
    
    @Test(priority=1)
    public void OnlinePaymentTestWithValidInputs() {
        
    	 reportConfig4(); 
        test = CreateTest1("Submitting online payment form with Valid inputs. "); 
       
        test.pass(" Test passed. Valid Inputs accepted.");
        pay.enterDetailsForOnlinePayment();
       
    }
  
    
    @Test(priority=2)
    public void emptyInputsTest() {
    	
        DriversInit.driver.get("https://www.ksgcollege.com/");
test = CreateTest1("Submitting online payment form without filling details. ");
        
        test.fail("empty Inputs accepted. Test with Empty Inputs test is Failed. ");
        
        pay.emptyInput();
        
        
        
    }

    
    @Test(priority=3)
    public void OnlinePaymentTestwithInvalidInputs() {
    	
        DriversInit.driver.get("https://www.ksgcollege.com/");
        test = CreateTest1("Submitting online payment form with invalid details. ").fail("Test Failed . Invalid Inputs accepted.");
        
        pay.enterDetailsForOnlinePayment1();
      
       
       
       // test.fail(MediaEntityBuilder.createScreenCaptureFromPath(Constantss.screenshotLocationFail).build());
    }
    
    
    

    

    
    @AfterClass
    public void closeBrowser() {
    	
    	
        flushTest1();
        
        DriversInit.quitDriver();

    }
    
   
}
