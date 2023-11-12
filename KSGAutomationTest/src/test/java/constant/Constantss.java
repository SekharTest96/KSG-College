package constant;

import java.io.File;

public class Constantss {

    public static final String KSGHomeUrl = "https://www.ksgcollege.com/";

    public static final String ExtentReports1 = System.getProperty("user.dir") + File.separator + "target" + File.separator + "extentReport1.html";
    public static final String ExtentReports2 = System.getProperty("user.dir") + File.separator + "target" + File.separator + "extentReport2.html";
    public static final String ExtentReports3 = System.getProperty("user.dir") + File.separator + "target" + File.separator + "extentReport3.html";
    public static final String ExtentReports4 = System.getProperty("user.dir") + File.separator + "target" + File.separator + "extentReport4.html";



    public static final String screenshotLocationFail = System.getProperty("user.dir") + File.separator + "scrsFail" + System.currentTimeMillis() + ".png";
    public static final String screenshotLocationSucess = System.getProperty("user.dir") + File.separator + "scrsSucess" + Math.random() + ".jpeg";



    public static final String websiteUrl = "";
}
