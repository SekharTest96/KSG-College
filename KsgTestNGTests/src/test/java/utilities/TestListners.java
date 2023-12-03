package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import constants.Constantss;

public class TestListners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("On Test Start - "+result.getName());
		System.out.println(" ");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("On Test Sucess.."+result.getName());
		
		System.out.println(" ");
		
		String ScreenShotPath = Constantss.srcSucess;
		TakesScreenshot srcshot = (TakesScreenshot) DriversInit.getDriver();
		File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
		File Dest = new File (ScreenShotPath );
		try {
			FileUtils.copyFile(srcFile, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("This test is failed. its screenshot is kept in "+ScreenShotPath + " is sucess. ");
		System.out.println(" ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println(" On Test Fail - "+result.getName());
		System.out.println(" ");
		String ScreenShotPath = Constantss.srcFail;
		TakesScreenshot srcshot = (TakesScreenshot) DriversInit.getDriver();
		File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
		File Dest = new File (ScreenShotPath );
		try {
			FileUtils.copyFile(srcFile, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("This test is failed. its screenshot is kept in "+ScreenShotPath + " is failed. ");
		System.out.println(" ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(""+result.getName());
		System.out.println(" ");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println(""+result.getName());
		System.out.println(" ");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println(""+result.getName());
		System.out.println(" ");
	}

	@Override
	public void onStart(ITestContext context) {
	
		System.out.println(""+context.getName());
		System.out.println(" ");
	}

	@Override
	public void onFinish(ITestContext context) {
	
		System.out.println(""+context.getName());
		System.out.println(" ");
	}

}
