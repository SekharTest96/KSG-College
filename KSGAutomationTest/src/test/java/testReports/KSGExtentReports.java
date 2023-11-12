package testReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import constant.Constantss;

public class KSGExtentReports extends Constantss {

    public static ExtentReports extent;

   public ExtentTest test;
    
    

    public static void reportConfig1() {
        String path = Constantss.ExtentReports1;
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setTheme(Theme.STANDARD);
        reporter.config().setReportName("KSG College Automation Testing");
        reporter.config().setDocumentTitle("KSG College Automation Test Results");
        extent = new ExtentReports(); 
        extent.attachReporter(reporter);  
        extent.setSystemInfo("S Ramana Sekhar", "Tester");
    }
    
    public static void reportConfig2() {
        String path = Constantss.ExtentReports2;
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setTheme(Theme.STANDARD);
        reporter.config().setReportName("KSG College Automation Testing");
        reporter.config().setDocumentTitle("KSG College Automation Test Results");
        extent = new ExtentReports(); 
        extent.attachReporter(reporter);  
        extent.setSystemInfo("S Ramana Sekhar", "Tester");
    }

    
    public static void reportConfig3() {
        String path = Constantss.ExtentReports3;
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setTheme(Theme.STANDARD);
        reporter.config().setReportName("KSG College Automation Testing");
        reporter.config().setDocumentTitle("KSG College Automation Test Results");
        extent = new ExtentReports(); 
        extent.attachReporter(reporter);  
        extent.setSystemInfo("S Ramana Sekhar", "Tester");
    }

    
    public static void reportConfig4() {
        String path = Constantss.ExtentReports4;
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setTheme(Theme.STANDARD);
        reporter.config().setReportName("KSG College Automation Testing");
        reporter.config().setDocumentTitle("KSG College Automation Test Results");
        extent = new ExtentReports(); 
        extent.attachReporter(reporter);  
        extent.setSystemInfo("S Ramana Sekhar", "Tester");
    }


             public ExtentTest CreateTest1(String testName) {
		return extent.createTest(testName);
	}
	
	public static void flushTest1() {
		extent.flush();
	
		
	}
}
