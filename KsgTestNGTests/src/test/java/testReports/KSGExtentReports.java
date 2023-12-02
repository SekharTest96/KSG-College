package testReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import constants.Constantss;

public class KSGExtentReports {

	public static ExtentReports extent;

	public ExtentTest test;

	public static void reportPay() {

		String path = Constantss.extntReportOnlinePayment;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportReg() {

		String path = Constantss.extntReportRegistrationForm;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportUg() {

		String path = Constantss.extntReportUgCourse;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportPg() {

		String path = Constantss.extntReportPgCourse;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportCM() {

		String path = Constantss.extntReportCollegeModule;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportPlacement() {

		String path = Constantss.extntReportPlacementModule;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportService() {

		String path = Constantss.extntReportService;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportGallery() {

		String path = Constantss.extntReportGallery;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportFacilities() {

		String path = Constantss.extntReportFacilities;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportCampus() {

		String path = Constantss.extntReportCampus;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportNirf() {

		String path = Constantss.extntReportNirf;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportContact() {

		String path = Constantss.extntReportContact;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public static void reportDonation() {

		String path = Constantss.extntReportDonation;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("KSG College Automation Testing");
		reporter.config().setDocumentTitle("KSG College Automation Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("S Ramana Sekhar", "Tester");

	}

	public ExtentTest CreateTest(String testName) {
		return extent.createTest(testName);
	}

	public static void flushTest() {
		extent.flush();

	}
}
