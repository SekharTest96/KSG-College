package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import constants.Constantss;

public class TestListnersss implements TestWatcher {

    @Override
	public void testDisabled(ExtensionContext context, Optional<String> reason) {
        TestWatcher.super.testDisabled(context, reason);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        TestWatcher.super.testSuccessful(context);

        System.out.println(" ");

        String ScreenShotPath = Constantss.srcSucess;
        TakesScreenshot srcshot = (TakesScreenshot) DriversInit.getDriver();
        File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
        File Dest = new File(ScreenShotPath);
        try {
            FileUtils.copyFile(srcFile, Dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("This test is successful. Its screenshot is kept in " + ScreenShotPath + " is success. ");
        System.out.println(" ");
    }

    @Override
    public  void testAborted(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testAborted(context, cause);
    }

    @Override
    public  void testFailed(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testFailed(context, cause);

        System.out.println(" ");

        String ScreenShotPath = Constantss.srcFail;
        TakesScreenshot srcshot = (TakesScreenshot) DriversInit.getDriver();
        File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
        File Dest = new File(ScreenShotPath);
        try {
            FileUtils.copyFile(srcFile, Dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("This test is failed. Its screenshot is kept in " + ScreenShotPath + " is success. ");
        System.out.println(" ");
    }
}
