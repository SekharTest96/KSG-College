package pageLocatorsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.DriversInit;

public class KSGUgCourse {

	public KSGUgCourse(WebDriver driver) {
		PageFactory.initElements( driver, this);
		
		
	}
	
	@FindBy(xpath="(//a[contains(text(), \"Home\")])[1]")WebElement Home;
	@FindBy(xpath="//a[contains(text(), \"Course\")]") WebElement Course;
	@FindBy(how=How.XPATH, using="//a[contains(text(), \"UG Course\")]")WebElement UGcourse;
	@FindBy(xpath="//a[contains(text(), \"B.C.A\")]")WebElement BCA;
	
	@FindBy(xpath="//a[contains(text(), \"B.Com (CA)\")]")WebElement BcomCA;
	
	@FindBy(xpath="//a[contains(text(), \"B.Com (Professional Accounting)\")]")WebElement  BcomPA;
	@FindBy(xpath="//a[contains(text(), \"B.Sc Computer Science\")]")WebElement  BscCS;
	@FindBy(xpath="//a[contains(text(), \"B.Sc Information Technology\")]")WebElement BscIT;
	@FindBy(xpath="(//a[contains(text(), \"B.Com\")])[1]")WebElement Bcom;
	@FindBy(xpath="//a[contains(text(), \"B.Sc Multimedia & Webtechnology\")]")WebElement BscMW ;
	@FindBy(xpath="//a[contains(text(), \"B.Sc Biotechnology\")]")WebElement BscBT;
	@FindBy(xpath="//a[contains(text(), \"B.Sc Catering Science & Hotel Management\")]")WebElement BscCSHM ;
	@FindBy(xpath="//a[contains(text(), \"B.Sc Electronics & Communication Systems\")]")WebElement BscECS;
	@FindBy(xpath="//a[contains(text(), \"B.Sc Mathematics\")]")WebElement BscM ;
	@FindBy(xpath="//a[contains(text(), \"B.A English Literature\")]")WebElement BaEL;
	@FindBy(xpath="//a[contains(text(), \"B.B.A (CA)\")]")WebElement BbaCA;
	@FindBy(xpath="//a[contains(text(), \"B.Sc Psychology\")]")WebElement BscP;
		//@FindBy(xpath="")WebElement ;
		//@FindBy(xpath="")WebElement ;
	
	
	
	
	
	
	public void hoverOnCourseAndUGCourseAndClickBCA() {
		
		
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BCA).build().perform();
		
		boolean Bca = BCA.isEnabled();
		System.out.println("bca enabled -"+Bca);
		 
		BCA.click();
		
		
		String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"Computer Applications (BCA)\")]")).getText();
		System.out.println("title is :"+actualTitle);
		String expectedTitle = "Computer Applications (BCA)";
	    
	    Assert.assertEquals(expectedTitle, actualTitle);
	    System.out.println();
		System.out.println("titles matched..");
		System.out.println();
	   
	    
		System.out.println("Select BCA course test passed.");
	    
	    act.moveToElement(Home).build().perform();
	    Home.click();
	
	}
	
	public void checkBcomCA() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BcomCA).build().perform();
		
		boolean Bcomca = BcomCA.isEnabled();
		System.out.println("bcomCA enabled -"+Bcomca);
		//JavascriptExecutor js =  (JavascriptExecutor) DriversInit.driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",BcomCA);
		BcomCA.click();
		
		
		
		WebElement BcomCaTitle = DriversInit.driver.findElement(By.tagName("h2"));
		String expectedTitle = "COMMERCE WITH COMPUTER APPLICATIONS";
		String actualTitle = BcomCaTitle.getText();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		System.out.println("Select Bcom CA course test passed.");
		
		
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBcomPA() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BcomPA).build().perform();
		
		boolean Bcomca = BcomPA.isEnabled();
		System.out.println("bcomPA enabled -"+Bcomca);
		//JavascriptExecutor js =  (JavascriptExecutor) DriversInit.driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",BcomPA);
		BcomPA.click();
		
		WebElement BcomPaTitle = DriversInit.driver.findElement(By.tagName("h2"));
		String expectedTitle = "Bcom Professional Accounting (B.Com(PA))";
		String actualTitle = BcomPaTitle.getText();
	Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select Bcom PA course test passed.");
		
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBscCS() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BscCS).build().perform();
		//JavascriptExecutor js =  (JavascriptExecutor) DriversInit.driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",BscCS);
		BscCS.click();
		
		WebElement BscCSTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "COMPUTER SCIENCE (B.SC)";
		String actualTitle = BscCSTitle.getText();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		System.out.println("Select Bsc CS course test passed.");
		
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBscIT() {
		
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BscIT).build().perform();
		
		//JavascriptExecutor js =  (JavascriptExecutor) DriversInit.driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", BscIT);
		
		BscIT.click();
		
		WebElement BscITTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "INFORMATION TECHNOLOGY (B.SC)";
		String actualTitle = BscITTitle.getText();
		System.out.println(actualTitle);
		System.out.println();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
	
		System.out.println("Select Bsc IT course test passed.");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBcom() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(Bcom).build().perform();
		//JavascriptExecutor js =  (JavascriptExecutor) DriversInit.driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", Bcom);
		Bcom.click();
		
		WebElement BcomTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "COMMERCE WITH COMPUTER APPLICATIONS";
		String actualTitle = BcomTitle.getText();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select Bcom course test passed.");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBscMW() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BscMW).build().perform();
		BscMW.isEnabled();
		BscMW.isSelected();
		BscMW.isDisplayed();
		BscMW.click();
	
		WebElement BscBTTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "B.Sc Multimedia & Webtechnology";
		String actualTitle = BscBTTitle.getText();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select BscMW course test not showing its WebPage.");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBscBT() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BscBT).build().perform();
		BscBT.isEnabled();
		BscBT.click();
	
		WebElement BscBTTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "BIOTECHNOLOGY (B.SC)";
		String actualTitle = BscBTTitle.getText();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select BscBT course test passed");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBscCSHM() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BscCSHM).build().perform();
		BscCSHM.isEnabled();
		BscCSHM.click();
	
		WebElement BscCSHMTTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "Catering Science Hotel Management";
		String actualTitle = BscCSHMTTitle.getText();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select BscCSHM course test passed");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBscECS() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BscECS).build().perform();
		BscECS.isEnabled();
		BscECS.click();
	
		WebElement BscCSHMTTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "ELECTRONICS AND COMMUNICATION SYSTEMS (B.SC)";

		String actualTitle = BscCSHMTTitle.getText().trim();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select BscECS course test passed");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	
	
	public void checkBscM() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BscM).build().perform();
		BscM.isEnabled();
		BscM.click();
	
		WebElement BscCSHMTTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "MATHEMATICS (B.SC)";
		String actualTitle = BscCSHMTTitle.getText();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select BscM course test passed");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBaEL() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BaEL).build().perform();
		BaEL.isEnabled();
		BaEL.click();
	
		WebElement BaELTitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "ENGLISH LITERATURE (B.A)";
		String actualTitle = BaELTitle.getText();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select BaEL course test passed");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBbaCA() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BbaCA).build().perform();
		BbaCA.isEnabled();
		BbaCA.click();
	
		WebElement BbaCATitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "BACHELOR OF BUSINESS ADMINISTRATION (CA)";
		String actualTitle =BbaCATitle.getText();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select BbaCA course test passed");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
	public void checkBscP() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(UGcourse).build().perform();
		act.moveToElement(BscP).build().perform();
		BscP.isEnabled();
		BscP.click();
	
		WebElement BbaCATitle = DriversInit.getDriver().findElement(By.tagName("h2"));
		String expectedTitle = "B.Sc Psychology";
		String actualTitle =BbaCATitle.getText();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println();
		System.out.println("titles matched..");
		System.out.println();
		
		System.out.println("Select BscP course test passed");
		 act.moveToElement(Home).build().perform();
		    Home.click();
	}
	
}
